package at02;

import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o pre�o de custo do produto:");
		double custo = input.nextDouble();
		System.out.println("Insira o c�digo de origem:");
		int codigo = input.nextInt();
		
		if(codigo == 1)
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Sul.");
		else if(codigo == 2)	
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Norte.");
		else if(codigo == 3)	
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Leste.");
		else if(codigo == 4)	
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Oeste.");
		else if((codigo == 5) || (codigo == 6))
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Nordeste.");
		else if((codigo == 7) || (codigo == 8))
			System.out.println("O pre�o do produto �: R$ " + custo + " e sua proced�ncia Centro-oeste.");	
		else 
			System.out.println("O produto � classificado como importado.");
		input.close();
	}
}
