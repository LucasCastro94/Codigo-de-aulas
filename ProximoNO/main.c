#include <stdio.h>
#include <stdlib.h>

typedef struct ponto
{
    char nome[20];
    int peso;

    struct ponto *proximo;
}ponto;

int op;

int main()
{

ponto * ini_ponto;
ponto * proximo_ponto;

ini_ponto = (ponto*)malloc(sizeof(ponto));

proximo_ponto=ini_ponto;

 while(1)
    {


        printf("\nNOME: ");
        scanf("%s",&proximo_ponto->nome);

         printf("\nPESO: ");
         scanf("%d",&proximo_ponto->peso);

         printf("\n\nSTOP = 1...");
         scanf("%d",&op);


        if (op==1)
        {
            break;
        }

         proximo_ponto->proximo = (ponto*)malloc(sizeof(ponto));
         proximo_ponto =  proximo_ponto->proximo;
    }


     proximo_ponto->proximo = NULL;
     proximo_ponto = ini_ponto;

    while(proximo_ponto!=NULL)
         {
             printf ("\n%s  %d",proximo_ponto->nome,proximo_ponto->peso);
             proximo_ponto=proximo_ponto->proximo;}

return 0;}



/*int main()
{
    nop *inicio, *no_proximo;

    inicio = NULL;
    no_proximo = NULL;

 int op;

    while(1)
    {
        inicio = (nop*)malloc(sizeof(nop));

        printf("\nNOME: ");
        scanf("%s",&inicio->nome);

         printf("\nPESO: ");
         scanf("%d",&inicio->peso);

         printf("\n\nSTOP = 1...");
         scanf("%d",&op);

         no_proximo=inicio;
         inicio->proximo=NULL;

        if (op==1)
        {
            break;
        }



    }


       while(inicio!=NULL)
         {
             printf

("\n%s  %d",inicio->nome,inicio->peso);
             inicio=inicio->proximo;
         }

 return 0;
}
*/
