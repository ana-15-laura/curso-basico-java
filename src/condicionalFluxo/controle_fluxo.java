package condicionalFluxo;

import java.util.Locale;
import java.util.Scanner;

public class controle_fluxo {

	public static void main(String[] args) {

		//if-else sem ser em formato de flecha
		
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		
		System.out.println("Digite o numero de um mês: ");
		
		int mes = scanner.nextInt();

		
		if (mes == 1) {
			System.out.println("Janeiro");
		}else 
			if (mes == 2) {
			System.out.println("Fevreiro");
		}else 
			if (mes == 3) {
			System.out.println("Março");	
		}else
			if (mes == 4) {
			System.out.println("Abril");	
		}else 
			if (mes == 5) {
			System.out.println("Maio");	
		}else 
			if (mes == 6) {
			System.out.println("Junho");	
		}else 
			if (mes == 7) {
				System.out.println("Julho");
		}else 
			if (mes == 8) {
				System.out.println("Agosto");
		}else 
			if (mes == 9) {
				System.out.println("Setembro");
		}else
			if (mes == 10) {
				System.out.println("Outubro");
		}else 
			if (mes == 11) {
				System.out.println("Novembro");
		}else 
			if (mes == 12) {
				System.out.println("Dezembro");
		}else {
			System.out.println("o mês não existe no calendário");
		}
		
		scanner.close();
	}
		
}
