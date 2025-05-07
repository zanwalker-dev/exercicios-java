package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		System.out.println(3 > 7);
		System.out.println(3 >= 7);
		System.out.println(3 < 7);
		System.out.println(6 >= 5);
		System.out.println(6 == 5);
		System.out.println(6 != 5);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("O aluno vai ter desconto? " + temDesconto);
		
	}
}
