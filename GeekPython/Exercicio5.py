# -*- coding: utf-8 -*-

sexo = input("Informe o sexo M ou F:")
altura = float(input("Informe a altura:"))

if sexo == 'm' or sexo == 'M':
    peso_ideal = (float (72.7*altura)-58)

if sexo == 'f' or sexo == 'F':  
    peso_ideal = (float (62.1*altura)-44.7)
    
print("Peso ideal e:{0:.2f}".format(peso_ideal))



#Python nao usa chaves usa blocos de espaço