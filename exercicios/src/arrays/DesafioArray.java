package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite a quantidade de notas do aluno: ");
        int qtdNotas = entrada.nextInt();
        entrada.nextLine();

        double[] notasAluno = new double[qtdNotas];

        for (int i = 0; i < notasAluno.length; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notasAluno[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota : notasAluno) {
            total += nota;
        }
        double media = total / notasAluno.length;

        System.out.printf("Media: %.1f", media);

        entrada.close();
    }
}