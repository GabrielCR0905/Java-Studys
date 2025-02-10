package logicaJava;

import java.util.Scanner;

public class logica2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero Inteiro:");
		int num = scanner.nextInt();
		
		if ( num > 0 && num % 2 == 0) {
			System.out.print("O numero é Inteiro e Par");
		}
		else if( num < 0 || num % 2 != 0 ) {
			System.out.print("O numero é negativo ou impar");
			
			
		}
		scanner.close();
		
	}

}
