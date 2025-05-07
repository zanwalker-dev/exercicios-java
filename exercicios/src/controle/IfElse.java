package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Informe o numero:");
		
		int numero = Integer.parseInt(value);
		
		if (numero %2 == 0) {
			System.out.println("O numero é par!");
		} else {
			System.out.println("O numero é impar!");
		}
		
	}		

}
