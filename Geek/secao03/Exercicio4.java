package Udemy.Geek.secao03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		float metros, centimetros;
		
		System.out.println("Informe a medida em metros para ser convertida em centimetros:");
		metros = ler.nextFloat();
		
		centimetros = metros * 100;
		
		System.out.println("O valor convertido em centimetros é:"+centimetros);
		
		ler.close();
	}

}
