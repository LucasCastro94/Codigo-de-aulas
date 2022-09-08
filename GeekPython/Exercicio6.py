# -*- coding: utf-8 -*-
peso = float(input("Informe o peso em kgs de peixe pescado:"))
e=0
m=0

if peso > 50:
    e=peso-50
    m=e*4
    
print("Peso pescado {0:.2f} Excesso: {1:.2f}KG e multa: {2:.2f}".format(peso,e,m))    

