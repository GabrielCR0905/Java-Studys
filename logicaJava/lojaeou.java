package logicaJava;

import java.util.Scanner;

public class lojaeou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor da Compra");
		double Valorproduto = scanner.nextDouble();
		
		System.out.print("Possui Cupom de Desconto? (S/N");
		char temcupom = scanner.next().charAt(0);
		
		
		if(Valorproduto > 100 || temcupom == 's' || temcupom == 'S') {
			
			double desconto  = Valorproduto - 0.10;
			Valorproduto -= desconto ;
			
			System.out.print("Desconto Aplicado Valor a pagar.." + Valorproduto);
			
		}else {
			System.out.print("Sem Desconto Aplicado Valor a Pagar.." + Valorproduto);
			
		}
      scanner.close();
	}

}
