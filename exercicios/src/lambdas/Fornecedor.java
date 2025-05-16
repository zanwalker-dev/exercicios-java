package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    //NÃO RECEBE NADA E RETORNA ALGO
    public static void main(String[] args) {

        Supplier<List<String>> umaLista =
                () -> Arrays.asList("Ana", "Bia", "Lua", "Mia");

        System.out.println(umaLista.get());

    }
}
