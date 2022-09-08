#include <stdio.h>
#include <stdlib.h>

int main()
{

    struct lista

    {
        //normal
        int valor;

        // ligado a ngm
        struct lista *proximo;

    };
    //nromal
    struct lista m1,m2,m3,m4;

     //ponsteiro de gancho se aloca em endereço de m1
    struct lista *gancho = &m1;

    //declarando os valores de m1 m2 e m3
m1.valor=  10;
m2.valor = 20;
m3.valor = 30;
m4.valor = 50;

m1.proximo = &m2;
m2.proximo = &m3;
m3.proximo = &m4;
m4.proximo = 0;

while(gancho != 0)
{
    printf("\n %d", gancho->valor);
    gancho = gancho->proximo;
}



}
