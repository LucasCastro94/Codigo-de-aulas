package Udemy.Geek.secao03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	 
		
			Scanner ler = new Scanner (System.in);
			
			float min, max, medio;
			
			System.out.println("Informe o estoque minimo:");
			min = ler.nextFloat();

			System.out.println("Informe o estoque maximo:");
			max = ler.nextFloat();
			
			
			
			medio = (min+max)/2;
			
			System.out.println("O estoque medio �:"+medio);  // Escreve Sysout dps ctrl +  espa�o preenche sozinho
			
			ler.close();
			
	}

}
