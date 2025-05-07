package controle;

import java.text.Normalizer;
import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = entrada.next();

        dia = Normalizer.normalize(dia, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}", "")
                .replace("ç", "c");
//

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("terca")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println("7");
        } else {
            System.out.println("Valor inválido");
        }
    }

}
