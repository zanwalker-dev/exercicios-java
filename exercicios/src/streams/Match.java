package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 7.1);
        Aluno a2 = new Aluno("Maria", 6.1);
        Aluno a3 = new Aluno("Pedro", 8.1);
        Aluno a4 = new Aluno("Antonio", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7.0;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado)); //verifica SE TODOS passam no predicate
        System.out.println(alunos.stream().anyMatch(aprovado)); //verifica SE ALGUM passa no predicate
        System.out.println(alunos.stream().noneMatch(reprovado)); //verifica SE NENHUM passa no predicate

    }
}
