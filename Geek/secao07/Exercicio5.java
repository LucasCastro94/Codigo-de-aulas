package Udemy.Geek.secao07;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Programa de criar senha ( senha nao pode ser = nome )
		
		String nome,senha;
		
		int E=0;
		
		Scanner ler = new Scanner (System.in);
		
		
		do {
		
		if(E==1)
		{
			System.out.println("Senha e nomes iguais mude por favor!!");
		}
		
		System.out.println("Informe o nome:");
		nome = ler.next();
		
		System.out.println("Informe a senha deve ser diferente do nome:");
		senha = ler.next();
		
		if(senha.equals(nome)) //Equals compara duas string true or false
		{
			E=1;
		}
		
		}while(senha.equals(nome)); // se for verdade então repita caso contrario pare
		
		
		
		System.out.println("Senha Cadastrada com sucesso!");
		
		ler.close();

	}

}
