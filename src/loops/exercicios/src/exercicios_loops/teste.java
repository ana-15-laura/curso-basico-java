package exercicios_loops;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int x;
		int soma = 0;
		
		System.out.println("número: ");
		x = scanner.nextInt();
		
		while (x != 0) {
			soma = soma + x;
			x = scanner.nextInt();
		}
		
		System.out.println("soma = " + soma);
		
		scanner.close();
		
	}

}
