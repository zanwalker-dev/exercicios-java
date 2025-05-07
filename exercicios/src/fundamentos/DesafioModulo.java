package fundamentos;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",num1, op, num2, resultado);
		
		entrada.close();
	}
	
}
