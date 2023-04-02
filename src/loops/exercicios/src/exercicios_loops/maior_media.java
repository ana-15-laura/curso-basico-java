package exercicios_loops;

import java.util.Locale;
import java.util.Scanner;

public class maior_media {

	public static void main(String[] args) {
/*Faça um programa que leia 5 números e informe o maior número
e a média desses números.*/
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
		System.out.println("Número: ");
		numero = scanner.nextInt();
		count = count +1;
		soma = soma + numero;
		System.out.println("Soma: " + soma);
		
		if (numero > maior) maior = numero;
		
		}while(count < 5);
		
		System.out.println("Maior número é: " + maior);
		System.out.println("Média: " + (soma/5));
	}

}
