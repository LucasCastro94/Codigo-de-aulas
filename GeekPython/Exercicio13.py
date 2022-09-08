# -*- coding: utf-8 -*-

usuario = input("Informe o nome de usuario:")
senha = input("informe uma senha:")
 
while usuario==senha:
    print("a senha nao pode ser igual nome de usuario.. tente novamente")
    usuario = input("Informe o nome de usuario:")
    senha = input("informe uma senha:")
print("cadastrado com sucesso")