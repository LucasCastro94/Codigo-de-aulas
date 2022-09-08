# -*- coding: utf-8 -*-

esfera = 0
limpeza = 0
cabo = 0
quebrado = 0
quantidade = 0

while True:
    codigo = int (input("Informe o codigo:"))
    if codigo == 0:
        break
        print("peguei o zero")
    
    else:
        
        print("1-necessita de esfera")
        print("2-necessita de limpeza")
        print("3-necessita trocar o cabo")
        print("4-Inutilizavel")
        
        op=int(input("Opcao:"))
    if op>=1 and op<=4:
        quantidade=quantidade+1
        if op == 1:
            esfera= esfera+1
        if op == 2:
            limpeza=limpeza+1
        if op == 3:
            cabo=cabo+1
        if op == 4:
            quebrado=quebrado+1
        
    else:
        print("Opcao invalida..")
        
        
        
per1= (esfera / quantidade) * 100
per2= (limpeza / quantidade) * 100
per3= (cabo / quantidade) * 100
per4= (quebrado / quantidade) * 100

print("Total de itens:",quantidade)

print("                                       quantidade         porcentagem")
print("1-necessita de esfera                      {0}                  {1}%".format(esfera,per1))
print("2-necessita de limpeza                     {0}                  {1}%".format(limpeza,per2))
print("3-necessita trocar o cabo                  {0}                  {1}%".format(cabo,per3))
print("4-Inutilizavel                             {0}                  {1}%".format(quebrado,per4))
