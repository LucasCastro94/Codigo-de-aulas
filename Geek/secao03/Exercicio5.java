package Udemy.Geek.secao03;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
float ganha_h, h_trabalhado, mult;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Quanto ganha por hora:");
		ganha_h = ler.nextFloat();
		
		System.out.println("Quantas horas trabalhada no mês:");
		h_trabalhado = ler.nextFloat();
		
		mult = h_trabalhado*ganha_h;
		
		
	System.out.println("O valor a receber no mes é: " +mult);
		
	ler.close();

	}

}
