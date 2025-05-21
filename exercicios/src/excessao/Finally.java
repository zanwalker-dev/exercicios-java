package excessao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println(7 / entrada.nextInt());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally { //sempre será chamado, a validação dando certo ou não
            System.out.println("finally...");
            entrada.close();
        }

        System.out.println("Fim do programa");
    }
}
