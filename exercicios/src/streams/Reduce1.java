package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Reduce1 {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        int resultado = nums.stream().reduce(soma).get(); //precisa do get pq é uma optional
        print.accept(resultado);

        Integer resultado2 = nums.stream().reduce(100, soma); // passando o acumulador não precisa do get
        print.accept(resultado2);

        nums.stream()
                .filter(n-> n > 5)
                .reduce(soma)
                .ifPresent(print); // opção de ifPresent possivel pq reduce gerou uma "optional"
    }
}
