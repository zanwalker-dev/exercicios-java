package generics;

public class CaixaIntTest {

    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(77);

        System.out.println(caixaA.abrir());
    }
}
