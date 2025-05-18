package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        Consumer <Object> print = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /*
        1- Numero para string binária... 6 => 110
        2- Reverter a string.. 110 => 011
        3-Converter de volta para inteiro 011 => 3;
         */



        nums.stream()
                .map(Integer::toBinaryString).map(LambdasGenericos.inverterString)
                .map(LambdasGenericos.binarioParaInt).forEach(print);
    }
}
