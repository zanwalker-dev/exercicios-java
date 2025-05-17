package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (a, b) -> (a + b) / 2;
        System.out.println(media.apply(8.6, 10.0));

              //entrada1 / entrada2 / retorno
        BiFunction<Double, Double, String> resultado = (a, b) -> {
            double notaFinal = (a + b) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(8.6, 10.0));

        Function<Double, String> conceito =
                m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(conceito.apply(media.apply(8.6, 10.0)));
     }
}
