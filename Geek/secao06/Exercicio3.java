package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num;
		int p,i;
		
		System.out.println("Informe o valor do numero:");
		num = ler.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Par");
			p=num;
			i=0;
			
		}
		
		else
		{
			System.out.println("Impar");
			p=0;
			i=num;
		}
		
		
		System.out.printf("valor de i=%d valor de p=%d",i,p);
		
		ler.close();
		

	}

}
