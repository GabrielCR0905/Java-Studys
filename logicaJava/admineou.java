package logicaJava;
  
import java.util.Scanner;



public class admineou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vc é ADMIN ou usuario");
		String login = scanner.next();
		
		System.out.print("Qual a senha sua senha então");
		String senha = scanner.next();
		
    if(login.equals("ADMIN")|| login.equals("admin") && senha.equals("1234")) {
    	
    	System.out.print("Bem-Vindo ADMIN");
    		
    } 
    else {
    	
    	System.out.print("Usuario Incorreto");
    	
    }
    scanner.close();
 	}

}
