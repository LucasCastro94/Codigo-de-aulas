package Udemy.Geek.secao07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
      
	  int i=0;		
		
	  float numero, maior=0;
	  
	  
	  do
	  {
		  i++;
	  System.out.println("Informe o valor do numero de posi��o "+i);
	  numero = ler.nextFloat();
	  
	  if(numero>maior)
	  {
		  maior = numero;
	  }
	 
	  }while(numero != 0 );
	
	System.out.println("O maior numero �:"+maior);
	
ler.close();	}

}
