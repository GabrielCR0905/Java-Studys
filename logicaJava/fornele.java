package logicaJava;
import java.util.Scanner;
public class fornele {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero");
		int num = scanner.nextInt();
		
		for(int i = 0; i < num;i--) {
			System.out.print(i);
		}
scanner.close();
	}

}
