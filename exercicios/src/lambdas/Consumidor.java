package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    //Recebe um parametro e não retorna nada
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto prod1 = new Produto("caneta", 2.80,0.1);
        imprimir.accept(prod1);

        Produto prod2 = new Produto("lapis", 1.80,0.0);
        Produto prod3 = new Produto("caderno", 12.80,0.1);
        Produto prod4 = new Produto("notebook", 3232.80,0.18);

        List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4);

        produtos.forEach(imprimir);

    }
}
