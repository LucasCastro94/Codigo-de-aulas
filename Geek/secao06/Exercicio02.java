package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num , a=0 , b=0;
		
		System.out.println("Digite o numero:");
		
		num= ler.nextInt();
		
		if (num>=0)
		{
			a = num;
			System.out.println("Positivo");
			System.out.println(a);
			
			
		}else
		{
			b=num;
			System.out.println("Negativo");
			System.out.println(b);
		}
		
		
		ler.close();
		
	}

}
