package at02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um n�mero que possua 4 d�gitos.");
		int anoquatrodigitos = input.nextInt();
		
		if (anoquatrodigitos  % 400 == 0)
			System.out.println("O ano inserido � bissexto.");
		else if ((anoquatrodigitos  % 4 == 0) && (anoquatrodigitos  % 100 != 0))
			System.out.println("O ano inserido � bissexto.");
		else
			System.out.println("O ano inserido n�o � bissexto.");
		input.close();
	}
}
