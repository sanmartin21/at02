package at02;

import java.util.Scanner;

public class at19 extends at17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float x, delta;
		
		System.out.println("Insira o valor de a:");
		float a = input.nextFloat();
		if(a == 0) {
			System.out.println("A equação não é do segundo grau.");
			System.exit(0);		
		}
		System.out.println("Insira o valor de b:");
		float b = input.nextFloat();
		System.out.println("Insira o valor de c:");
		float c = input.nextFloat();
		
		delta = (b*b) + (-4 * (a*c)); 
		if (delta < 0 ) {
			System.out.println("Delta resultante é negativo, a equação não possui raizes reais.");
			System.exit(0);	
		}else if(delta == 0) {
			System.out.println("Delta resultante é zero, a equação possui apenas uma raiz real.");
		}else if(delta > 0) {
			System.out.println("Delta resultante é positivo, a equação possui duas raizes reais.");
		}
		
		float x1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
		float x2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);
		
		System.out.println("x' = " + x1);
		System.out.println("x'' = " + x2);
	
		input.close();

	}

}
