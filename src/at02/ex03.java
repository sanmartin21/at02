package at02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira F ou M. ");    
		String sexo = input.nextLine();
		
		if ("F".equalsIgnoreCase(sexo))
			System.out.println("F - Feminino");  
		else if ("M".equalsIgnoreCase(sexo))
			System.out.println("M - Masculino"); 
		else
			System.out.println("A letra inserida não é valida!");
		input.close();
	}
}
