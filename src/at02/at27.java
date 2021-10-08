package at02;

import java.util.Scanner;

public class at27 {

	public static void main(String[] args) {


Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número:");
		float num = input.nextFloat();
		
		if (num % 1 != 0)
			System.out.println("O número é decimal.");
		else
			System.out.println("O número é inteiro.");
		
		input.close();
	}
}
