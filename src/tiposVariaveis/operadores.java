package tiposVariaveis;

public class operadores {

	public static void main(String[] args) {
		
		/* Operadores Aritméticos */
		
		int numero = 5;
		String nome = "Ana " + "Laura"; /*o símbolo de + entre duas strings
		serve para a concatenação (junção) das duas palavras.*/
		
		System.out.println(nome);
		System.out.println("Soma: " + (numero + numero)); //soma
		System.out.println("Menos: " + (numero - numero)); //menos
		System.out.println("Multiplicação: " + (numero * numero)); //multiplicação
		System.out.println("Divisão: " + (numero / numero)); //divisão
		System.out.println("Resto de divisão: " + (numero % numero)); //resto de divisão
		
		/*Operadores Unário*/
		System.out.println();
		
		int num = 5;
		
		System.out.println(+num); //números são positivos sem esse valor
		System.out.println(-num); //nega um número ou expressão
		System.out.println(++num); //incrementa o valor em 1 unidade
		System.out.println(--num); //decrementa o valor em 1 unidade
		
		/* Operadores Ternário*/
		
		int a = 5;
		int b = 7;
		
		String resultado = a==b ? "verdadeiro" : "falso";
		System.out.println(resultado);
		
		/* Operadores Relacionais */
		
		int c = 1;
		int d = 2;
		
		/*comparação de maior*/
		if(c > d)
			System.out.println("número 1 maior que número 2");
		else
			System.out.println("número 1 não é maior que número 2");
	
		/*comparação de menor*/
		if(c < d)
			System.out.println("número 1 é menor que 2");
		else
			System.out.println("número 1 não é menor que número 2");
		
		/*comparação de iguais*/
		if(c == d)
			System.out.println("número 1 não é igual ao número 2");
		else
			System.out.println("número 1 é igual ao número 2");
		
		/*comparação de diferentes*/
		if(c != d)
			System.out.println("número 1 é diferente de 2");
		else
			System.out.println("número 1 é igual ao número 2");
		
	}

}
