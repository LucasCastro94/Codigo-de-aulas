# -*- coding: utf-8 -*-
vetor = []
codigo = 0
while codigo <1 or codigo >2:
    codigo = int(input("Informe o codigo"))

for i in range(1,6):
    print(i)
    numero=int(input("informe o numero:"))
    vetor.append(numero)
    
if codigo == 1:
    for i in vetor:
        print(i)
elif codigo == 2:
    vetor.reverse()
    for i in vetor:
        print(i)
    
        