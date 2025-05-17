package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
        1- A partir do produto calcular o preço real ( com desconto)
        2-Imposto Municipal: >= 2500(8,5%) / < 2500(isento)
        3-Frete >= 3000(100) / <3000(50)
        4-Arredondar: Deixar duas casas decimais
        5- Formatar: R$1234,56
         */

        double imposto = 0.085;

        UnaryOperator<Double> precoReal = precoCheio ->  precoCheio * (1 - p.getDesconto());
        UnaryOperator<Double> precoImposto = precoCheio -> {
            if(precoCheio >= 2500){
                return precoCheio = precoCheio * (1 + imposto);
            } else {
               return precoCheio;
            }
        };
        UnaryOperator<Double> precoFrete = precoCheio -> {
            if(precoCheio >= 3000){
                return precoCheio += 100;
            } else {
                return precoCheio += 50;
            }
        };
        UnaryOperator<Double> precoArredondado = precoCheio -> {
            BigDecimal bd = new BigDecimal(precoCheio);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        };
        Function<Double, String> precoFinal = valor -> "R$" + valor;

        System.out.println(p.getPreco());
        System.out.println(precoReal
                .andThen(precoImposto).andThen(precoFrete)
                .andThen(precoArredondado).andThen(precoFinal)
                .apply(p.getPreco()));
    }
}
