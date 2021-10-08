package at02;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sexo, infopeso;
		double altura, pesoideal, mediapeso;
	
		System.out.println("Insira sua altura.");
		altura = input.nextDouble();
		System.out.println("Insira seu peso.");
		mediapeso = input.nextDouble();
		System.out.println("Insira seu sexo, Feminino ou Masculino.");
		sexo = input.next();
		
		if(sexo.equals("Feminino")) 
			pesoideal = (62.1*altura)-44.7;
		else 
			pesoideal = (72.7*altura)-58;

		if(mediapeso > pesoideal) 
			infopeso = "O peso está acima do ideal.";
		else if(mediapeso < pesoideal) 
			infopeso = "O peso está abaixo do ideal.";
		else 
			infopeso = "Pessoa possui um peso ideal";
		
		System.out.println("A altura informada foi: " + altura);
		System.out.println("O peso informado foi: " + mediapeso);
		System.out.println("O sexo informado foi: " + sexo);
		System.out.println("O peso ideal é: " + pesoideal);
		System.out.println(infopeso);
		input.close();
	}

}
