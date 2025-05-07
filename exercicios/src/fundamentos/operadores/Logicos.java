package fundamentos.operadores;

public class Logicos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // e(and)
		System.out.println(condicao1 || condicao2); // ou(or)
		System.out.println(condicao1 ^ condicao2); // ou exclusivo(xor)
		System.out.println(!condicao1); // negação
		System.out.println(!!condicao2); // negação negação
		
		//Tabela verdade do &&
		System.out.println("Tabela verdade do &&");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(true && false); //false
		System.out.println(false && false); //false
		
		//Tabela verdade do ||
		System.out.println("Tabela verdade do ||");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(true || false); //true
		System.out.println(false || false); //false
		
		//Tabela verdade do ^
		System.out.println("Tabela verdade do ^");
		System.out.println(true ^ true); //false
		System.out.println(true ^ false); //true
		System.out.println(true ^ false); //true
		System.out.println(false ^ false); //false

		//Tabela verdade do !
		System.out.println("Tabela verdade do !");
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!!true); //true
		System.out.println(!!false); //false
	}
}
