package at02;

import java.util.Scanner;

public class at22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um n�mero inteiro menor que 1000.");
		int num1000 = input.nextInt();
		
		int uni = (num1000 % 10);
		int dezen = (((num1000 - uni)/10)%10);
		int cent = num1000 / 100;
		System.out.println("O n�mero possuir�: " + cent + " centenas.");
		System.out.println("Possuir�: " + dezen + " dezenas.");
		System.out.println("E possuir�: " + uni + " unidades.");
		
		input.close();
	}

}
