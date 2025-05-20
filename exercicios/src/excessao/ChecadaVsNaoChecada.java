package excessao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Fim");
    }

    //Não checada ou não verificada;
    static void geraErro1(){
        throw new RuntimeException("Erro 1");
    }

    //Checada
    static void geraErro2() throws Exception {
        throw new Exception("Erro 2");
    }
}
