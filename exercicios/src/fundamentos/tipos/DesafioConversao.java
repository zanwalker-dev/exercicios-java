package fundamentos.tipos;
//
import java.util.Scanner;
//

//------------------------------MINHA SOLUÇÃO-------------------------------------

//public class DesafioConversao {
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		
//		//Capturando string
//		System.out.println("Digite o primeiro numero:");
//		String ent1 = entrada.next();
//		
//		System.out.println("Digite o segundo numero:");
//		String ent2 = entrada.next();
//		
//		System.out.println("Digite o terceiro numero:");
//		String ent3 = entrada.next();
//		
//		if(ent1.contains(",")) {
//			ent1 = ent1.replace(",", ".");
//		}
//		
//		if(ent2.contains(",")) {
//			ent2 = ent2.replace(",", ".");
//		}
//		
//		if(ent3.contains(",")) {
//			ent3 = ent3.replace(",", ".");
//		}
//		
//		//Convertendo para numero
//		double salario1 = Double.parseDouble(ent1);
//		double salario2 = Double.parseDouble(ent2);	
//		double salario3 = Double.parseDouble(ent3);	
//		
//		double media = (salario1 + salario2 + salario3) / 3;
//		
//		System.out.println(media);
//	}
//}

//------------------------------SOLUÇÃO OTIMIZADA-------------------------------------

public class DesafioConversao {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	//Capturando string
	System.out.println("Digite o primeiro numero:");
	String ent1 = entrada.next().replace(",",".");
	
	System.out.println("Digite o segundo numero:");
	String ent2 = entrada.next().replace(",",".");
	
	System.out.println("Digite o terceiro numero:");
	String ent3 = entrada.next().replace(",",".");
	
	//Convertendo para numero
	double salario1 = Double.parseDouble(ent1);
	double salario2 = Double.parseDouble(ent2);	
	double salario3 = Double.parseDouble(ent3);	
	
	double media = (salario1 + salario2 + salario3) / 3;
	
	System.out.println(media);
	
	entrada.close();
	}
}