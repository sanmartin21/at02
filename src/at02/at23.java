package at02;

import java.util.Scanner;

public class at23 {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira as três idades:");
		int idade = input.nextInt();
		int idade2 = input.nextInt();
		int idade3 = input.nextInt();
		
		float mediaf = ((idade + idade2 + idade3)/ 3);
		
		if (mediaf < 25) {
		System.out.println("Turma Jovem");
		}else if ((mediaf >= 25) && (mediaf <= 40)){
		System.out.println("Turma Adulta");
		}else if (mediaf >= 40) {
		System.out.println("Turma Idosa");
		}
		input.close();
	}

}
