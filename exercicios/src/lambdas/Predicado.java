package lambdas;

import java.util.function.Predicate;

public class Predicado {
    //RECEBE UM PARAMETRO E RETONRA UM BOOLEANO
    public static void main(String[] args) {
//        Predicate<Produto> isCaro = prod -> prod.preco >= 100; //versão básica
        Predicate<Produto> isCaro = prod -> (prod.preco * (1-prod.desconto)) >= 100; //levando o desconto

        Produto prod1 = new Produto("caneta", 2.80,0.1);
        Produto prod2 = new Produto("caneta", 101.80,0.0);

        System.out.println(isCaro.test(prod1));
        System.out.println(isCaro.test(prod2));
    }
}
