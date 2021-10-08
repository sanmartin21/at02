package at02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número que possua 4 dígitos.");
		int anoquatrodigitos = input.nextInt();
		
		if (anoquatrodigitos  % 400 == 0)
			System.out.println("O ano inserido é bissexto.");
		else if ((anoquatrodigitos  % 4 == 0) && (anoquatrodigitos  % 100 != 0))
			System.out.println("O ano inserido é bissexto.");
		else
			System.out.println("O ano inserido não é bissexto.");
		input.close();
	}
}
