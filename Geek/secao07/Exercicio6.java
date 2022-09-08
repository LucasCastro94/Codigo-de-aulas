package Udemy.Geek.secao07;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TABUADA DO NUMERO ESCOLHIDO

		int valor,i;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o numero da tabuada desejada:");
		valor = ler.nextInt();
		
		
		for(i=1;i<=10;i++)
		{
			System.out.printf("\n%dx%d = %d",valor,i,valor*i);
		}
		
		ler.close();
	}

}
