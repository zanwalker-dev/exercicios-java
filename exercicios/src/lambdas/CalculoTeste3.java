package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        //não converte int --> Double, pq Double é uma Classe e não um tipo primitivo
        //converte double --> Double, pq transforma double primitivo na classe Double

        BinaryOperator<Double> calculo = (a, b) -> { return a + b; };
        System.out.println(calculo.apply(3.0, 3.0));

        calculo = (a,b) -> a * b;
        System.out.println(calculo.apply(3.0, 3.0));

        BinaryOperator<Integer> calculo2 = (a, b) -> { return a + b; };
        System.out.println(calculo2.apply(3, 3));

        calculo = (a,b) -> a * b;
        System.out.println(calculo2.apply(3, 3));
    }
}
