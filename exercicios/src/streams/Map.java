package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("Ford ", "Hyundai ", "Honda ", "Chevrolet\n");

        print.accept("Marcas ANTES do map:\n");
        marcas.stream().forEach(print);
        print.accept("Marcas DEPOIS do map:\n");
        marcas.stream().map((e) -> e.toUpperCase()).forEach(print);

        print.accept("Com composição:\n");
        //Utilizando os lambdas lá da classe "LambdasGenericos" como parâmetro
        marcas.stream()
                .map(LambdasGenericos.maiuscula).map(LambdasGenericos.primeiraLetra)
                .map(LambdasGenericos.grito).forEach(print);
    }
}
