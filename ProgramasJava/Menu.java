package ProgramasJava;

import java.util.Scanner;




public class Menu {
	static Scanner ler = new Scanner (System.in);
	static int op;
	static float velocidade, excesso, multa=0,permitida,juros;
	
	public static void sleep(int time)
	{
		try {
			Thread.sleep(time);} catch(Exception e) {
			
		}
	}
	
	public static void ComparaString(String str1, String str2)
	{
		if(str1.equals(str2))
		{
		  System.out.println("Valores de string são iguais\n");
		}
		else
		{
			System.out.println("Valores de string são diferentes\n");
		}
		
	}




	public static void multa()
	{
		System.out.println("Informe a velocidade atuada:");
		velocidade= ler.nextFloat();
		
		System.out.println("Informe a velocidade permitidia:");
		permitida=ler.nextFloat();
		
		
		excesso = ((velocidade-permitida)/velocidade)*100;
		
		if(excesso>=1 && excesso<=20)
		{   juros = ((velocidade-permitida)*5);
			System.out.println("Multa aferida valor da multa 190.00 reais");
			sleep(2000);
			System.out.println("com juros "+(juros+190));
		}
		else if(excesso>20)
		{   juros = ((velocidade-permitida)*15);
			System.out.println("Multa aferida valor da multa 800.00 reais gravissima procurar o tribunal de justiça");
			System.out.println("Com juros "+(juros+800));
			sleep(2000);
		}
		else
		{
			System.out.println("Não houve excesso, sem multas!");
			sleep(2000);
		}
		
		//se a velocidade for ate 20% multa 190 reais acima de 20% 800 reais (mais juros <=20 = 5 reais por excesso >20 15 reais)
		
		
	}
	

	public static void main(String[] args) {
		
		do {
		System.out.println("1- Multa por excesso de velocidade");
		System.out.println("2- Comparar string");
		System.out.println("Opção:");
		op=ler.nextInt();
		
		switch(op)
		{
		case 1: multa();
			break;
		case 2: 
			ler.nextLine();
			System.out.println("Informe a palavra a ser comparada 1-2");
		  String str1 =	ler.nextLine();
			System.out.println("Informe a palavra a ser comparada 2-2");
			String str2 = ler.nextLine();
			 ComparaString(str1,str2);
			
			
			
			break;
		case 3:
			break;
			
		}
		}while(op!=3);
		ler.close();
		
	}

}
