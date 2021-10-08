package at02;

import java.util.Scanner;

public class at33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pontu = 0;
		System.out.println("Informe os resultados assinalados pelo candidato:");
		String resposta1 = input.nextLine();
		String resposta2 = input.nextLine();
		String resposta3 = input.nextLine();
		String resposta4 = input.nextLine();
		String resposta5 = input.nextLine();
		String resposta6 = input.nextLine();
		String resposta7 = input.nextLine();
		String resposta8 = input.nextLine();
		String resposta9 = input.nextLine();
		String resposta10 = input.nextLine();
		
		if("a".equals(resposta1)) {
			System.out.println("Q1: " + resposta1 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q1: " + resposta1 + " : Errada, resposta correta(a)");
		}
		if("a".equals(resposta2)) {
			System.out.println("Q2: " + resposta1 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q2: " + resposta2 + " : Errada, resposta correta(a)");
		}
		if("b".equals(resposta3)) {
			System.out.println("Q3: " + resposta3 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q3: " + resposta3 + " : Errada, resposta correta(b)");
		}
		if("b".equals(resposta4)) {
			System.out.println("Q4: " + resposta4 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q4: " + resposta4 + " : Errada, resposta correta(b)");
		}
		if("c".equals(resposta5)) {
			System.out.println("Q5: " + resposta5 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q5: " + resposta5 + " : Errada, resposta correta(c)");
		}
		if("c".equals(resposta6)) {
			System.out.println("Q6: " + resposta6 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q6: " + resposta6 + " : Errada, resposta correta(c)");
		}
		if("d".equals(resposta7)) {
			System.out.println("Q7: " + resposta7 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q7: " + resposta7 + " : Errada, resposta correta(d)");
		}
		if("d".equals(resposta8)) {
			System.out.println("Q8: " + resposta8 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q8: " + resposta8 + " : Errada, resposta correta(d)");
		}
		if("e".equals(resposta9)) {
			System.out.println("Q9: " + resposta9 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q9: " + resposta9 + " : Errada, resposta correta(e)");
		}
		if("e".equals(resposta10)) {
			System.out.println("Q10: " + resposta10 + " : Correto");
			pontu = pontu+1;
		}else {
			System.out.println("Q10: " + resposta10 + " : Errada, resposta correta(e)");
		}
		System.out.println("Pontuação final: " + pontu);
		
		input.close();

	}

}
