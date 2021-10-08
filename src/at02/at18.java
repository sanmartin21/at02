package at02;

import java.util.Scanner;

public class at18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a medida de um lado do triângulo: "); 
		float l1 = input.nextFloat();
		System.out.println("Insira a medida do segundo lado do triângulo: ");
		float l2 = input.nextFloat();
		System.out.println("Insira a medida do terceiro lado do triângulo: "); 
		float l3 = input.nextFloat();
		
		if((l1 + l2 ) > l3)
			System.out.println("Pode sim ser um triângulo.");
		else if((l1 + l3 ) > l2)
			System.out.println("Pode sim ser um triângulo.");
		else if((l2 + l3 ) > l1)
			System.out.println("Pode sim ser um triângulo.");
		else 
			System.out.println("Não pode ser um triângulo.");
		
		if((l1 == l2) && (l1 == l3))
			System.out.println("Trata-se de um triângulo equilátero.");
		else if((l1 == l2) || (l1 == l3) || (l3 == l2))
			System.out.println("Trata-se de um triângulo isósceles.");
		else 
			System.out.println("Trata-se de um triângulo escaleno.");
		
		input.close();

	}

}
