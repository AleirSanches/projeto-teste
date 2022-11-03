package leitura;

import java.util.Scanner;

public class LeituraTeste {

	

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
		double total=0;
		double ferias=0;
		double aluguel=0;
		double alimentacao=0;
		double vestuario=0;
		double educacao=0;
		int sentinela=0;
		int t=0;
		
		
		while (sentinela >=0)
		{
			System.out.println("Digite o valor das ferias:");
			double feria1=input.nextDouble();
			ferias+=feria1;
			total+=feria1;
			System.out.println();
			System.out.println("Digite o valor do aluguel:");
			double alu1=input.nextDouble();
			aluguel+=alu1;
			total+=alu1;
			System.out.println();
			System.out.println("Digite o valor da alimentação do mês:");
			double ali1=input.nextDouble();
			alimentacao+=ali1;
			total+=ali1;
			System.out.println();
			System.out.println("Digite o valor gasto em vestuario:");
			double vest1=input.nextDouble();
			vestuario+=vest1;
			total+=vest1;
			System.out.println();
			System.out.println("Digite o valor gosto com educação:");
			double edu1=input.nextDouble();
			educacao+=edu1;
			total+=edu1;
		
			System.out.println();
			
			System.out.println("Digite valor do sentinela");
			sentinela=input.nextInt();
			
		}
		if (total<140.0) 
		{
			 t=1;
		}
		else if  (total> 140.00 && total < 2800.00)
		{
			 t=2;
		}
		else if  (total> 2800.00 && total < 3700.00)
		{
			 t=3;
		}
		else {
			 t=4;
		}

		switch (t) {
		
		  case 1: 
			  System.out.println("Insento de imposto%n");
			  break;
			  
		  case 2: 
			  System.out.printf("Imposto de US$ %.2f%n,", total*0.075);	 
			  break;
			  
		  case 3: 
			  System.out.printf("Imposto de US$ %.2f%n,", total*0.15);	
			  break;
			  
		  case 4: 
			  System.out.printf("Imposto de US$ %.2f%n", total*0.22);	
			  break;
		}
		System.out.printf(" Total= %.2f%n",total);
		System.out.printf(" Ferias= %.2f%n",ferias);
		System.out.printf(" Alimentação = %.2f%n",alimentacao);
		System.out.printf(" educação = %.2f%n",educacao);
		System.out.printf(" Vestuario = %.2f%n",vestuario);
		System.out.printf(" Aluguel = %.2f%n", aluguel);
			
		}
		
		
	   
		
}

