# -*- coding: utf-8 -*-
vetor1 = [] #lista vazia
vetor2 = [] #lista vazia
soma = []

for i in range (1,6):
    valor1= int(input("informe o valor de vetor1:"))
    vetor1.append(valor1)
    
    valor2= int(input("informe o valor de vetor2:"))
    vetor2.append(valor2)
    soma.append(valor1+valor2)


for i in soma:
    print(i)     
