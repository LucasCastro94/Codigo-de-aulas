# -*- coding: utf-8 -*-
vetor = [] #lista vazia
pares = [] #lista vazia

for i in range(1,5):
    num = int(input("informe o valor"))
    vetor.append(num)
    if num % 2 == 0:
        pares.append(num)

for i in pares:
    print(i)
        
        
        #imprimir somente os pares