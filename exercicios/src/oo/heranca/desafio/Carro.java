package oo.heranca.desafio;

public class Carro {

    int velocidade;

    void acelerar(){
        if(velocidade < 15){
            velocidade += 5;
        }
    }

    void frear(){
        if(velocidade >= 5){
            velocidade -= 5;
        } else {
            velocidade = 0;
        }
    }

}
