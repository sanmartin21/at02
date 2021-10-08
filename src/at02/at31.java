package at02;

import java.util.Scanner;
public class at31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double vm1 = 2.50;
		double vm2 = 2.20;
		double vmaca1 = 1.80;
		double vmaca2 = 1.50;
		double totalm,totalmaca,valordesconto, desconto = 0;
		double total;
		
		System.out.println("Insira os kg de morangos adquiridos:");
		float morango = input.nextFloat();
		System.out.println("Insira os kg de maçãs adquiridas:");
		float maca = input.nextFloat();
		
		double kg = morango+maca;
		if(morango <= 5) {
			totalm = morango * vm1;
			total = totalm;
		} else {
			totalm = morango * vm2;
			total = totalm;
			
		}if(maca <= 5) {
			totalmaca = maca * vmaca1;
			total = total + totalmaca;
		}else {
			totalmaca = maca * vmaca2;
			total = total + totalmaca;
			
		}if((kg > 8) || (total > 25)) {
			desconto = ((total/100)*10);
			valordesconto = total-desconto;
			System.out.println(" O valor a ser pago já com 10% de desconto, será R$ " + valordesconto);
			System.exit(0);	
		}
		System.out.println("O valor a ser pago será: R$ " + total);
		input.close();
	}

}
