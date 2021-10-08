package at02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma letra: ");  
		String letra = input.nextLine();
		if (("A".equalsIgnoreCase(letra)) || ("E".equalsIgnoreCase(letra)) || ("I".equalsIgnoreCase(letra)) || ("O".equalsIgnoreCase(letra)) || ("U".equalsIgnoreCase(letra)))
			System.out.println("A letra inserida é uma vogal!");
		else 
			System.out.println("A letra inserida não é uma vogal!");
		input.close();
	}

}
