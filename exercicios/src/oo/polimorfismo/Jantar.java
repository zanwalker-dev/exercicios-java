package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Comida ingrediente1 = new Arroz(0.2);
        Comida ingrediente2 = new Feijao(0.1);

        System.out.println("Peso do convidado antes de comer: " + convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println("Peso do convidado depois de comer: " + convidado.getPeso());

        Comida sobremesa = new Sorvete(0.4);
        convidado.comer(sobremesa);

        System.out.println("Peso do convidado depois de comer a sobremesa: " + convidado.getPeso());


    }
}
