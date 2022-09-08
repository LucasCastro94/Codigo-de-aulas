package Udemy.Geek.secao08;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int cont=0,i;
		int []numero = new int [10];
		int []posicao = new int[10];
		int []resultante = new int[10];
		int soma=0;
		int achou=0;
		
		for(i=0;i<10;i++)
		{
			System.out.printf("\nInfome um numero inteiro %d/10: ",i+1);
			numero[i]=ler.nextInt();
			
			
			if(numero[i]>50)
			{  cont++;
				soma=soma+numero[i];
				posicao[cont]= i;
				resultante[cont]= numero[i];
				achou=1;
				
			}
			
		}
		
		
		
		
		if(achou==1)
		{
		
		System.out.println("Numeros maiores que 50 e suas posição..");
		for(i=1;i<=cont;i++)
		{ 
	
			System.out.printf("\nPosição: %d  numero: %d",posicao[i]+1,resultante[i]);
		}
		System.out.println("\nSoma de numeros maiores que 50 = "+soma);
		}else {
			System.out.println("Nenhum numero maior que 50 localizado..");
		}
	ler.close();}

}
