package Udemy.Geek.secao03;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		float altura, soma ;
		
		
		System.out.println("Informe a sua altura:");
		altura = ler.nextFloat();
		
		soma = (float) (altura * 72.7) - 58; // todo numero digitado em java com ( . ) se torna double tem que usar o cast no inicio ( float ) no caso
		
		
		
		System.out.println ("O peso ideal é: "+soma);
		
		ler.close();
	}

}
