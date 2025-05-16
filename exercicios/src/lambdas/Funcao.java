package lambdas;

import java.util.function.Function;

public class Funcao {
    //Recebe parametro de qualquer tipo e retorna um parametro de qualquer tipo
    public static void main(String[] args) {

//      COMPOSIÇÃO DE FUNÇÕES
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar"; //"par/impar"

        Function<String, String> oResultadoE =
                valor -> "O resultado é: "  + valor; //"o resultado é: par/impar"

        Function <String, String> empolgado =
                valor -> valor + "!!!"; //"o resultado é: par/impar!!!"

        String resultadoFinal =
                parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(2);

        System.out.println(resultadoFinal);
    }
}
