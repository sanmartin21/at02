package at02;

import java.util.Scanner;

public class at20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um ano: ");
		int ano = input.nextInt();
		
		if (ano % 400 == 0)
			System.out.println("É um ano bissexto.");
		else if ((ano % 4 == 0) && (ano % 100 != 0))
			System.out.println("É um ano bissexto.");
		else
			System.out.println("Não é um ano bissexto.");
		
		input.close();

	}

}
