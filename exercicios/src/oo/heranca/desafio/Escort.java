package oo.heranca.desafio;

public class Escort extends Carro{

    String nome = "Escort";

    @Override
    void acelerar() { //sobrescrevendo de forma simplificada
        velocidade += 15;
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
