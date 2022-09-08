QUESTÕES E RESOLUÇÕES

1. Crie uma conta para o usuário teste10 com um único grupo (users), com home directory com nome default.

2. Atribua uma senha para o usuário teste10 

3. Desabilite a conta do usuário teste10 

4. Habilite a conta do usuário teste10 

5. Adicione o usuário teste10 aos grupos audio, video, scanner 

6. Adicione o usuário teste10 ao grupo storage mantendo os grupos audio, video e scanner 

7. Retire o usuário teste10 do grupo video mantendo os grupos audio, scanner e storage 

8. Obrigue o usuário teste10 a trocar a senha no próximo login 

9. Obrigue o usuário teste10 a trocar a senha a cada 30 dias 

10. Coloque a data de expiração de conta do usuário teste10 para amanhã. 

11. A empresa WeRTheBest possui a seguinte política para contas de usuário: 
- Uma senha provisória diferente é gerada para cada usuário 

 - O usuário deve trocar a senha no primeiro login 

 - A senha deve ser trocada a cada 60 dias 

 - Toda conta deve ter uma data de expiração equivalente ao contrato de trabalho do funcionário: 

 -- data de desligamento prevista do funcionário (quando o contrato for temporário, estagiário, etc..) 

 -- data de desligamento deve ser INFINITA quando contrato for Indeterminado 

 - Para os usuários temporários, avisar com 15 dias de antecedência que a Conta vai expirar 

 - Para os usuários temporários, o diretório esqueleto é o /etc/temp_skel 

 - Para os usuários permanentes, o diretório esqueleto é o /etc/skel  (default) 

 - Os grupos secundários dos usuários temporários são: audio e video 

 - Os grupos secundários dos usuários permanentes são: audio, video, Storage, scanner e users. 

 - O grupo primário dos usuários temporários deve ser: users 

 - O grupo primário dos usuários permanentes deve ter o mesmo nome da conta do usuário e deve possuir apenas o usuário dono da conta (um usuário).

Faça um script que crie 10 contas com a política apresentada anteriormente. Sendo 5 contas “permanentes” e 5 contas “provisórias”. 
PS.: Os usernames devem estar em um arquivo texto. 

12. Contas que ficam muito tempo sem utilização são consideras como brechas de segurança. Pense em uma maneira de monitorar estas contas e desativá-las se ficarem por mais de 120 dias sem uso. 

13. Desabilitar uma conta que foi criada a 30 dias e nunca foi utilizada. 

 Dica: 

 - utilize em conjunto: 

 -- informações de troca de senha (chage -l OU verificar 3º campo de /etc/shadow) 

 -- informações oferecidas por lastlog -l USERNAME
