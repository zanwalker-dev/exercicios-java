package fundamentos.tipos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");
		
		System.out.println(valor1 + valor2); // concatena pois recebe como string
		
		//converte os valores para numero
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		//soma os numeros
		double soma = num1 + num2;
		
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma / 2);
	}
}
