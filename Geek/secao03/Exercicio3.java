package Udemy.Geek.secao03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int num[] = new int[2];
		int i,soma;
		soma=0;
		
		
		for(i=0;i<2;i++)
		{
			System.out.println("Infome o numero de posicao "+(i+1));
			num[i] = ler.nextInt();
			
			soma=num[i]+soma;
		}
		ler.close();
		System.out.println("Resultado da soma é:"+soma);
           
	
	}

}
