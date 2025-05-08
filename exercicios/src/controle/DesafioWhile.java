package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();
            if(nota <= 10 && nota >= 0){
                total += nota;
                qtdNotas++;
                System.out.println("Digite -1 para sair ");
            } else {
                System.out.println("Nota invalida!");
            }

        }

        System.out.println("Programa encerrado");

        double media = total / qtdNotas;
        System.out.println("Média = " + media);

    }
}
