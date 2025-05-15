package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
        //System.out.println(esposa.segredo); //não consegue acessar segredo pois está privado
        System.out.println(esposa.facoDentroDeCasa); //acessa oq é feito na mesma casa(package)
        System.out.println(esposa.formaDeFalar); //acessa oq é feito na mesma casa(package) ou passa por herança
        System.out.println(esposa.facoNaRua); //acessa o que é feito na rua(publico)
    }

}

