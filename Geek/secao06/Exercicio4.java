package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		float altura, peso_ideal=0;
		char sexo;
		
		System.out.println("Infome o Sexo (M) ou (F)");
		sexo = ler.next().charAt(0); // charAt 0 devolve 1 caracter
		
		System.out.println("Informe a altura:");
		altura = ler.nextFloat();
		
		
		if(sexo == 'M' || sexo == 'm')
		{
			peso_ideal =(float) (altura * 72.7) - 58;
			
		}
		
		if(sexo == 'F' || sexo =='f')
		{
			peso_ideal =  (float) ((float) (altura*62.1)-44.7);
		}
		
		if (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm' )
		{
			System.out.println("Sexo desconhecido...");
			
		}
			
		System.out.println("Peso ideal é: " + peso_ideal);
		
		ler.close();
	}

}
