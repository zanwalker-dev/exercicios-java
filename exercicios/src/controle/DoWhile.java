package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String txt;

        do{
            System.out.println("Quer sair?");
            System.out.print("Digite sair: ");
            txt = entrada.nextLine();
        } while (!txt.equalsIgnoreCase("sair"));

    }
}
