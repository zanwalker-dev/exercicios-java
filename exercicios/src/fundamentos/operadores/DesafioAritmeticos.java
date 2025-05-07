package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a1 = ((int) Math.pow(((3 + 2) * 6), 2))/ (3 * 2);
		
		int b1 = (int) Math.pow(((1 - 5) * (2 - 7) / 2), 2);

		int c1 = (int) Math.pow((a1-b1),3)/(int) Math.pow(10, 3);
		
		System.out.println(c1);
	}
}
