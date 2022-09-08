package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	int c;
	float n, salario, e = 0, extra;
	
	System.out.println("Infome o codigo do trabalhador:");
	c = ler.nextInt();
	
	System.out.println("informe a quantidade de horas trabalhadas:");
	n = ler.nextFloat();
	
	
	if (n>50)
	{
		e = n - 50 ;
		
		extra = e * 20;
		
		salario = ((n - e) * 10) + extra;
		
				
				
	}
	else
	{
		salario = n*10;
		
	}
	System.out.println("Codigo do funcionario:"+c);
	System.out.println("Salario: "+salario);
	System.out.println("Horas excedidas: "+e);
     
	ler.close();
	
	}

}
