package oo.heranca.desafio;

public class Civic extends Carro{

    String nome = "Civic";

    Civic(int velocidadeMaxima){
        super(velocidadeMaxima);
    }

    public String toString(){
        return nome;
    }
}
