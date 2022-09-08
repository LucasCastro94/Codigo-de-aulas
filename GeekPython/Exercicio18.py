# -*- coding: utf-8 -*-

vetor1 = [] #lista vazia


for i in range (1,6):
    valor1= int(input("informe o valor de vetor1:"))
    vetor1.append(valor1)

vetor1.reverse()

for i in vetor1:
    print(i)
    
    #receba o vetor exiba ao inverso