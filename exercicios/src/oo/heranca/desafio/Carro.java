package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidade;
    private int delta = 5;

    Carro( int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(velocidade + getDelta() > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade = velocidade + getDelta();
        }
    }

    void frear(){
        if(velocidade >= 5){
            velocidade -= delta;
        } else {
            velocidade = 0;
        }
    }

    public int getDelta() { return delta; }
    public void setDelta(int delta) { this.delta = delta; }
}
