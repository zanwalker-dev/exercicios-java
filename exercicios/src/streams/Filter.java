package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        Aluno a1 = new Aluno("João", 7.8);
        Aluno a2 = new Aluno("Maria", 5.8);
        Aluno a3 = new Aluno("Pedro", 9.8);
        Aluno a4 = new Aluno("Antonio", 6.8);
        Aluno a5 = new Aluno("Bia", 7.1);
        Aluno a6 = new Aluno("Lua", 8.8);

        Predicate<Aluno> aprovado = e -> e.nota >= 7;

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Function<Aluno, String> mensagemAprovado =
                e -> "Parabéns " + e.nome + ", foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagemAprovado)
                .forEach(print);
    }
}
