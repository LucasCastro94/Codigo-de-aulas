package Udemy.Geek.secao06;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		float poluicao;
		
		System.out.println("Informe o nivel de poluicao: ");
		
		poluicao = ler.nextFloat();
		
		if (poluicao>=0.3 && poluicao <0.4)
		{
			System.out.println("Grupo 1 Suspender atividades");
		}
		else if (poluicao>=0.4 && poluicao < 0.5)
		{
			System.out.println("Grupo 1 e 2 suspender as atividades");
		}
		
		else if(poluicao >= 0.5)
		{
			System.out.println("Todos grupo suspender atividade");
		}
		
		else {
			System.out.println("Niveis aceitaveis");
		}
	ler.close();}

}
