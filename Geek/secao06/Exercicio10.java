package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int idade, ano;
		
		System.out.println("Informe o ano de nascimento do nadador (ex: 1994):");
		ano = ler.nextInt();
		
		
		idade = ((int) 2021 - ano);
		
		System.out.println("idade é igual a :" +idade);
		
		if(idade>=5 && idade<=7)
		{
			System.out.println("Infantil A");
		}
         

		else if(idade>=8 && idade<=11)
		{
			System.out.println("Infantil B");
		}
		
		

		else if(idade>=12 && idade<=13)
		{
			System.out.println("Juvenil A");
		}
		

		else if(idade>=14 && idade<=17)
		{
			System.out.println("Juvenil B");
		}
		

		else if(idade>=18)
		{
			System.out.println("Adulto");
		}
		
		
		ler.close();
		
	}

}
