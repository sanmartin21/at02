package at02;

import java.util.Scanner;

public class at30 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		double valor = 0, desconto = 0, vfinal = 0;
		
		System.out.println("Qual tipo de combustível?");
		System.out.println("A - Álcool, G - Gasolina");
		String tipo = input.nextLine();
		
		System.out.println("Quantos litros de combustível?");
		float litros = input.nextFloat();
		
		if ((("a".equalsIgnoreCase(tipo)) && (litros <=20))) {
			valor = (litros * 1.90);
			desconto = (valor/100) * 3;
			vfinal = (valor-desconto);
			System.out.println("O valor a ser pago pelo cliente será:" + vfinal);
		}else if ((("a".equalsIgnoreCase(tipo)) && (litros >20))) {
				valor = (litros * 1.90);
				desconto = (valor/100) * 5;
				vfinal = (valor-desconto);
		System.out.println("O valor a ser pago pelo cliente será:" + vfinal);
		}
		
		
		if ((("g".equalsIgnoreCase(tipo)) && (litros <=20))) {
			valor = (litros * 2.5);
			desconto = (valor/100) * 4;
			vfinal = (valor-desconto);
			System.out.println("O valor a ser pago pelo cliente será:" + vfinal);
		}else if ((("g".equalsIgnoreCase(tipo)) && (litros >20))) {
				valor = (litros * 2.5);
				desconto = (valor/100) * 6;
				vfinal = (valor-desconto);
		System.out.println("O valor a ser pago pelo cliente será:" + vfinal);
		}
		input.close();
	}
}
