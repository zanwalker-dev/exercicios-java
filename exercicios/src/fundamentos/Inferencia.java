package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
//		TIPAGEM
		double a = 4.5;
		System.out.println(a);
		
//		INFERENCIA
		var b = 4.5;
		System.out.println(b);
		
//		INFERENCIA
		var c = "Texto";
		System.out.println(c);
//		Pode reatribuir o valor mas precisa ser do mesmo tipo anterior
		c = "Outro texto";
		System.out.println(c);
		
	}
	
}
