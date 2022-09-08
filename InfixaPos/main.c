#include <stdio.h>
    #include <stdlib.h>

    typedef enum {FALSE = 0, TRUE = 1} boolean;
    typedef enum {FOLHA, NO} tipoNo;
    typedef enum {INVALIDO, PILHA_VAZIA, OPERADOR, OPERANDO, FIM} tipoResultado;

    struct elemento;

   struct noArvore
   {
       tipoNo tipo;
       union
      {
           int valor;  // Folha
           struct noBinario
           {
               struct noArvore *esquerdo;
               char operador;
               struct noArvore *direito;
           } info;
       };
   };

   struct elemento
   {
       struct noArvore *no;
       struct elemento *prox;
   };

   tipoResultado obterSimbolo(struct noArvore **ppRaiz)
   {
       char c;
       int valor = 0;
       // remover brancos
      do
     {
         c = getc(stdin);
      }
      while (c == ' ' || c == '\t' || c == '\n');
      // obter simbolo
      if (c >= '0' && c <= '9')
      {
          do
          {
              valor = valor * 10 + (int)c - (int)'0';
             c = getc(stdin);
          } while (c >= '0' && c <= '9');
          ungetc(c, stdin);
           *ppRaiz = (struct noArvore *)malloc(sizeof(struct noArvore));
           (*ppRaiz)->tipo = FOLHA;
         (*ppRaiz)->valor = valor;
         return OPERANDO;
     }
      else
      {
          if (c == '+' || c == '-' || c == '*' || c == '/')
          {
             *ppRaiz = (struct noArvore *)malloc(sizeof(struct noArvore));
              (*ppRaiz)->tipo = NO;
             (*ppRaiz)->info.esquerdo = NULL;
            (*ppRaiz)->info.operador = c;
            (*ppRaiz)->info.direito = NULL;
             return OPERADOR;
         }
          else
         {
              if (c == '#') return FIM;
              else return INVALIDO;
          }
       }
   }

   boolean vazia(struct elemento *pPilha)
   {
       return pPilha == NULL;
   }

   void empilhar(struct elemento **ppPilha, struct noArvore *pRaiz)
   {
       struct elemento *p;
       p = (struct elemento *)malloc(sizeof(struct elemento));
      p->no = pRaiz;
       p->prox = *ppPilha;
       *ppPilha = p;
  }

  boolean desempilhar(struct elemento **ppPilha, struct noArvore **ppRaiz)
   {
      struct elemento *p;
     if (vazia(*ppPilha))
      {
           *ppRaiz = NULL;
          return FALSE;
    }
       else
      {
          p = *ppPilha;
         *ppRaiz = (*ppPilha)->no;
         *ppPilha = (*ppPilha)->prox;
         free(p);
         return TRUE;
      }
  }

  void liberarArvore(struct noArvore *pRaiz)
 {
     if (pRaiz != NULL)
     {
         if (pRaiz->tipo == NO)
         {
             liberarArvore(pRaiz->info.esquerdo);
             liberarArvore(pRaiz->info.direito);
         }
          free(pRaiz);
      }
  }

  void liberarPilha(struct elemento **ppPilha)
  {
      struct noArvore *pRaiz;
     struct elemento *p;
     while (*ppPilha != NULL)
    {
         pRaiz = (*ppPilha)->no;
         p = *ppPilha;
         *ppPilha = (*ppPilha)->prox;
         free(p);
          liberarArvore(pRaiz);
      }
}

 tipoResultado processarSufixo(struct elemento **ppPilha)
 {
     struct noArvore *pRaiz = NULL;
     tipoResultado tipo = obterSimbolo(&pRaiz);
      while (tipo != INVALIDO && tipo != FIM && tipo != PILHA_VAZIA)
     {
         switch (pRaiz->tipo)
         {
         case NO:
              if (desempilhar(ppPilha, &(pRaiz->info.direito)))
                  if (desempilhar(ppPilha, &(pRaiz->info.esquerdo)))
                   empilhar(ppPilha, pRaiz);
                 else tipo = PILHA_VAZIA;
          else tipo = PILHA_VAZIA;
            break;
        case FOLHA:
              empilhar(ppPilha, pRaiz);
             break;
         }
         if (tipo == PILHA_VAZIA) liberarArvore(pRaiz);
          else tipo = obterSimbolo(&pRaiz);
     }
     return tipo;
  }

 void apresentarInfixo(struct noArvore *pRaiz)
 {
     if (pRaiz != NULL)
     {
         if (pRaiz->tipo == FOLHA) printf("%d", pRaiz->valor);
        else
         {
            printf("(");
            apresentarInfixo(pRaiz->info.esquerdo);
            printf(" %c ", pRaiz->info.operador);
             apresentarInfixo(pRaiz->info.direito);
            printf(")");
          }
     }
  }

  int main(void)
  {
     tipoResultado tipo;
      struct elemento *pilha = NULL;
      if ((tipo = processarSufixo(&pilha)) == FIM)
         if (pilha == NULL) printf("Expressao vazia\n");
          else
              if(pilha->prox == NULL)
           {
                apresentarInfixo(pilha->no);
                 putchar('\n');
            }
              else printf("Expressao incompleta\n");
      else
          if (tipo == PILHA_VAZIA) printf("Expressao incompleta\n");
          else printf("Simbolo invalido\n");
     liberarPilha(&pilha); // liberar (sub)arvore(s) na pilha (lista ligada)
     return 0;
  }
