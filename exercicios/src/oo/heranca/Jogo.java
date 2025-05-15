package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Jogador vilao = new Vilao();
        vilao.x = 10;
        vilao.y = 11;

        System.out.println("heroi vida: " + heroi.vida);
        System.out.println("vilao vida: " + vilao.vida);

        heroi.atacar(vilao);
        vilao.atacar(heroi);

        System.out.println("heroi vida: " + heroi.vida);
        System.out.println("vilao vida: " + vilao.vida);



    }
}
