package exercicios_loops;

import java.util.Scanner;

public class impar_par {

	public static void main(String[] args) {

/*Faça um programa que peça N números inteiros,	calcule e mostre a quantidade de números
pares e a quantidade de números impares.*/
		
		Scanner scanner = new Scanner (System.in);
		
		int quantNumeros;
		int numero;
		int impar = 0, par = 0;
		
		System.out.println("quantos números: ");
		quantNumeros = scanner.nextInt();
		
		int contador = 0;
		
		do {
			System.out.println("Número: ");
			numero = scanner.nextInt();
						
			if (numero % 2 == 0) par++;
			else impar++;
			
			contador++;
			
		}while(contador < quantNumeros);
		
		System.out.println("Quantidade par: " + par);
		System.out.println("Quantidade impar: " + impar);
		
	}

}
