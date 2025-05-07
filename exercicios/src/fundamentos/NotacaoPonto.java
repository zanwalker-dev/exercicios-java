package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
//		Notação ponto para acessar métodos de um dado:
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
//		Notação ponto aplicada diretamente:	
		System.out.println("André".toUpperCase());
		
//		Notação ponto acumulada obs: só é possivel se o resultado seguir o mesmo tipo
		
		String y = "Bom dia X"
				.replace("X", "André")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
//		Tipo primitivos não tem o operador "."
		
	}
}
