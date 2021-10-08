package at02;

import java.util.Scanner;

public class at25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		int notacem,nota50, nota10, nota5, nota1;
		int restocem, resto50, resto10, resto5, resto1;
		
		System.out.println("Digite o valor do saque, no mínimo 10 reais e  no máximo 600.)");
		int saque = input.nextInt();
		
		if((saque >= 10) && (saque <= 600)) {
			notacem = saque/100;
			restocem = saque % 100;
		
			nota50 = restocem/50;
			resto50 = restocem % 50;
		
			nota10 = resto50/10;
			resto10 = resto50 % 10;
		
			nota5 = resto10 / 5;
			resto5 = resto10 % 5;
		
			nota1 = resto5 / 1;
			resto1 = resto5 % 1;
		
		System.out.println("As notas fornecidas serão: ");
		System.out.println(notacem + " nota(s) de 100");
		System.out.println(nota50 + " nota(s) de 50");
		System.out.println(nota10 + " nota(s) de 10");
		System.out.println(nota5 + " nota(s) de 5");
		System.out.println(nota1 + " nota(s) de 1");
		
		} else {
			System.out.println("O valor de saque é inválido.");
		}
		
		input.close();
	}

}
