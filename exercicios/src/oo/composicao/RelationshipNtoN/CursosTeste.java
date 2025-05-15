package oo.composicao.RelationshipNtoN;

public class CursosTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("JavaScript");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        for(Aluno aluno: curso3.alunos){
            System.out.println("O Aluno " + aluno.nome);
            System.out.println("está matriculado no curso : " + curso3.nome );
        }

        System.out.println(aluno1.cursos.get(0).alunos);
        System.out.println(aluno1.cursos.get(0));
        System.out.println(curso1.alunos);

        Curso cursoEncontrado = aluno1.getCursoPorNome("Java");

        if(cursoEncontrado != null){
            System.out.println("Alunos que estão nesse curso : " + cursoEncontrado.alunos);
        }

    }

}
