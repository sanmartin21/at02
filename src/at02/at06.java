package at02;

import java.util.Scanner;

public class at06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um n�mero inteiro.");
		int numero= input.nextInt();
		
		if(numero % 2 == 0 )
			System.out.println("Como o n�mero inserido � par, ao transformarmos o mesmo para �mpar, teremos: " + (numero-1) + " ou " + (numero+1));
		else
			System.out.println("Como o n�mero inserido � impar, ao transformarmos o mesmo para par, teremos: " + (numero-1) + "  ou  " + (numero+1));
		input.close();
	}
}
