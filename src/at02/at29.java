package at02;

import java.util.Scanner;

public class at29 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		int result = 0;
		
		System.out.println("Telefonou para a vítima?");
		System.out.println("Sim = 1, Não = 2");
		int SN = input.nextInt();
		
		if (SN == 1)
			result = result + 1;
		
		System.out.println("Esteve no local do crime?");
		System.out.println("Sim = 1, Não = 2");
		int SN1 = input.nextInt();
		
		if (SN1 == 1)
			result = result + 1;
		
		System.out.println("Mora perto da vítima?");
		System.out.println("Sim = 1, Não = 2");
		int SN2 = input.nextInt();
		
		if (SN2 == 1)
			result = result + 1;
		
		System.out.println("Devia para a vítima?");
		System.out.println("Sim = 1, Não = 2");
		int SN3 = input.nextInt();
		
		if (SN3 == 1)
			result = result + 1;
		
		System.out.println("Já trabalhou com a vítima?");
		System.out.println("Sim = 1, Não = 2");
		int SN4 = input.nextInt();
		
		if (SN4 == 1)
			result = result + 1;
		
		if (result == 2) {
		System.out.println("Suspeita.");
		
		}else if ((result >= 3) && (result <= 4)) {
		System.out.println("Cumplice.");
		
		}else if (result == 5) {
		System.out.println("Assassino");
		
		}else {
			System.out.println("Inocente");
	}
		input.close();
	}
}
