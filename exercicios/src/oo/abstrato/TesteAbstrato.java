package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro();

        System.out.println(cachorro.mover()); //só consigo acessar pq instaciei no cachorro
        System.out.println(cachorro.mamar()); //só tive acesso a partir de Mamifero
        System.out.println(cachorro.respirar()); //tenho acesso desde o inicio pois pertence a Animal
    }

}
