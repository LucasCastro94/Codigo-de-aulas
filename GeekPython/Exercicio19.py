# -*- coding: utf-8 -*-

vetor = []
existencia = False
cont=0

for i in range(1,6):
    numero = int(input("Informe o numero {0} ".format(i)))
    vetor.append(numero)

for i in vetor:
    cont=cont+1
    if i > 50:
        
        print("O valor {0} na posicao {1}".format(i,cont))
       
        existencia=True
    
if existencia == False:
    
    print("Nao existe numeros maiores que 50")