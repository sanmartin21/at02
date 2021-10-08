package at02;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args){ 
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero.");
		int numero1= input.nextInt();
		System.out.println("Insira o segundo numero.");
		int numero2= input.nextInt();
		System.out.println("Insira o terceiro numero.");
		int numero3= input.nextInt();
		
	if ((numero1 > numero2) && (numero2 > numero3)){
			System.out.println(numero1 +" " + numero2 +" " + numero3);
	}else if((numero1 > numero3) && (numero3 > numero2)){ 
			System.out.println(numero1 +" " + numero3 +" " + numero2);
	}else if ((numero2 > numero1) && (numero1 > numero3)){
			System.out.println(numero2 +" " + numero1 +" " + numero3);
	}else if ((numero2 > numero3) && (numero3 > numero1)){ 
			System.out.println(numero2 +" " + numero3 +" " + numero1);
	}else if ((numero3 > numero1) && (numero1 > numero2)) { 
			System.out.println(numero3 +" " + numero1 +" " + numero2);
	}else if ((numero3 > numero2) && (numero2 > numero1)) 
			System.out.println(numero3 +" " + numero2 +" " + numero1);
	input.close();
	}
}
