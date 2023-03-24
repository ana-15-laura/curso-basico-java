package condicionalFluxo;

import java.util.Locale;
import java.util.Scanner;

public class controle_switch {

	public static void main(String[] args) {

	
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		
		System.out.println("Digite o numero de um mês: ");
		
		int mes = scanner.nextInt();

		switch (mes) {
		 
		case 1:
		  System.out.println("Janeiro");
		  break;
		 
		 case 2:
		  System.out.println("Fevreiro");
		  break;
		  
		 case 3:
		  System.out.println("Março");
		  break;
		 
		 case 4:
		  System.out.println("Abril");
		  break;
		 
		 case 5:
		 System.out.println("Maio");
		 break;

		 case 6:
			 System.out.println("Junho");
			 break;
		 
		 case 7:
			 System.out.println("Julho");
			 break;
			 			 
		 case 8:
			 System.out.println("Agosto");
			 break;
			 
		 case 9:
			 System.out.println("Setembro");
			 break;
			 
		 case 10:
			 System.out.println("Outubro");
			 break;

		 case 11:
			 System.out.println("Novembro");
			 break;
			 
		 case 12:
			 System.out.println("Dezembro");
			 break;
			 default:
			System.out.println("O valor escolhido é inválido! ");
		}
		
		scanner.close();
	}
		
}
