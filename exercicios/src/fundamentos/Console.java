package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//Pint sem o ln 
		System.out.print("Boa");
		System.out.print(" tarde \n");
		
		//Print com ln
		System.out.println("Boa");
		System.out.println("tarde");
		
		//Print com format
		System.out.printf("Megasena: %d, %d, %d, %d, %d, %d\n", 1, 2, 3, 4, 5, 6 );
		System.out.printf("Salário: %.2f\n", 12345.678);
		System.out.printf("Nome: %s\n", "João");
		
		//Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
	    System.out.printf("Nome: %s %s\nIdade: %d\n", nome, sobrenome, idade);
	    
	    entrada.close();
		
	}
}
