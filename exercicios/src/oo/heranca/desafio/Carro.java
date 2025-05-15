package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidade;

    Carro( int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(velocidade + 5 > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade = velocidade + 5;
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
