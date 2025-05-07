package fundamentos.tipos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	
//		Informações do funcionário:
		
//		Tipos numéricos inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
 		long pontosAcumulados = 3_134_645_223L; //"L" é para converter o int(padrão) para Long
 		
// 		Tipo numéricos flutuantes/reais:
 		float salario = 11_445.44F; // "F" para converter double em float
 		double vendasAcumuladas = 2_991_797_103.01;
 		
// 		Tipo booleano:
 		boolean estaDeFerias = false;
 		
// 		Tipo caractere:
 		char status = 'A';
 		
// 		Dias de empresa
 		System.out.println("Dias de empresa: " + (anosDeEmpresa * 365));
 		
// 		Numeros de viagens:
 		System.out.println("Numeros de viagens: " + (numeroDeVoos / 2));
 		
// 		Pontos por real:
 	 	System.out.println("Pontos por real: " + (pontosAcumulados / vendasAcumuladas));
 	 	
// 	 	Quanto ganha o usuario:
 	 	System.out.println("#" + id + " ganha -> " + "R$ " + salario);
 	 	
// 	 	O usuário está de ferias?:
 	 	System.out.println("Férias? " + estaDeFerias);
 	 	
// 	 	Status do usuário:
 	 	System.out.println("Status: " + status);

	}

}
