package at02;

import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		float result = 0;
		
		System.out.println("Insira o primeiro número:");
		float num1 = input.nextFloat();
		System.out.println("Insira o segundo número:");
		float num2 = input.nextFloat();
		
		System.out.println("Qual Operação deseja executar?");
		System.out.println("Opção 1 = Adição, 2- Subtração, 3- Divisão, 4- Multiplicação ");
		int opcao = input.nextInt();
		
		if (opcao == 1)
			result = num1 + num2;
		else if (opcao == 2)
			result = num1 - num2;
		else if (opcao == 3)
			result = num1 / num2;
		else if (opcao == 3)
			result = num1 * num2;
		
		System.out.println("O resultado foi: " + result);
		
		if (result % 2 == 0)
			System.out.println("Número par.");
		else if (result % 2 != 0)
			System.out.println("Número impar.");
		
		
		if (result > 0)
			System.out.println("Número positivo.");
		else if (result < 0)
			System.out.println("Número negativo.");
		
		if (result % 1 != 0)
			System.out.println("O número é decimal.");
			else 
				System.out.println("O número é inteiro.");
		
		input.close();
	}

}
