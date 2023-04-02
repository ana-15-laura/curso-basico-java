package exercicios_loops;

import java.util.Locale;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.*/
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
		int nota;
		
		System.out.println("Nota: ");
		nota = scanner.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota Invávlida. Digite novamente: ");
			nota = scanner.nextInt();
		}
		
		System.out.println("Termina aqui.");
	}

}
