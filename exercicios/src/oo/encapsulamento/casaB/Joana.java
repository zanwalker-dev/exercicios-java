package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Joana {

    Ana sogra = new Ana();

    void testeAcessos(){
        //System.out.println(sogra.segredo); //não consegue acessar segredo pois está privado
        //System.out.println(sogra.facoDentroDeCasa); //não acessa oq é feito na mesma casa(package)
        //System.out.println(sogra.formaDeFalar); //não acessa oq é feito na mesma casa(package) ou passa por herança
        System.out.println(sogra.facoNaRua); //acessa o que é feito na rua(publico)
    }

}
