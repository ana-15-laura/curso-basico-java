package exercicios_loops;

import java.util.Locale;
import java.util.Scanner;

public class nome_idade {

	public static void main(String[] args) {

/*Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)*/
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		String nome; 
		int idade;
		
		while(true) {
		System.out.println("Escreva seu nome: ");
		nome = scanner.next();
		if(nome.equals("0")) break;
		
		System.out.println("Escreva sua idade: ");
		idade = scanner.nextInt();
	
		}
		
		System.out.println("Valor inadequado a variavel!");
		
	}

}
