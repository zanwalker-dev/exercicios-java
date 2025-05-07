package fundamentos.tipos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Utilizando wrapper Integer para acessar metodo .toString
		Integer num1 = 10000;
		System.out.println(num1.toString().length());//utilizando .length q é só para string
		
		//Utilizando Integer direto
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
	}
}
