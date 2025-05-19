package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 7.1);
        Aluno a2 = new Aluno("Maria", 8.1);
        Aluno a3 = new Aluno("Pedro", 8.1);
        Aluno a4 = new Aluno("Antonio", 10);
        Aluno a5 = new Aluno("João", 5.1);
        Aluno a6 = new Aluno("Maria", 6.1);
        Aluno a7 = new Aluno("Laura", 8.1);
        Aluno a8 = new Aluno("Antonieta", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2) //pula o numero de elementos passado por parametro
                .limit(2) //limita o numero de elementos pelo valor passado por parametro
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7) //vai rodar enquanto as notas forem >=7
                .forEach(System.out::println);
    }
}
