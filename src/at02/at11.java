package at02;

import java.util.Scanner;

public class at11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Em que turno você estuda? Insira M-Matutino ou V - Vespertino ou N - Noturno.)");
		String p = input.nextLine();
		
		if("M".equalsIgnoreCase(p))
			System.out.println("Bom dia!");
		else if ("V".equalsIgnoreCase(p))
			System.out.println("Boa tarde!");
		else if ("N".equalsIgnoreCase(p))
			System.out.println("Boa noite!");
		else 
			System.out.println("A letra inserida é inválida.");
		input.close();
	}

}
