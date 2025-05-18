package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdasGenericos {

    public final static UnaryOperator<String> maiuscula = e -> e.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = e -> e.charAt(0) + ""; // para o char virar String de novo
    public final static UnaryOperator<String> grito = e -> e.concat("!!!!");
    public final static UnaryOperator<String> inverterString = e -> new StringBuilder(e).reverse().toString();
    public final static Function<String, Integer> binarioParaInt =
            e -> Integer.parseInt(e, 2);
}
