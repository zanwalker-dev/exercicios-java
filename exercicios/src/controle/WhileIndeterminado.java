package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra = "";


        while( !palavra.equals("sair") ){

            System.out.println("Digite algo: ");
            palavra = entrada.nextLine();
            System.out.println("A palavra foi: " + palavra);
            if ("sair".equals(palavra)) {
                System.out.println("Programa finalizado");
            } else {
                System.out.println("Digite sair para finalizar o programa: ");
            }
        }
    }
}
