package Udemy.Geek.secao08;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float vetor1[],vetor2[],somavetores[];
		int i;
		
		vetor1 = new float [5];
		vetor2=new float [5];
	    somavetores = new float [5]; 	
		
		Scanner ler = new Scanner (System.in);
		
		for(i=0;i<5;i++)
		{
			System.out.println("Vetor1 informe o numero:");
			vetor1[i]=ler.nextFloat();
			
			System.out.println("Vetor2 informe o numero:");
			vetor2[i]=ler.nextFloat();
			
			somavetores[i]= vetor1[i]+vetor2[i];
			
			
		}
		
		
		ler.close();
		
		for(i=0;i<5;i++)
		{
			System.out.printf("\n%.0f+%.0f = %.0f",vetor1[i],vetor2[i],somavetores[i]);
		}
		
		
	}

}

