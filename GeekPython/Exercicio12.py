# -*- coding: utf-8 -*-
soma=0
menor=999
maior=0
for i in range(1,11):
    numero=float(input("Infome o numero:"))
    if numero>=0:
        if numero>maior:
            maior=numero
        if numero < menor:
            menor = numero
        soma= soma+ numero
    else:
        numero=float(input("Infome somente positivo:"))
        if numero <0:
            numero=numero*-1
            print("numero convertido para absoluto")
        if numero>maior:
                maior=numero
        if numero < menor:
            menor = numero
        soma= soma+ numero
        
print(maior)
print(menor)
print(soma/10)

    #leia 10 numeros somente positivos
    #imprima o maior o menor e a media dos 10 numeros