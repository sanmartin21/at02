package at02;

import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		float result = 0;
		
		System.out.println("Insira o primeiro n�mero:");
		float num1 = input.nextFloat();
		System.out.println("Insira o segundo n�mero:");
		float num2 = input.nextFloat();
		
		System.out.println("Qual Opera��o deseja executar?");
		System.out.println("Op��o 1 = Adi��o, 2- Subtra��o, 3- Divis�o, 4- Multiplica��o ");
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
			System.out.println("N�mero par.");
		else if (result % 2 != 0)
			System.out.println("N�mero impar.");
		
		
		if (result > 0)
			System.out.println("N�mero positivo.");
		else if (result < 0)
			System.out.println("N�mero negativo.");
		
		if (result % 1 != 0)
			System.out.println("O n�mero � decimal.");
			else 
				System.out.println("O n�mero � inteiro.");
		
		input.close();
	}

}
