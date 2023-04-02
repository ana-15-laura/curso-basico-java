package exercicios_loops;

import java.util.Scanner;


public class tabuada {

	public static void main(String[] args) {
/*Desenvolva um gerador de tabuada,capaz de gerar a tabuada de qualquer número inteiro 
entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50*/
		Scanner scanner = new Scanner (System.in);

		int tabuada;
		
		System.out.println("tabuada: ");
		tabuada = scanner.nextInt();
		
		System.out.println("Tabuada do: " + tabuada);
		
		for (int contador = 1; contador >= 1 && contador <=10; contador ++){
			
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
	
	}

}
