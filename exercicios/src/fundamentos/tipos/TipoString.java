package fundamentos.tipos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(1));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		//String Layout
		var nome = "André";
		var sobrenome = "Rocha";
		var idade = 28;
		var salario =  12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade " + idade + "\nSalário: " + salario;
		System.out.println(maisUmaFrase);
		
		System.out.printf("Sr %s %s que tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		
		String fraseLayout = String.format("\nSr %s %s que tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(fraseLayout);
		
		//String Contains
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,10));
		
		
	}

}
