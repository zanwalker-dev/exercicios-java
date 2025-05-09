package controle;

public class Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 1) {
                continue; //interrompe apenas a repetição atual e passa para a proxima
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if(i == 5) continue; //nesse exemplo imprime todos os numeros de 0 a 10 e ignora o 5
            System.out.println(i);
        }
    }
}
