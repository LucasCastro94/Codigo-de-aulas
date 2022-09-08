#include <stdio.h>
#include <stdlib.h>
float numerico [500];
char string[30][600];
int num[500];
int  k=0,i,buscaid,acho=0, op;
FILE *ptr;


struct Dados
{
 int id[5];
 char nome[5][30];
 float preco[5];


}geral;






cad()
{
  fflush(stdin);
  printf("Infome nome do produto:");
  fgets(geral.nome[k],30,stdin);

  fflush(stdin);

  printf("Infome o ID do produto:");
  scanf("%d",&geral.id[k]);

   fflush(stdin);

  printf("Infome o preco do produto:");
  scanf("%f",&geral.preco[k]);
  k++;

  printf("\nCadastro concluido com sucesso!\n"); system("pause");
   system("cls");

}

Search()
{
    fflush(stdin);
   system("cls");
   printf("\nInforme o ID para busca:");
   scanf("%d",&buscaid);

   for(i=0;i<6;i++)
   {
       if(buscaid==geral.id[i])
       {
         acho = 1;

           printf("\nNome:%sId:%d  \nPreco:$%.2f\n",geral.nome[i],geral.id[i],geral.preco[i]);

           printf("\nPressione alguma tecla para continuar...");
    getch();
            system("cls");
             break;

       }


   }
    if(acho==0)
    {    system("cls");

        printf("\nProduto nao encontrado..\n\n\n");
        system("pause");
         system("cls");

        return(1);
    }
}

//saida de dados
entrada()
{      system("cls");
       for(i=0;i<k;i++)
  {

   printf("\nProduto:%s   ID:%d\nPreco:%.2f\n",geral.nome[i],geral.id[i],geral.preco[i]);

  }
    printf("\n\n");
    system("pause");
    system("cls");
}


read()
{   for(i=0;i<6;i++)
   {


    fread(string[i],sizeof(string[i]),1,ptr);
    fread(num[i],sizeof(num[i]),1,ptr);
    fread(numerico,sizeof(numerico),1,ptr);
    printf("%s %d %.2f",string[i],num[i],numerico[i]);

    }
}


grava()
{

 for(i=0;i<k;i++)
 {
     fprintf(ptr,"Nome:%sID:%d\nPreco:%.2f\n\n",geral.nome[i],geral.id[i],geral.preco[i]);
 }



 printf("\nDados gravados com sucesso..\n\n");
 printf("\nDigite qualquer tecla para continuar");
 getch();
}




int main()
{
   fflush(stdin);
   fflush(stdout);
    ptr = fopen("Savedados.txt","a");



     do{
    printf("\n1-Cadastro..");
     printf("\n2-Localizar cadastro..");
      printf("\n3-Gravar cadastros em binario..");
       printf("\n4-ver cadastro gravados..");
        printf("\n5-ver entradas atuais");
        printf("\n6-EXIT");

         printf("\n-----------------------------------------------\nOPCAO:");


         scanf("%d",&op);


         switch(op)
         {
            case 1: system("cls");
 cad();
            break;

            case 2: Search();
            break;

            case 3: grava();
                break;

            case 4: read();
                break;

            case 5: entrada();
                break;

            case 6: exit(1);
                break;



             default: {system("cls");printf("Opcao invalidade tente novamente\n\n"); system("pause");system("cls"); }
         }
}while(op!=6);

fclose(ptr);

    return 0;
}


