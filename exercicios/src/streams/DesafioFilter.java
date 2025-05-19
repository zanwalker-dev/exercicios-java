package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Consumer<Object> print = System.out::println;

        Livro l1 = new Livro("Game of Thrones", "George R.R. Martin", 458);
        Livro l2 = new Livro("Furia dos Reis", "George R.R. Martin", 450);
        Livro l3 = new Livro("A Tormenta de Espadas", "George R.R. Martin", 320);
        Livro l4 = new Livro("O Mar de Monstros", "Rick Riordan", 400);

        List<Livro> livros = Arrays.asList(l1, l2, l3, l4);

        print.accept("Digite o nome do autor");
        String autor = entrada.nextLine();

        print.accept("Digite a partir de quantas paginas");
        int paginas = entrada.nextInt();

        Predicate<Livro> autorEncontrado = livro -> livro.autor.equalsIgnoreCase(autor);
        Predicate<Livro> paginasEncontrado = livro -> livro.paginas > paginas;
        Function<Livro, String> retornoLivro = livro -> "Esse livro combina com sua pesquisa: " + livro.titulo;

        livros.stream()
                .filter(autorEncontrado)
                .filter(paginasEncontrado)
                .map(retornoLivro)
                .forEach(print);
    }
}
