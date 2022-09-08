#include <stdio.h>
#include <stdlib.h>

int main()
{   int op;
float x,y;
float i,j=0;

float percen, amostragem;
    printf("1- Sistematico");
    printf("\n2- nao sei");
    printf("\n3-Opcao:");
    scanf("%d",&op);

    if (op==1)
    {
        printf("\nEm uma empresa de produção de cadeiras foram fabricadas 1000 cadeiras dessas fabricadas o gerente quer uma amostra de X%% de toda producao e de quanto em quanto sera a amostragem de Y");
        printf("\nX=?:");
        scanf("%f",&x);
        printf("\nY=?:");
        scanf("%f",&y);

        percen = (x/100)*1000;

        amostragem = ( 1000/percen);

        for(i=0;i<amostragem;i++)
        {

          for(j=0;j<=1000;j++)
            {


          printf("\n%f",j);



        }
    }
    }

    if(op==2)
    {

    }

    return 0;
}
