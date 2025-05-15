package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    //No exemplo Ana é mãe de Pedro
    void testeAcessos(){
        //System.out.println(ana.segredo); //não consegue acessar segredo pois está privado
        //System.out.println(facoDentroDeCasa); //não acessa oq é feito na mesma casa(package)
        System.out.println(formaDeFalar); //acessa oq é feito na mesma casa(package) ou passa por herança(mãe)
        System.out.println(facoNaRua); //acessa o que é feito na rua(publico)
    }

}
