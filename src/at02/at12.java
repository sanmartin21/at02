package at02;

import java.util.Scanner;

public class at12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double aumentosalarial, novosalario;
		String percentualdeaumento;
		
		System.out.println("Informe o salário do colaborador:");
		double salario = input.nextDouble();
		
		if(salario <= 280) {
			aumentosalarial = ((salario/100) * 20);
			percentualdeaumento = "20%";
			novosalario = salario + aumentosalarial;
		}else if((salario > 280) && (salario <= 700)) {
			aumentosalarial = ((salario/100) * 15);
			percentualdeaumento = "15%";
			novosalario = salario + aumentosalarial;
		}else if ((salario > 700) && (salario < 1500)) {
			aumentosalarial =  ((salario/100) * 10);
			percentualdeaumento = "10%";
			novosalario = salario + aumentosalarial;
		}else {
			aumentosalarial = ((salario/100) * 5);
			percentualdeaumento = "5%";
			novosalario = salario + aumentosalarial;
		}
		System.out.println("O salário antes do reajuste era R$ = " + salario);
		System.out.println("O percentual de aumento aplicado foi: " + percentualdeaumento);
		System.out.println("O valor do aumento foi R$ = " + aumentosalarial);
		System.out.println("O novo salário após o aumento será R$ = " + novosalario);
		input.close();
	}

}
