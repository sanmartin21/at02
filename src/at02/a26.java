package at02;

import java.util.Scanner;

public class a26 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um n�mero:");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero � par.");
		}else if (num % 2 != 0) {
			System.out.println("O n�mero � impar.");
	}
		input.close();
	}
	}
