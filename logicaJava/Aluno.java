package logicaJava;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota A do Aluno");
		double notaA = scanner.nextDouble();
		
		System.out.print("Digite a nota B do Aluno");
		double notaB = scanner.nextDouble();
		
		System.out.print("Digite a nota C do Aluno");
		double notaC = scanner.nextDouble();
		
		double media = (notaA + notaB + notaC)/3;
		
		if(media <=5 ) {
			System.out.print("Reprovado"+ media);
			
		}
		else if(media >=5 && media <=8) {
			System.out.print("Na MEDIA" + media);
		}
		else {
			System.out.print("Aluno nota 10"+ media);
		}
		scanner.close();
	}

}
