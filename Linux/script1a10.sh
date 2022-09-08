#!/bin/bash

groupadd users
echo 1- crie uma conta para usuario com unico grupo "(user)" com diretorio default

echo informe o nome do novo usuario:
read nome
useradd -m -g users -G audio,video,scanner -m -d /home/default/$nome $nome

echo 2- atribua uma senha para o usuario $nome
passwd $nome

read -p "Enter para visualizar"

getent passwd

read -p "Enter para continuar"

clear

echo 3- Desabilitando conta do usuario $nome
read -p "Enter para continuar"
usermod -L $nome

echo 4- Habilitando conta do usuario $nome
read -p "Enter para continuar"
usermod -U $nome

echo 5- Adicionar o usuario aos grupos audio, video e scanner..
echo verificando grupos..
groups $nome
read -p "Enter para continuar"
clear

echo 6- Adicionar o $nome ao grupo storage mantendo os grupos audio,video e scanner
read -p "Enter para adicionar"
addgroup storage
usermod -a -G storage $nome

read -p "Enter para verificar"
groups $nome

read -p "Enter para continuar"
clear

echo 7- Retire o usuario $nome do grupo video mantendo os grupos audio, scanner e storage

read -p "Enter para retirar"
deluser $nome video

echo verificando...
groups $nome
read -p "Enter para continuar"
clear

echo 8- obrigar o usuario $nome trocar de senha no proximo login

passwd --expire $nome

echo usuario $nome deve trocar de senha no proximo login
 
read -p "Enter para continuar"

echo 9- obrigue o usuario $nome a trocar de senha a cada 30 dias
passwd -x 30 $nome
echo verificando..
chage -l $nome
read -p "Enter para continuar"
clear

echo 10- Coloque a data de expiração da conta do usuario $nome para amanha
echo definindo data 10/06/2022..
chage -E 2022/06/10 $nome

read -p "Enter para verificar"
chage -l $nome











