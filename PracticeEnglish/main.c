#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <locale.h>
int main()
{
    setlocale(LC_ALL,"");
    char palavra[20];

    ///////////////////

    char pergunta[70][30] = {"quando","como","onde","quem","quase","cafe da manha","almoço","janta","bom dia","boa tarde","boa noite","Os,o,as","Sobre,em","todos","alguma","sentir, notar ou tocar","ser","vai","então","aqui"};

    char resposta[70][30]= {"when","how","where","who","almost","breakfast","lunch","dinner","good morning","good afternoon","good night","the","about","everyone","some","feel","be","will","then","here"};

    char refaz[70][30], refaz_R[70][30];

    int i,j;
    int certo=0,errado=0;


 j=0;

    printf("\nSempre usar letras minuscula e sem acentos! \n\n");



    for(i=0; i<20; i++)
    {
        printf("\n[%d]How do you say: %s ... ",i+1,pergunta[i]);
        gets(palavra);



        if(strcmp(palavra,resposta[i])==0)
        {
            printf("\nCorrect answer, very nice, Enter continue..\n");
            getch();
            certo++;
        }
        else
        {
            Beep(600,400);
            printf("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\nIncorrect answer!! <%s> Enter continue..\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n",resposta[i]);
            getch();
            errado++;

            strcpy(refaz[j],pergunta[i]);
             strcpy(refaz_R[j],resposta[i]);

            j++;

        }

    }



   int total = errado+certo;


      printf("\n=======================================================================================================\n");
     if(errado>(total/2))

     {
         printf("Muito mal acertou apenas %d de %d",certo,certo+errado);
     }
      printf  ("\nTotal de acertos %d de %d",certo,certo+errado);
        printf("\n\nOs erros foram...");
       for(i=0; i<errado; i++)

       {
           printf("\npergunta--> %s resposta--> %s",refaz[i],refaz_R[i]);
       }

       printf("\n\nPress enter continue try again the erros....\n");  getch();


       system("cls");


        for(i=0; i<errado; i++)

       {
           printf("\n[%d]How do you say: %s ... ",i+1,refaz[i]);
        gets(palavra);



        if(strcmp(palavra,refaz_R[i])==0)
        {
            printf("\nCorrect answer, very nice, Enter continue..\n");
            getch();
            certo++;
        }
        else
        {    Beep(600,400);
             printf("\n-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_\nIncorrect answer!! Enter continue..\n-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_\n\n"); getch();
        }

       }

     printf("\nEnd of your training today!");getch();
    return 0;
}
