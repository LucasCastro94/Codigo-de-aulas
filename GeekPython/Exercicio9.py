# -*- coding: utf-8 -*-

maior = 0
numero = float(input("Informe o numero"))

while numero!=0:
    if numero>maior:
        maior=numero
    numero = float(input("Informe o numero"))
    
print("O maior numero e:",maior)


