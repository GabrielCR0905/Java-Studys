package logicaJava;

import java.util.Scanner;

public class medialuno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno:");
		int nota = scanner.nextInt();
		
       if(nota >= 9) {
    	   System.out.print("Exemplar");
       }
       else if(nota <= 8 && nota >= 7  ) {
    	   System.out.print("Acima da Media");
    	   
       }else if(nota <= 7 && nota >= 5) {
    	   System.out.print("Voce Passou");
       }
       else {
    	   System.out.print("Está de Recuperação");
       }
	}

}
