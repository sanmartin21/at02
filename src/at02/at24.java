package at02;

import java.util.Scanner;

public class at24 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira as três notas:");
		int nota = input.nextInt();
		int nota2 = input.nextInt();
		int nota3 = input.nextInt();
		
		float mediaf = ((nota + nota2 + nota3)/ 3);
		
		
		if (mediaf == 10) {
			System.out.println("Aprovado com Distinção.!");
		}else if (mediaf >= 7) {
			System.out.println("Aprovado!");
		}else if (mediaf < 7) {
			System.out.println("Reprovado!");
	}
		input.close();
	}
}
