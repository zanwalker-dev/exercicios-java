package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final double FATOR = 5/9.0;
		final double AJUSTE = 32;
		double F = 86;
		double C = (F - AJUSTE)*FATOR;
		
		System.out.println(C + "C˚");
	}

}
