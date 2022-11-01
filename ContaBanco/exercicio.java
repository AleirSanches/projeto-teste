package empresa;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
	
		Scanner input= new Scanner(System.in);
		
		
		Account cliente1= new Account("Carol Peixoto",1000.);
		System.out.println();
		Account cliente2= new Account("Wagner Sanches",2500.);
		
		
		System.out.println(cliente1.getBalance());    
		System.out.println();
		System.out.println(cliente2.getBalance());  
		
		System.out.printf("Cliente 1 digite o valor que deseja deposotar ");
		Double deposi1=input.nextDouble();
		
		cliente1.valorDeposito(deposi1);
		
		System.out.println(cliente1.getBalance());
		
		cliente1.valorTranferido(100., cliente2);
		
		System.out.println(cliente1.getBalance());   
		System.out.println(cliente2.getBalance());    
		
	}	

}
