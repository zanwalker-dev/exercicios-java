package oo.heranca.desafio;

public class Escort extends Carro{

    String nome = "Escort";

    Escort(int velocidadeMaxima){
        super(velocidadeMaxima);
    }

    @Override
    void acelerar(){
        if(velocidade + 15 > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade = velocidade + 15;
        }
    }

    @Override
    void frear(){ //sobrescrevendo da forma mais padrão
        if(velocidade >= 15){
            velocidade -= 15;
        } else {
            velocidade = 0;
        }
    }

    public String toString(){
        return nome;
    }
}
