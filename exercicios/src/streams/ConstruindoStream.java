package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConstruindoStream {

    public static void main(String[] args) {

        //Reference method para imprimir mais rapido
        Consumer<Object> print = System.out::print;

        //#1 forma:
        Stream<String> langs = Stream.of("Java ", "C# ", "Python ", "JavaScript\n");
        langs.forEach(print);

        //#2 forma:
        String[] maisLangs = {"C++ ", "Ruby ", "Go ", "Lua\n"};
        Stream.of(maisLangs).forEach(print);

        //#3 forma:
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 3).forEach(print); //passando intervalo de index

        System.out.println();

        //#4 forma(Parallel):
        List<String> outrasLangs = Arrays.asList("PHP ", "Kotlin ", "Perl\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //#5 formas infinita (cuidado vai consumir a memoria do pc):
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
