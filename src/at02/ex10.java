package at02;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int menor, maior;
		System.out.println("Insira um n�mero.");
		int n1 =  input.nextInt();
		System.out.println("Insira outro n�mero.");
		int n2 =  input.nextInt();
		System.out.println("Insira mais um �ltimo n�mero.");
		int n3 =  input.nextInt();
		
		if((n1 >= n2) && (n2 >= n3))
			maior = n1;
		else if ((n2 >= n1) && (n1 >= n3))
			maior = n2;
		else
			maior = n3;
		
		if((n1 <= n2) && (n2 <= n3))
			menor = n1;
		else if ((n2 <= n1) && (n1 <= n3))
			menor = n2;
		else
			menor = n3;
		
		System.out.println("O maior n�mero � o: " + maior);
		System.out.println("O menor n�mero � o: " + menor);	
		input.close();
	}

}
