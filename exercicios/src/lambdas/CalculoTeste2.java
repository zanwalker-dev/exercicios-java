package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calculo = (a,b) -> { return a + b; };
        System.out.println(calculo.executar(3, 3));

        calculo = (a,b) -> a * b;
        System.out.println(calculo.executar(3, 3));
    }
}
