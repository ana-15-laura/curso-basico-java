package exercicios_loops;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int n;
		int numero;
		int contador = 0;
		int soma = 0;
		
		System.out.println("número: ");
		n = scanner.nextInt();
		
		for (contador = 0; contador < n; contador++) {
			System.out.println("numero: ");
			numero = scanner.nextInt();
			soma = soma + numero;
		}
		System.out.println("soma = " + soma);
		
		scanner.close();
		
	}

}
