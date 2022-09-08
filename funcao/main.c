#include <stdio.h>
#include <stdlib.h>

//variavel global
int gGlobal=4;

void teste1(void)
{
    printf("\n funcao em cima nao precisa declarar no 'main'");
}
int main()
{
    //nao precisa declarar a funcao
    teste1();

    //declarando a funcao de baixo de main para chama-la
     void teste2(void);
     teste2();

     // quando chama funcao valor recomeça menos static
     void teste3(void);
     teste3();
     teste3();
     teste3();

    return 0;
}

void teste2(void)
{
    printf("\n Para chamar funcao de baixo precisa declarar em main.");
}

void teste3(void)
{   //variaveis local so pertecem essa regiao

    int num = 2;
    num*=2;

     //Numero de mantem toda vez que chama funcao
     static int num2=2;
        num2*=2;
 gGlobal*=2;
    printf("\n valor de num %d  num2 %d",num,num2);
    printf("\n valor da global %d",gGlobal);


}


