package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		//atribuição simples
		int a = 3;
		
		//atribuição de variavel
		int b = a;
		
		//atribuição de expressão
		int c = a + b;
		
		//retribuição
		c += b;//c = c + b;
		c -= a;//c = c - a;
		c *= b;//c = c * b;
		c /= a;//c = c / a;
		System.out.println(c);
		
		c %= 2;//c = c % 2; se for 0 é par e se for 1 é impar
		System.out.println(c);
	}
}
