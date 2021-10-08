package at02;

import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o preço de custo do produto:");
		double custo = input.nextDouble();
		System.out.println("Insira o código de origem:");
		int codigo = input.nextInt();
		
		if(codigo == 1)
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Sul.");
		else if(codigo == 2)	
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Norte.");
		else if(codigo == 3)	
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Leste.");
		else if(codigo == 4)	
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Oeste.");
		else if((codigo == 5) || (codigo == 6))
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Nordeste.");
		else if((codigo == 7) || (codigo == 8))
			System.out.println("O preço do produto é: R$ " + custo + " e sua procedência Centro-oeste.");	
		else 
			System.out.println("O produto é classificado como importado.");
		input.close();
	}
}
