package at02;

import java.util.Scanner;

public class at16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota:");  
		float nota1 = input.nextFloat(); 
		System.out.println("Insira a segunda nota:");
		float nota2 = input.nextFloat();
		
		float media = (float) ((nota1 + nota2) / 2);
		
		if((media >= 0) && (media < 3))
			System.out.println("Reprovado");
		else if((media >= 3) && (media <= 6.9))
			System.out.println("Em Exame");
		else if((media >= 7) && (media <= 10))
			System.out.println("Aprovado");
		input.close();
	}
}
