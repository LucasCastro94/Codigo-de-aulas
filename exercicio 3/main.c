#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
setlocale(LC_ALL, "");
float preco;
char ness_refri[5],categoria[2];
    printf("informe o pre�o unitario da refrigera��o:\n");
    scanf("%f",&preco);
fflush(stdin);
    printf("Esse produto necessita de refrigera��o?(SIM) ou (NAO):\n");
    fgets(ness_refri,4,stdin);

    printf("\nQual categoria? (A, L OU V):");
    fgets(categoria,2,stdin);

    if (preco>=50 && categoria==t"a"){preco=preco+70;}


    printf("\no valor � de : %f",preco);





}
