package excessao;

public class Basico {

    public static void main(String[] args) {

        Aluno a = null;

        try {
            imprimirNomeAluno(a);
        } catch (Exception e){
            System.out.println("Erro ao imprimir aluno");
        }


        try {
            System.out.println( 7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("fim");

    }
    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
