package Udemy.Geek.secao07;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int id;
		int quantidade=0, esfera=0, limpeza=0, troca_cabo=0, quebrado=0;
		int cod_ident;
		
		float perc1=0,perc2=0,perc3=0,perc4=0;
		
		Scanner ler = new Scanner (System.in);
		
		while(true)
		{
			System.out.println("Informe a ID:");
			id=ler.nextInt();
			if(id==0)
			{
				System.out.println("FIM!");
				break;
			}
			
			System.out.println("Infome o codigo do defeito");
			System.out.println("<1> Necessita da esfera");
			System.out.println("<2> Necessita de limpeza");
			System.out.println("<3> Necessita trocar o cabo");
			System.out.println("<4> Quebrado");
			System.out.println("Opção desejada:");
			cod_ident=ler.nextInt();
			
			if(cod_ident>0 && cod_ident<5)
			{   
				quantidade++;
				
				if(cod_ident==1)
				{
					esfera++;
				}
				
				if(cod_ident==2)
				{
					limpeza++;
				}
				
				if(cod_ident==3)
				{
					troca_cabo++;
				}
				
				if(cod_ident==4)
				{
					quebrado++;
				}
				
				System.out.println("Quantidade UP");
				System.out.println(quantidade);
			}
			
			else
			{
				System.out.println("Opção Invalida tente novamente");
			}
			
			
		}
		
		perc1 = ((float)esfera/(float)quantidade)*(float)100;
		perc2 = ((float)limpeza/(float)quantidade)*(float)100;
	    perc3 = ((float)troca_cabo/(float)quantidade)*(float)100;
	    perc4 = ((float)quebrado/(float)quantidade)*(float)100;
		
	    
	    
		System.out.printf("\n                                  Quantidade total       %.1f",(float)quantidade);
		System.out.printf("\n<1> Necessita da esfera              %d                  %.1f%%",esfera,perc1);
		System.out.printf("\n<2> Necessita de limpeza             %d                  %.1f%%",limpeza,perc2);
		System.out.printf("\n<3> Necessita trocar o cabo          %d                  %.1f%%",troca_cabo,perc3);
		System.out.printf("\n<4> Quebrado                         %d                  %.1f%%",quebrado,perc4);
		
		
ler.close();
	}

}
