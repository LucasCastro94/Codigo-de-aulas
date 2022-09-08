#include <stdio.h>
#include <stdlib.h>


typedef struct no
{
    char nome[20];
    int idade;

    struct no *next;
}no;

no *inicio, *corrente, *auxiliar;

enterdata()
{
  printf("\nInforme o nome:");
  scanf("%s",&corrente->nome);
  printf("\nInforme a idade:");
  scanf("%d",&corrente->idade);

}
inserir()
{
   if(inicio==NULL)
   {
       corrente=(no*)malloc(sizeof(no));
       inicio=corrente;
       auxiliar=corrente;
       corrente->next=NULL;
       enterdata();
   }
   else
    {
    corrente=(no*)malloc(sizeof(no));
    auxiliar->next=corrente;
    corrente->next=NULL;
    auxiliar=corrente;
    enterdata();



    }

}

visualizar()
{
    corrente=inicio;


    while(corrente!=NULL)
    {
        printf("\n%s %d",corrente->nome,corrente->idade); //getch();
        corrente=corrente->next;
    }
}

int main()
{

inicio=NULL;
corrente=NULL;
auxiliar=NULL;
int op;

do{
system("cls");
 printf("\n[1]Inserir novo usuario");
 printf("\n[2]Visualizar todos usuario");
 printf("\n[6]Exit");
 printf("\nEscolha:");
scanf("%d",&op);

switch(op)
{

case 1:
    inserir();
    break;

case 2:
    visualizar(); getch();
    break;



}



}while(op!=6);




};
