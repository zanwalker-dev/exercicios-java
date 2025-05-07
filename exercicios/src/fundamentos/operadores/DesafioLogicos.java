package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

// ---------------------------- MINHA SOLUÇÃO ----------------------------------
//	public static void main(String[] args) {
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("O trabalho de terça deu certo?");
//		boolean trabTer = entrada.nextBoolean();
//		System.out.println("O trabalho de quinta deu certo?");
//		boolean trabQui = entrada.nextBoolean();
//		
//		boolean condicoes; 
//		
//		if(trabTer && trabQui) {
//			condicoes = true;
//			System.out.println("vamos comprar a TV 52``");
//		} else if (trabTer || trabQui) {
//			condicoes = true;
//			System.out.println("vamos comprar a TV 32``");
//		} else {
//			condicoes = false;
//			System.out.println("Não vamos comprar a TV");
//		};
//		
//		System.out.println("vamos tomar sorvete?");
//		
//		if(condicoes) {
//			System.out.println("vamos sim!");
//		} else {
//			System.out.println("vamos não!");
//		}
//		entrada.close();
//	}
	
	// -------------------------- SOLUÇÃO OTIMIZADA ----------------------------------
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("O trabalho de terça deu certo?");
		boolean trabTer = entrada.nextBoolean();
		System.out.println("O trabalho de quinta deu certo?");
		boolean trabQui = entrada.nextBoolean();
		
		boolean comprouTV50 = trabTer && trabQui;
		boolean comprouTV32 = trabTer ^ trabQui;
		boolean comprouSorvete = comprouTV50 || comprouTV32;
		
		boolean maisSaudavel = !comprouSorvete;
		boolean maisFeliz = !maisSaudavel;
		
		System.out.println("comprou tv de 50? " + comprouTV50);
		System.out.println("comprou tv de 32? " + comprouTV32);
		System.out.println("comprou sorvete? " + comprouSorvete);
		System.out.println("Está mais saudavel? " + maisSaudavel);
		System.out.println("Está mais feliz? " + maisFeliz);
		
		
		entrada.close();
	}
}
