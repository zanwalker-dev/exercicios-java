package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        Aluno a1 = new Aluno("João", 7.1);
        Aluno a2 = new Aluno("Maria", 6.1);
        Aluno a3 = new Aluno("Pedro", 8.1);
        Aluno a4 = new Aluno("Antonio", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7.0;
        Function<Aluno, Double> getNota = aluno -> aluno.nota;
        BinaryOperator<Double> somatario = (a,b) -> a + b;

        alunos.stream().filter(aprovado).map(getNota).reduce(somatario).ifPresent(print);

    }
}
