package oo.heranca;

public class Heroi extends Jogador{

    boolean atacar(Jogador oponente){ //Subescrevendo o metodo
        boolean ataque1 = super.atacar(oponente); //chamando metodo da classe super
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;
    }


}
