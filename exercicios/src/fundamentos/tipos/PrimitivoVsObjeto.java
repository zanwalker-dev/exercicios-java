package fundamentos.tipos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
//		Tudo em java é objeto exceto os tipos primitivos.
		
		//Objeto:
		//É isso que acontece por debaixo dos panos quando definimos uma string.
		String s = new String("texto");
		s.toUpperCase(); // um objeto tem metodos
		
		//Wrappers é uma versão  objeto dos tipos primitivos:
		int a = 123;
		System.out.println(a);
		
	}
}
