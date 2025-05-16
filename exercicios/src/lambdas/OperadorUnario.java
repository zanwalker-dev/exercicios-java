package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado).apply(10);

        int resultado2 = maisDois
                .andThen(vezesDois).apply(10);

        int resultado3 = maisDois.apply(10);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);


    }
}
