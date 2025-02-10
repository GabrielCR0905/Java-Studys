package logicaJava;

import java.util.Scanner;
public class parimpar {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite um numero:");
       int num= sc.nextInt();
       
       if(num % 2 == 0) {
    	   System.out.print("é par" + num);
       }else {
    	   System.out.print("é impar" + num);
       }
       sc.close();
	}

}
