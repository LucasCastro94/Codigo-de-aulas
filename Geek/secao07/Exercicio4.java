package Udemy.Geek.secao07;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int i;
		int num, soma=0;
		int maior=0, menor=99999999; 
		
		float media;
		
        System.out.println("Informe 10 numeros inteiros e positivo..");
        
        for(i=0;i<10;i++)
        {  
        	System.out.printf("Infome o numero %d/10:",i+1);
        	num=ler.nextInt();
        	
        	if(num<0)
        	{
        		i=i-1;
        	}
        	else
        	{
        		if(num<menor)
        		{
        			menor= num;
        		}
        		
        		if (num>maior)
        		{
        			maior= num;
        		}
        		
        		soma=soma+num;
        		
        	}
        }
        
        media = soma /10;
        
        System.out.println("Maior ="+maior);
        System.out.println("Menor ="+menor);
        System.out.println("Media ="+media);
        
    ler.close();
	}

}
