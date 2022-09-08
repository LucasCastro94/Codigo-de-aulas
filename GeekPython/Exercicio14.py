# -*- coding: utf-8 -*-
valor = int(input("Informe um numero de 1 a 10 para gerar a tabuada:"))

while valor < 1 or valor >10:
    print("sera aceito apenas numeros de 1 a 10 tente novamente")
    valor = int(input("Informe um numero de 1 a 10 para gerar a tabuada:"))

for i in range(1,11):
   
    print("{0}x{1}={2}".format(valor,i,valor*i))
  
    
        