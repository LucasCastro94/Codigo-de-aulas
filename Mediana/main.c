#include <stdio.h>
#include <stdlib.h>


//ACHAR MEDIANA DE UM CONJUNTO DE NUMEROS

int main()
{

    int i,j=0;
    float num[50],a;
    int divide,divide1;
    int sequencia;
    float soma,media_g=0;

    float maiorA=0, menorA=9999;


    float moda[2], maior=
    0;








    printf("\nValor da sequencia numerica:");
    scanf("%d",&sequencia);

    int cont[sequencia];

    for(i=0; i<sequencia; i++)
    {
        cont[i]=0;
    }

    for(i=0; i<sequencia; i++)
    {
        printf("\nDigite Numero[%d]:",i+1);
        scanf("%f",&num[i]);

        if(num[i]>maiorA)
        {
            maiorA=num[i];
        }
        if(num[i]<menorA)
        {
menorA=num[i];
        }

        for(j=0; j<sequencia; j++)
        {


            if(num[j]==num[i])
            {
                cont[i]=cont[i]+1;



                if(cont[i]>maior)
                {
                    maior=cont[i];

                    moda[0]=num[i];

                }

                if((cont[i]== maior) && ( num[i] != moda[0]))
                {

                    moda[1]=num[i];


                }


            }
        }


        media_g=media_g+num[i];

    }

    media_g= media_g / sequencia;




    for(i=0; i<sequencia; i++)
    {
        for(j=i+1; j<sequencia; j++)
        {
            if(num[i]>num[j])
            {
                a = num[i];
                num[i]=num[j];
                num[j]=a;
            }
        }
    }


    for(i=0; i<sequencia; i++)
    {
        printf("\n%.2f",num[i]);

    }
     printf("\n");

    if(sequencia %2 == 0)
    {
        divide = (sequencia / 2)-1;
        divide1 = (sequencia/2);

        soma = ((num[divide]+num[divide1])/2);
        printf("\nMediana = %.2f",soma);


    }
    else
    {

        divide = (sequencia + 1) / 2;

        printf("\nMediana = %.1f",num[divide-1]);


    }

    printf("\nMedia = %.2f",media_g);

    if(moda[0]!= moda[1] )
    {   printf("\nModa 1 = %.2f",moda[0]);
        printf("\nModa 2 = %.2f",moda[1]);
        printf("\nBIMODAL");
        printf("\nAmplitude = %.2f",maiorA-menorA);
    }
    else
       {

       printf("\nModa = %.2f",moda[0]);
        printf("\nAmplitude = %.2f",maiorA-menorA);
       }
    return 0;
}
