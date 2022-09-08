#include <stdio.h>
#include <stdlib.h>

int main()
{

  int vetor[10]={1,0,2,4,3,5,6,7,9,8},i;
void retorna(int vetor[], int n );

retorna(vetor,10);

for(i=0;i<10;i++)
{
    printf(" %d ",vetor[i]);
}

    return 0;
}

void retorna(int vetor[], int n )
{
    int i,j,temp;

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(vetor[i]>vetor[j])
            {
                temp = vetor[i];
                vetor[i]=vetor[j];
                vetor[j]=temp;
            }
        }
    }
}
