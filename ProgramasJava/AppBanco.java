package ProgramasJava;

import java.util.Scanner;

public class AppBanco {
	
	static Scanner ler = new Scanner (System.in);
	static int num;
	static String Email,senha,pause;
	static String Email_acess, senha_acess;
	static float deposito,depositado=0, saque;
	static int error=0;
	static int op;
//funcao de pause	
public static void sleep(int time)
{ try {
	Thread.sleep(time);} catch (Exception e) {}}

		
		
		
	public static void deposito() 
	{ 
		ler.nextLine();
		System.out.println("Informe o Email:");
		Email_acess = ler.nextLine();
		System.out.println("Informe a senha:");
		senha_acess = ler.nextLine();
		
		if((Email.equals(Email_acess)== true) && (senha.equals(senha_acess)==true)) 
				{
			        System.out.println("Informe o valor para deposito:");
			        deposito=ler.nextFloat();
			        System.out.println("Deposito efetuado com sucesso!");
			        
			        depositado = deposito + depositado;
			      sleep(2000);
				}
		else
		{
			while(true)
					{   error++;
					
					if(error==2)
					{
						System.out.println("2 tentativas efetuada na terceira o cartão sera bloqueado");
						sleep(1000);
					}
					
					else if(error==3)
					{
					System.out.println("Cartão bloqueado!!!");
					sleep(30000);
					break;
	
					}
				         System.out.println("Usuario e senha não correspondem ao banco de dados..");
				         sleep(700);
				         System.out.println("Informe o Email:");
				 		 Email_acess = ler.nextLine();
				 		 System.out.println("Informe a senha:");
				 		 senha_acess = ler.nextLine();
				         
				         if((Email.equals(Email_acess)== true) && (senha.equals(senha_acess)==true))
				        		 {
				        	    System.out.println("Informe o valor para deposito:");
						        deposito=ler.nextFloat();
						        System.out.println("Deposito efetuado com sucesso!");
						        depositado=deposito+depositado;
						        sleep(1500);
						        break;
				        		 }
				
				 
					}
			
		
	}
	error=0;}
	
	public static void saque() 
	{
		 
			ler.nextLine();
			System.out.println("Informe o Email:");
			Email_acess = ler.nextLine();
			System.out.println("Informe a senha:");
			senha_acess = ler.nextLine();
			
			if((Email.equals(Email_acess)== true) && (senha.equals(senha_acess)==true)) 
					{
				        System.out.println("Informe o valor para saque:");
				        saque =ler.nextFloat();
				        
				        if(saque>depositado)
				        {
				        	
				        	while(saque>depositado)
				        	{System.out.println("Valor informado maior do que o valor disponivel em conta\nValor disponivel:$"+depositado);
				        	sleep(3000);  
				        	System.out.println("Informe o valor para saque:");
						        saque =ler.nextFloat();
				        	}
				        	
				        	depositado = (depositado-saque);
				        	System.out.println("Deposito efetuado com sucesso....");
				        	sleep(1500);
				        }
				        else
				        {
				        	depositado = (depositado-saque);
				        	System.out.println("saque efetuado com sucesso....valor sacado:$"+saque);
				        	sleep(1500);
				        	
				        }
				     
				        
					}
			else
			{
				
					       error++;
						
						  System.out.println("Usuario e senha não correspondem ao banco de dados..");
						
						if(error==2)
						{
							System.out.println("2 tentativas efetuada na terceira o cartão sera bloqueado");
							sleep(3000);
							
						}
						
						else if(error==3)
						{
						System.out.println("Cartão bloqueado!!!");
						sleep(30000);
		
						}
						
						  saque();   
						
			}
	error=0;}
	
	public static void extrato() 
	{
		ler.nextLine();
		System.out.println("Informe o Email:");
		Email_acess = ler.nextLine();
		System.out.println("Informe a senha:");
		senha_acess = ler.nextLine();
		
		if((Email.equals(Email_acess)== true) && (senha.equals(senha_acess)==true))
		{
			System.out.println("Valor disponivel:$"+depositado);
			sleep(3000);
		}
		else
		{
			error++;
			
			  System.out.println("Usuario e senha não correspondem ao banco de dados..");
				
				if(error==2)
				{
					System.out.println("2 tentativas efetuada na terceira o cartão sera bloqueado");
					sleep(3000);
					
				}
				
				else if(error==3)
				{
				System.out.println("Cartão bloqueado!!!");
				sleep(30000);
			
		}
	}
	
	error=0;}

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("Informe o Email de cadastro:");
		Email = ler.nextLine();
		System.out.println("Informe a senha de cadastro:");
		senha = ler.nextLine();
		System.out.println("Usuario criado com sucesso..\n\n");
		do {
		System.out.println("--------BANCO DO LUCAS----------");
		System.out.println("[1]Deposito");
		System.out.println("[2]Saque");
		System.out.println("[3]Extrato");
		System.out.print("Opção desejada:");
		op=ler.nextInt();
		
		switch(op)
		{
		case 1: deposito();
			break;
			
		case 2: saque();
		break;
		
		case 3: extrato();
		break;
		
		default:
		{
			System.out.println("Opção invalida tente novamente");
		}
			
			
			
			
		}
		
		}while(op!=5);
		
		
		

	}

}






/*Crie um programa de saque de banco
1- efetue cadastro de usuario nome e senha
2- crie um menu com as opçoes deposito saque e ver extrato
3- toda ação necessario entrar com usuario e senha se a senha for digitada errada 3 vez bloquear o cartão
4- validar se o saque nao é menor do que o deposito

*/