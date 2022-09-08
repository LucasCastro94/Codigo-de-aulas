#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#include <locale.h>

int op,i, x=0, xx=0;
char produtos[10][25]={"Banana","Maça","melancia","Pera","Limao","Laranja"};
int obt_cod, achou=0;
float obt_peso;
char cpfnota[20];
char  simOunao ;
double p_davenda[10];

int retorna;



typedef struct Entrada
{

int cod_produt[10];

float Estoque_cod[10];

double preco[10];

char cpf[10][20];


};

struct Entrada dados;
int cod_produt[10]={111,222,333,444,555,666,777};

float Estoque_cod[10]={100000,50000,150000,50000,50000,60000,98000};

double preco[10]={4/1000,3.50/1000,8/1000,7/1000,1.99/1000,3/1000};

char cpf[10][11]={};



////////////////////////////////////////////////////////////////////////////////


vendas()
{
    fflush(stdin);
    printf("\nCpf na nota(s/n)?..");
   scanf("%c",&simOunao);



    if(simOunao == 's')
    {
        fflush(stdin);
       printf("\nInforme o CPF:");
       scanf("%s",&cpfnota);
        strcpy(cpf[x],cpfnota);
    }







 do{

   achou=0;
   printf("\nInforme o cod do prod ou 0 finalizar vendas.. ");
   scanf("%d",&obt_cod);

   if (obt_cod==0)

   {  achou=0;
   system("cls");
   return 1;   }

   for(i=0;i<10;i++)
   {


     if(obt_cod==cod_produt[i])
     {

        achou=1;
         printf("\nProduto localizado %s",produtos[i]);
        printf("\nPeso em gramas... ");
        scanf("%f",&obt_peso);




            if(obt_peso>Estoque_cod[i])
                {
                   printf("\nEstoque indisponivel quantidade atual %.2f Kilogramas\n",Estoque_cod[i]);
                   system ("pause");
                }
                else
                {
                    Estoque_cod[i] = (Estoque_cod[i] - obt_peso);
                    p_davenda[x] = (preco[i]*obt_peso);
                    printf("\nVenda Registrada com sucesso!\n-------------------------------");
                    x++;

                }


   }
   }//fim for

}while(achou!=0);

   if(achou==0)
   {
       printf("\nCodigo do produto não encontrado!!\n\n"); system("pause"); system("cls");
   }








} //fim venda




vcodigos()
{
    for(i=0;i<6;i++)
    {
        printf("\nProduto:%s----------Cod:%d\n",produtos[i],cod_produt[i]);

    };
    printf("\n");
    system("pause");
    system("cls");

}






estoque()
{

}






lista()
{

}





int main()
{
    do{
    setlocale(LC_ALL,"");
    printf("\n\t\t\t--------------------------------------------------------------------");
    printf("\n\t\t\t------------------------HORTIFRUTI DO LUCAS-------------------------");
    printf("\n\t\t\t--------------------------------------------------------------------");
    printf("\n1- Efetuar venda");
    printf("\n2- Ver codigos dos produtos");
    printf("\n3- Conferir estoque");
    printf("\n4- Lista de vendas");
    printf("\n5- Sair");
    printf("\n\nOPÇÃO:");
    scanf("%d",&op);

   switch(op)
   {
   case 1: vendas();
    break;

   case 2: vcodigos();
    break;


   case 3:
    break;

   case 4:
    break;

   case 5:
    break;

   default:
    printf("\nOpção invalida verifique o numero digitado..\n\n");
    system("pause");
    system("cls");
   }

    }while(op!=5);



    return 0;
}
