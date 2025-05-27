package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA =  new Caixa<>();

        caixaA.guardar("Segredo");

        System.out.println(caixaA.abrir());

        Caixa<Integer> caixaB =  new Caixa<>(); // o tipo que eu passar ao instaciar será levado como regra

        caixaB.guardar(77);

        System.out.println(caixaB.abrir());
    }
}
