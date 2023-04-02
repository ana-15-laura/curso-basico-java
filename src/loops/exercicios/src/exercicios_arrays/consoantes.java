package exercicios_arrays;

import java.util.Scanner;

public class consoantes {

	public static void main(String[] args) {

/*Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas. Imprima as consoantes.*/
		
		Scanner scanner = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		String letra;
		int count = 0;
		do {
			System.out.println("letra: ");
			letra = scanner.next();
			
			if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
				consoantes[count] = letra;
				quantidadeConsoantes++;
				}
				count++;
		}while(count < consoantes.length);
		
		System.out.println("consoantes: ");
		
		for( String consoante : consoantes ) {
			System.out.println(consoante);
		}
		
	}

}
