package controle;

import java.util.Scanner;

//public class SwitchComBreak {
//    public static void main(String[] args) {
//        String conceito = "";
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite uma nota: ");
//        int nota = entrada.nextInt();
//
//        switch(nota){
//            case 10: case 9:
//                conceito = "A";
//                break;
//            case 8: case 7:
//                conceito = "B";
//                break;
//            case 6: case 5:
//                conceito = "C";
//                break;
//            case 4: case 3:
//                conceito = "D";
//                break;
//            case 2: case 1:
//                conceito = "E";
//                break;
//        }
//
//        System.out.println("Conceito: " + conceito);
//    }
//}

// versão otimizada:

public class SwitchComBreak {
    public static void main(String[] args) {
        String conceito = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        int nota = entrada.nextInt();

        conceito = switch (nota) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1 -> "E";
            default -> conceito;
        };

        System.out.println("Conceito: " + conceito);
    }
}
