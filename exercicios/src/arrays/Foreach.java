package arrays;

import java.awt.*;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 9.9, 9.8, 8.7, 7.6 };

        for( int i = 0; i < notas.length; i++){ // for normal
            System.out.println(notas[i]);
        }

        System.out.println("----------------------");

        for(double nota: notas) { //for each
            System.out.println(nota);
        }
    }
}
