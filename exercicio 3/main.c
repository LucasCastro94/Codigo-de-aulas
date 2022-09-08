#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
setlocale(LC_ALL, "");
float preco;
char ness_refri[5],categoria[2];
    printf("informe o preço unitario da refrigeração:\n");
    scanf("%f",&preco);
fflush(stdin);
    printf("Esse produto necessita de refrigeração?(SIM) ou (NAO):\n");
    fgets(ness_refri,4,stdin);

    printf("\nQual categoria? (A, L OU V):");
    fgets(categoria,2,stdin);

    if (preco>=50 && categoria==t"a"){preco=preco+70;}


    printf("\no valor é de : %f",preco);





}
