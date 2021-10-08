package at02;

import java.util.Scanner;

public class at21 {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma data no formato dd/mm/aaaa: ");
		System.out.println("Dia:");
		int dia = input.nextInt();
		System.out.println("Mês:");
		int mes = input.nextInt();
		System.out.println("Ano:");
		int ano = input.nextInt();
		
		if((dia >= 1) && (dia <= 31))
			if((mes >= 1) && (mes <= 12)) 
				if(ano  > 0) 
					System.out.println("É uma data válida.");
		
		if((((dia == 0) || (dia > 31))) || ((mes == 0) || (mes > 12)) || (ano  < 0))
			System.out.println("É uma data inválida.");
			
		input.close();	

	}

}
