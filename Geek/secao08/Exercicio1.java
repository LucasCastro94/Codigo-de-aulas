package Udemy.Geek.secao08;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int vetor[];
		int pares[];
		
		vetor = new int [5];
		pares = new int [5];
		
		int i,k=0;
		
		Scanner ler = new Scanner (System.in);
		
		
		for(i=0;i<5;i++)
		{
			System.out.println("Informe o numero de posicao "+(i+1));
			vetor[i]=ler.nextInt();
			if(vetor[i]>0)
			{
				
			if(vetor[i]%2==0)
			{
				pares[k]=vetor[i];
				k++;
			}
			
			}
			
			else {
				i--;
			}
		}
		
for(i=0;i<5;i++)
{
	System.out.printf("\nVetor[%d] = %d",i,vetor[i]);
}

System.out.println("\nValores pares..");
for(i=0;i<k;i++)
{
	System.out.println(pares[i]);
}

	
	}

}