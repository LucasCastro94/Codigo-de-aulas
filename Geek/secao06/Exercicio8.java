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
			System.out.println("O numero � par");
					if(numero>=0)
					{
						System.out.println("� Positivo");
					}
					else
					{
						System.out.println("� Negativo");
					}
		}
		else
		{   System.out.println("� Impar");
			
			if(numero>=0)
			{
				System.out.println("� Positivo");
			}
			else
			{
				System.out.println("� Negativo");
			}
		}
ler.close();		

	}

}
