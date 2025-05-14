package oo.composicao;

public class Carro {

    Motor motor = new Motor();

    void acelerar(){
        if(motor.fatorInjecao < 2.6){ //dando limite na acelaração
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){ //dando limite na desaceleração
            motor.fatorInjecao -= 0.4;
        }

    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
