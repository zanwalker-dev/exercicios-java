package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lua", "Gui", "Mia");

        System.out.println("****** Usando o Foreach ******");
        for(String aprovado: aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\n****** Usando o Iterator ******");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n****** Usando o Stream ******");
        Stream<String>  stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
