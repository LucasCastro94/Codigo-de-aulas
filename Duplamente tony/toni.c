#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct no
{

    char nome[20];
    int idade;

    struct no *next,*back;

} no;

struct no *corrente,*auxiliar,*fim,*inicio,*auxiliar2;

void enterdata()
{

    printf("\n Informe o nome da Pessoa");
    scanf("%s",&corrente->nome);
    printf("\n Informe a idade da pessoa");
    scanf("%d",&corrente->idade);
}

void pesquisa()
{
    char pesq[20];
    int achou,i;
    if(inicio == NULL)
    {
        printf("\n Lista Vazia...");
        system("pause");
    }
    else
    {
        printf("\n Informe o nome a ser Pesuisado");
        scanf("%s",&pesq);
        achou =0;
        i=0;
        auxiliar =inicio;

        while(auxiliar != NULL)
        {
            i++;
            if(strcmp(pesq,auxiliar->nome)==0)
            {
                printf("\n Nome encontrado na Lista %d",i);
                system("pause");
                achou=1;
                break;
            }
            else
            {
                auxiliar =auxiliar->next;
            }
        }
    }

    if (achou ==0)
    {
        printf("\n Registro não consta na Lista");
        system("pause");
    }

}
void remover()
{
    char pesq[20];
    int achou;
    if(inicio == NULL)
    {
        printf("\n Lista Vazia...");
        system("pause");
    }
    else
    {
        printf("\n Informe o nome a ser Removido");
        scanf("%s",&pesq);
        achou =0;
        auxiliar = inicio;
// Ultimo da Elemento da Lista
        if(corrente->next == NULL && corrente->back == NULL && strcmp(pesq,corrente->nome)==0)
        {
            fim = NULL;
            inicio = NULL;
            auxiliar=NULL;
            free(corrente);
            printf("\n Removido o ultimo elemento da Lista");
            system("pause");
            achou =1;
        }
        else
        {
// Primeiro Elemento da Lista
            if(strcmp(pesq,auxiliar->nome)==0)
            {
                inicio = inicio->next;
                inicio->back = NULL;
                free(auxiliar);
                printf("\n Removido com sucesso Registro no Inicio da Lista");
                system("pause");
                achou =1;
            }
            else
            {
                corrente = auxiliar->next;
// Meio da Lista
                while (corrente->next != NULL)
                {
                    if(strcmp(pesq,corrente->nome)==0)
                    {
                        corrente = corrente->next;
                        corrente->back =auxiliar;
                        corrente= auxiliar->next;
                        auxiliar->next = corrente->next;
                        free(corrente);
                        printf("\n Removido com sucesso o Registro no meio da Lista");
                        system("pause");
                        achou=1;
                        break;
                    }
                    else
                    {
                        auxiliar = auxiliar->next;
                        corrente=corrente->next;
                    }
                }

// Final de Lista

                if(achou == 0 && strcmp(pesq,corrente->nome)==0)
                {
                    fim=auxiliar;
                    auxiliar->next = NULL;
                    free(corrente);
                    printf("\n Removido com sucesso Registro no Final da Lista");
                    system("pause");
                    achou =1;
                }
            }
            if(achou ==0) //flag // boolean
            {
                printf("\n Registro não consta na Lista");
                system("pause");
            }
        }
    }
}

void alterar()
{
    char pesq[20];
    int achou,i;
    if(inicio == NULL)
    {
        printf("\n Lista Vazia...");
        system("pause");
    }
    else
    {
        printf("\n Informe o nome a ser Pesuisado");
        scanf("%s",&pesq);
        achou =0;
        i=0;
        auxiliar =inicio;

        while(auxiliar != NULL)
        {
            i++;
            if(strcmp(pesq,auxiliar->nome)==0)
            {
                printf("\n -----------------------------");
                printf("\n Nome encontrado na Lista %d",i);
                printf("\n------------------------------");

                printf("\n Informe o Novo Nome");
                scanf("%s",&auxiliar->nome);
                printf("\n informe a Nova Idade");
                scanf("%d",&auxiliar->idade);
                printf("\n\n Alterado com Sucesso o Registro");
                system("pause");
                achou=1;
                break;
            }
            else
            {

                auxiliar =auxiliar->next;
            }
        }
    }

    if (achou ==0)
    {
        printf("\n Registro não consta na Lista");
        system("pause");
    }
}

/*void insere()
{
    if(inicio == NULL)
    {
        corrente =(no*)malloc(sizeof(no));
        auxiliar= corrente;
        inicio = corrente;
        fim = corrente;
        corrente->next = NULL;
        corrente->back = NULL;
        enterdata();

    }
    else
    {

        corrente=(no*) malloc(sizeof(no));
        auxiliar->next = corrente;
        corrente->back = auxiliar;
        corrente->next = NULL;
        auxiliar = corrente;
        fim=corrente;
        enterdata();

    }
}*/

void Class_insert()
{
  int achou;
    corrente=(no*) malloc(sizeof(no));
    enterdata();
    auxiliar =inicio;
    achou = 0;

    if(inicio == NULL)
    {
        auxiliar = corrente;
        inicio = corrente;
        fim = corrente;
        corrente->back = NULL;
        corrente->next = NULL;
        achou=1;
        printf("\n Instalado o Primeiro Elemento da Lista");
        system("pause");
    }
    else
    {

        if(strcmp(corrente->nome,auxiliar->nome)<0)
        {
            corrente->next = auxiliar;
            auxiliar->back = corrente;
            corrente->back = NULL;
            inicio = corrente;
            achou =1;
            printf("\n Elemento antecede o Primeiro Elemento da Lista");
            system("pause");
        }
        else
        {

            auxiliar2=auxiliar->next;

            while (auxiliar2 != NULL)
            {
                if(strcmp(corrente->nome,auxiliar->nome)>=0 && strcmp(corrente->nome,auxiliar2->nome)<=0)
                {
                    auxiliar->next = corrente;
                    corrente->next = auxiliar2;
                    auxiliar2->back = corrente;
                    corrente->back = auxiliar;
                    printf("\n Elemento foi inserido no meio da lista com Sucesso");
                    system("pause");
                    achou =1;
                    break;

                }
                else
                {
                    auxiliar=auxiliar->next;
                    auxiliar2=auxiliar2->next;

                }
            }

            if(achou == 0 && strcmp(corrente->nome,auxiliar->nome)>0)
            {
                auxiliar->next = corrente;
                corrente->back =auxiliar;
                fim = corrente;
                corrente->next = NULL;
                printf("\n Elemento inserido com sucesso no Final da Lista");
                system("pause");
                achou=1;
            }


        }



    }


}

void exibir()
{
    if(inicio == NULL)
    {
        printf("\n Lista Vazia....");
        system("pause");
    }
    else
    {
        auxiliar = fim;
        while(auxiliar != NULL)
        {
            printf("\n Nome %s  Idade %d",auxiliar->nome,auxiliar->idade);
            auxiliar =auxiliar->back;
        }

        system("pause");
    }
}


void main()
{

    corrente = NULL;
    auxiliar = NULL;
    inicio = NULL;
    fim = NULL;

    int op;

    do
    {
        system("cls");
        printf("\n --- Lista Duplamente Encadeada -----");
        printf("\n [1] - Inserir Elemento na Lista");
        printf("\n [2] - Exibir Elemento da Lista F / I");
        printf("\n [3] - Pesquisa Elemento na Lista....");
        printf("\n [4] - Alterando Registro na Lista...");
        printf("\n [5] - Removendo Registro na Lista...");

        printf("\n Escolha a Opção");
        scanf("%d",&op);

        switch(op)
        {
        case 1:
            Class_insert();
            break;
        case 2:
            exibir();
            break;
        case 3:
            pesquisa();
            break;
        case 4:
            alterar();
            break;
        case 5:
            remover();
            break;

        default :
            printf("\n Opção Invalida.... tente novamente");
            system("pause");
        }
    }
    while(op!=6);

}
