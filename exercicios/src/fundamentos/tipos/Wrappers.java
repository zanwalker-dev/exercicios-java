package fundamentos.tipos;

public class Wrappers {	
	public static void main(String[] args) {
		
//		Wrapper embrulha primitivo em classes para dar acesso a metodos
		
		//Com excessão do int que se torna Integer basta começar com maiscula.
		Byte b = 100;
		Short s = 1000;
//		Integer i = 10000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		//Agora podemos acessar metodos
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i.intValue());
		System.out.println( l / 3 );
		
		//Float
		Float f = 123.10F;
		System.out.println(f.doubleValue());
		
		//Double
		Double d = 1234.5678;
		System.out.println(d.isNaN());
		
		//Booleanos
		Boolean bo =  Boolean.parseBoolean("true"); //converti uma string para boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Character
		Character c = '#';
		System.out.println(c.toString());	
		
	}
}
