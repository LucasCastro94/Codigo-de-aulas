package ProgramasJava;

import java.util.Scanner;

public class MediaXalunos {

	public static void main(String[] args) {
		
		
		//variaveis
		
		int qtd=0,i;
		
		
		Scanner ler = new Scanner (System.in);
		
		String nome[] ,Nmaior = null, Nmenor = null ; 
		float n1[];
		float n2[];
		float soma, media[];
		float menor=90000, maior=0;
		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("   --------------------- Dados alunos 2 semestre ------------------------");
		System.out.println("----------------------------------------------------------------------------");
        
	    System.out.println("Informe a quantidade de alunos a ser inserido:");
	    qtd=ler.nextInt();

	   nome= new String [qtd];
	   n1 = new float [qtd];
	   n2 = new float [qtd];
	   media = new float [qtd];
	   float p1 = (float)4, p2 = (float) 6;
	   
	   for(i=0;i<qtd;i++)
	   {  // clearBuffer(ler);
		   ler.nextLine();
		   System.out.println("\t\tCadastro N°"+(i+1));
		   System.out.println("Nome do aluno:");
		   
		   nome[i]= ler.nextLine();
		   
		   
		   System.out.println("Nota 1:");
		   n1[i]=ler.nextFloat();
		   
		   System.out.println("Nota 2:");
		   n2[i]=ler.nextFloat();
		   
		   //media ponderada peso 4 e 6
		   
		   
		   
		   soma=((n1[i]*p1)+(n2[i]*p2))/10;;
		   
		   
		   
		   media[i]=soma;
		   
		   if(media[i] > maior)
		   {
			   maior=media[i];
			   Nmaior = nome[i];
		   }
		   
		   if(media[i]<menor)
		   {
			   menor=media[i];
			   Nmenor=nome[i];
		   }
		   
	   }
	   
	   
	    System.out.println("Maior media");
	   System.out.println(Nmaior);
	    System.out.println(maior);
	    
	    System.out.println("Menor media");
	   System.out.println(Nmenor);
	    System.out.println(menor);
	    
	    
	    ler.close();

	}
	/*
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }} */
	
	
}
