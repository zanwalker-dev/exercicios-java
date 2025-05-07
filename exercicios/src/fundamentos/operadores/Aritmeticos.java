package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);// divisão só com int dá o resultado inteiro msm se for flutuante
		System.out.println(a / (double)b);// solução para resultado de valor flutuante
		
		//modulo: verifica o resto de uma divisão
		System.out.println(8 % 3);
		System.out.println(8 % 2);//quando o resto de um num dividido por 2 é 0 ele é par
		
	}
}
