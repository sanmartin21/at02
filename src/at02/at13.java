package at02;

import java.util.Scanner;

public class at13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double impostorenda = 0;
		
		System.out.println("Qual o valor da sua hora trabalhada? ");
		double horatrabalhada = input.nextDouble();
		System.out.println("Qual a quantidade de horas trabalhadas no mês? ");
		double horasmes = input.nextDouble();
		double salariofinal= (horatrabalhada  * horasmes);
		
		if(salariofinal <= 900) 
			impostorenda = 0.00;
		else if((salariofinal > 900) && (salariofinal <= 1500)) 
			impostorenda = ((salariofinal/100) * 5);
		else if((salariofinal > 1500) && (salariofinal <= 2500)) 
			impostorenda = ((salariofinal/100) * 10);
		else if(salariofinal > 2500) 
			impostorenda = ((salariofinal/100) * 20);
		
		double INSS = ((salariofinal/100) * 10);
		double FGTS= ((salariofinal/100) * 11);
		double descontostotal = (impostorenda+INSS);
		double salarioliquido = (salariofinal-descontostotal);
		
		System.out.println("Salário bruto: ( "+horatrabalhada +" * "+ horasmes+" ): R$ "+salariofinal);
		System.out.println("(-)IR (5%) : R$ " + impostorenda);
		System.out.println("(-)INSS (10%) : R$ " + INSS);
		System.out.println("FGTS (11%): R$ " +FGTS);
		System.out.println("Total de descontos: R$ " + descontostotal);
		System.out.println("Salário liquido: R$ " + salarioliquido);
		input.close();
	}
}
