package logicaJava;

import java.util.Scanner;

public class logicaoue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Voce tem quantos anos:");
		double idade = scanner.nextDouble();
		
		System.out.print("Voce tem carteira de Motorista?:");
		String carteira = scanner.next();
		
		if (idade >= 18  && (carteira == "Sim" || carteira == "sim")) {
			
			System.out.print("Voce está apto para dirigir");
			
		}else {
			System.out.print("Voce NÃO está apto para DIRIGIR!!!");
			
		}
		

	}

}
