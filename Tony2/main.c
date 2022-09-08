#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

typedef struct no
{
    char nome[20];
    int idade;
    struct no *next;

} no;

struct no *corrente,*auxiliar,*inicio, *auxiliar2;



void Enterdata()
{
    printf("\n Informe o nome da Pessoa: ");
    scanf("%s",&corrente->nome);
    printf("\n Informe a Idade da Pessoa: ");
    scanf("%d",&corrente->idade);

}

void Inserir()
{
    if(inicio == NULL)
    {
        corrente=(no*)malloc(sizeof(no));
        auxiliar = corrente;
        inicio = corrente;
        corrente->next = NULL;
        Enterdata();
    }
    else
    {
        corrente=inicio;
        while(corrente->next != NULL)
        {
            corrente=corrente->next;
        }
        auxiliar = corrente;
        corrente=(no*)malloc(sizeof(no));
        auxiliar->next = corrente;
        corrente->next = NULL;
        auxiliar = corrente;
        Enterdata();

    }

}


void Exibir ()
{
    if(inicio == NULL)
    {
        printf("\n Lista Vazia..");
        system("pause");
    }

    auxiliar = inicio;
    while(auxiliar != NULL)
    {
        printf("\n Nome da Pessoa....: %s possui a idade de %d",auxiliar->nome,auxiliar->idade);
        auxiliar=auxiliar->next;
    }

    system("pause");

}
void Alterar()
{
    char pesq[20];
    int achou;
    if(inicio == NULL)
    {
        printf("\n Lista Vazia...");
        system("pause");
    }

    printf("\n Informe o nome a ser Pesquisado: ");
    scanf(" %s",&pesq);

    achou=0;
    corrente = inicio;

    while(corrente != NULL)
    {


        if(strcmp(pesq,corrente->nome)==0)
        {
            printf("\n Alterando ==> Nome %s Idade %d",corrente->nome,corrente->idade);
            printf("\n Informe o Novo Nome...");
            scanf("%s",&corrente->nome);
            printf("\n Informe a nova Idade..\n");
            scanf("%d",&corrente->idade);
            achou =1;
            system("pause");
            break;
        }
        else
        {
            corrente=corrente->next;
        }
    }

    if(achou == 0)
    {
        printf("\n Registro não consta na Lista..\n");
        system("pause");
    }
}


void Remover()
{
    char pesq[20];
    int achou;

    if(inicio == NULL)
    {
        printf("\n Lista Vazia\n");
        system("pause");
    }
    else
    {

        printf("\n Informe o nome a ser Removido: ");
        scanf("%s",&pesq);
        auxiliar =inicio;
        achou =0;

        if(strcmp(pesq,auxiliar->nome)==0)
        {
            inicio=inicio->next;
            free(auxiliar);
            printf("\n Removido com sucesso o Primeiro Elemento da Lista");
            system("pause");
            achou =1;
        }
        else
        {
            corrente=auxiliar->next;

            while (corrente != NULL)
            {
                if(strcmp(pesq,corrente->nome)==0)
                {
                    auxiliar->next = corrente->next;
                    free(corrente);
                    printf("\n Removido com sucesso Elemento no Meio / Fim da Lista\n");
                    system("pause");
                    achou =1;
                    break;
                }
                else
                {
                    auxiliar=auxiliar->next;
                    corrente=corrente->next;
                }
            }
        }

        if(achou ==0)
        {
            printf("\n Elemento não consta na Lista\n");
            system("pause");
        }
    }
}


void Pesquisa()
{
    char pesq[20];
    int k,achou;
    if(inicio == NULL)
    {
        printf("\n Lista Vazia...\n");
        system("pause");
    }

    printf("\n Informe o nome a ser Pesquisado: ");
    scanf(" %s",&pesq);
    k=0;
    achou=0;
    corrente = inicio;

    while(corrente != NULL)
    {

        k++;
        if(strcmp(pesq,corrente->nome)==0)
        {

            printf("\n Encontrado na Lista o Registro na posição %d\n", k);
            achou =1;
            system("pause");
            break;
        }
        else
        {
            corrente=corrente->next;
        }
    }

    if(achou == 0)
    {
        printf("\n Registro não consta na Lista..\n");
        system("pause");
    }
}

/*
void Class_insert()
{
    int achou;

    corrente=(no*)malloc(sizeof(no));

    Enterdata();
    auxiliar = inicio;

    if(inicio == NULL)
    {
        auxiliar = corrente;
        inicio = corrente;
        corrente->next = NULL;
        printf("\n Instalando o Primeiro Elemento na Lista");
        printf("\n\n");
        achou =1;
        system("pause");
    }else {

        if(strcmp(corrente->nome,auxiliar->nome)<0)
        {
            corrente->next = auxiliar;
            inicio = corrente;
            printf("\n Elemento antecede o Primeiro Elemento da Lista");
            printf("\n\n");
            achou =1;
            system("pause");
        }else {


        auxiliar2=auxiliar->next;
        while(auxiliar2 != NULL)
        {
            if((strcmp(corrente->nome,auxiliar->nome)>=0) && strcmp(corrente->nome,auxiliar2->nome)<=0)
            {
                auxiliar->next = corrente;
                corrente->next = auxiliar2;
                printf("\n Elemento inserido com sucesso no meio da lista\n");
                system("pause");
                achou=1;
                break;
            }else {

            auxiliar=auxiliar->next;
            auxiliar2=auxiliar2->next;

            }

        }

        if(achou == 0 && strcmp(corrente->nome,auxiliar->nome)>0)
        {
            auxiliar->next = corrente;
            corrente->next = NULL;
            printf("\n Elemento Inserido com sucesso no Final da Lista");
            printf("\n\n");
            system("pause");
        }
        }
    }
}


*/




int main()
{
    setlocale(LC_ALL,"");
    corrente= NULL;
    auxiliar = NULL;
    inicio = NULL;

    int op;

    do
    {
        system("cls");
        printf("\n CRUD - Create - Read - Update - Remove");
        printf("\n [1] - Inserir Elemento na Lista..");
        printf("\n [2] - Exibir Elemento da Lista...");
        printf("\n [3] - Pesquisar Elemento da Lista");
        printf("\n [4] - Alterar o Elemento da Lista");
        printf("\n [5] - Remover Elemento da Lista..");


        printf("\n Escolha a opção Desejada:");
        scanf("%d",&op);



        switch(op)
        {

        case 1:
            Inserir();
            break;
        case 2:
            Exibir();
            break;
        case 3:
            Pesquisa();
            break;
        case 4:
            Alterar();
            break;
        case 5:
            Remover();
            break;

        default:
            printf("\n Opção Invalida... tente novamente");


        }
    }
    while(op!=6);


    return 0;
}



