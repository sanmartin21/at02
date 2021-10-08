package at02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero1 = input.nextInt();
		System.out.println("Insira mais um número: ");
		int numero2 = input.nextInt();
		
		if (numero1 > numero2) 
			System.out.println(numero1 + " é o maior deles!");
		else if (numero2 > numero1)
			System.out.println(numero2 + " é o maior deles!");
		input.close();
	}

}
