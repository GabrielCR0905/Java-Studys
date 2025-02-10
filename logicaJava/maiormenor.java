package logicaJava;

import java.util.Scanner;

public class maiormenor {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um numero");
    int numero1 = scanner.nextInt();
    
    System.out.print("Digite o segundo numero");
    int numero2= scanner.nextInt();
    
    if( numero1 > numero2) {
    	
    	System.out.print("O primeiro numero é maior");
    	
    }
    else {
    	System.out.print("O Segundo numero é maior");
    	
    	
    }
     scanner.close();

	}

}
