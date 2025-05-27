package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();

        caixaA.guardar(7.7);

        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();

        caixaB.guardar(77);

        System.out.println(caixaB.abrir());

    }

}
