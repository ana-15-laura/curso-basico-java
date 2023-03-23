package condicional;

public class operadoresRelacionais {

	public static void main(String[] args) {

		//declaração de variáveis
		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;		
		float f2 = 3.5f;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fulano";
		String s2 = "Fulano";
		boolean b1 = true;
		boolean b2 = false;
		
		//condicional das váriaveis
		System.out.println("i1 == i2 -> " + ( i1 == i2));
		System.out.println("i1 != i2 -> " + ( i1 != i2));
		System.out.println("i1 < i2 -> " + ( i1 < i2));
		System.out.println("i1 > i2 -> " + ( i1 > i2));
		System.out.println("i1 <= i2 -> " + ( i1 <= i2));
		System.out.println("i1 >= i2 -> " + ( i1 >= i2));
		System.out.println();

		System.out.println("f1 == f2 -> " + ( f1 == f2));
		System.out.println("f1 != f2 -> " + ( f1 != f2));
		System.out.println("f1 < f2 -> " + ( f1 < f2));
		System.out.println("f1 > f2 -> " + ( f1 > f2));
		System.out.println("f1 <= f2 -> " + ( f1 <= f2));
		System.out.println("f1 >= f2 -> " + ( f1 >= f2));
		System.out.println();
		
		System.out.println("c1 == c2 -> " + ( c1 == c2));
		System.out.println("c1 != c2 -> " + ( c1 != c2));
		System.out.println("c1 < c2 -> " + ( c1 < c2));
		System.out.println("c1 > c2 -> " + ( c1 > c2));
		System.out.println("c1 <= c2 -> " + ( c1 <= c2));
		System.out.println("c1 >= c2 -> " + ( c1 >= c2));
		System.out.println();

		// as variáveis boolean e string pois ambos não 
		//possuem valorepara serem comparados com maior ou menor
		System.out.println("s1 == s2 -> " + ( s1 == s2));
		System.out.println("s1 != s2 -> " + ( s1 != s2));
		System.out.println();
		
		System.out.println("b1 == b2 -> " + ( b1 == b2));
		System.out.println("b1 != b2 -> " + ( b1 != b2));
		System.out.println();
		
	}

}
