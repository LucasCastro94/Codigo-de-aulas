#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main()
{
 float somanumero(float num1,float num2);
   float a,b,soma ;

   printf("\nDigite 2 numeros:");
   scanf ("%f",&a);
    scanf ("%f",&b);

    soma = somanumero (a,b);

     printf("\nSoma eh: %.2f",soma);


    return 0;
}

float somanumero(float num1 ,float num2)
{
    float valorABS (float x);

    if (num1<0)
    {
        num1= valorABS(num1);
    }
    if (num2<0)
    {
        num2=valorABS(num2);
    }

    return num1+num2;
}

float valorABS (float x)
    {


        return x*=-1;
    }


