package oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {
        Carro c1 = new Civic(15);
        Carro c2 = new Escort(30);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.printf("Velocidade do %s é de %d.\n",c1.toString(), c1.velocidade);

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        System.out.printf("Velocidade do %s é de %d.",c2.toString(), c2.velocidade);



    }

}
