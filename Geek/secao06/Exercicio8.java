package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numero;
		System.out.println("Informe o numero: ");
		numero = ler.nextInt();
		
		if (numero%2==0)
		{
			System.out.println("O numero é par");
					if(numero>=0)
					{
						System.out.println("É Positivo");
					}
					else
					{
						System.out.println("É Negativo");
					}
		}
		else
		{   System.out.println("É Impar");
			
			if(numero>=0)
			{
				System.out.println("É Positivo");
			}
			else
			{
				System.out.println("É Negativo");
			}
		}
ler.close();		

	}

}
