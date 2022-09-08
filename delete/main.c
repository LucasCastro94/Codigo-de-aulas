#include <stdio.h>
#include <stdlib.h>

struct horario{
    int horas;
    int minutos;
    int segundos;
};

int main()
{
 void receberhorario(struct horario lista[5]);
  void printhorario(struct horario lista[5]);

    struct horario listahorario[5];

    receberhorario(listahorario);
    printhorario(listahorario);

return 0;}


 void receberhorario(struct horario lista[5])
 {
     int i;
     for (i=0;i<5;i++)
     {
         printf("Digite o %d horario (hh:mm:ss):", i + 1);
         scanf("%d:%d:%d",&lista[i].horas,&lista[i].minutos,&lista[i].segundos );
     }
 }

 void printhorario(struct horario lista[5])
 {
      int i;
     for (i=0;i<5;i++)
     {
         printf("A %d hora %d:%d:%d\n",i+1,lista[i].horas, lista[i].minutos, lista[i].segundos );
     }
 }



