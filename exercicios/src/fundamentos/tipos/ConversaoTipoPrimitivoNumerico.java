package fundamentos.tipos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão implicita, um inteiro vira um double com ".0" no final
		System.out.println(a);
		
		float b = (float) 1.123124343253; //conversão explicita(CAST), também poderia ser "1.0F"
		System.out.println(b);//vai imprimir um valor menor pq float não suporta o tamanho
		
		
		int c = 4;
		byte d = (byte)c; //byte menor que int então d não vai suportar c por causa do tipo
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //vai ignorar as casas decimais e dar o valor inteiro
		System.out.println(f);
	}
}
