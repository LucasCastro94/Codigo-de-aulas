#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{setlocale (LC_ALL,"");
    int vezes,i;
    float media=0, nota[5], peso[5], guarda_nota[5];

    printf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\t\t\t\tPROGRAMA PARA CALCULAR MEDIA PONDERADA\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    printf("\n\nQUANTAS NOTAS S�O:");
    scanf ("%d",&vezes);
system("cls");
    for (i=0;i<vezes;i++)

    {
        printf("\nDigite a %d� nota:",i+1);
        scanf ("%f",&nota[i]);

        printf("Digite o peso refente a %d� nota (Ex: 0,1..1 ):",i+1);
        scanf ("%f",&peso[i]);

        guarda_nota[i] = nota[i]*peso[i];

        media=media+guarda_nota[i];
    }
    printf("\n\n");


     for (i=0;i<vezes;i++)
    {
        printf("\nNOTA COM PESO REF. %d�NOTA = %.2f",i+1,guarda_nota[i]);

    }



printf("\n--------------------------------------------");
printf("\nMEDIA FINAL = %.2f\n\n\n",media);





    return 0;
}
