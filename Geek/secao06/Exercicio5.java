package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//variavel
		
		float p , e=0 , m=0 ; //peso, excesso e multa
		
		//entrada
		System.out.println("Entre com os Kg de peixes pescados:");
		p = ler.nextFloat();
		
		
		//processamento
		
		if (p>50)
		{
			e = p - 50;
			m = e * 4;
			
		}
		
		//saida
		System.out.println("Quantidade de kg Pescado: "+p);
		System.out.println("Excesso: "+e);
		System.out.println("Multa: "+m);
		
		ler.close();
		
		

	}

}
