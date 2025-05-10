package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.4;
        notasAlunoA[1] = 8.2;
        notasAlunoA[2] = 5.8;

        String arrays = Arrays.toString(notasAlunoA);
        System.out.println(arrays);

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println("Média: " + total/notasAlunoA.length);

        double[] notasAlunoB = { 7.9, 6.8, 7.2};

        total = 0;
        for(int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];
        }
        System.out.println("Média: " + total/notasAlunoB.length);
    }
}
