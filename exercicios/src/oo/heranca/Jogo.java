package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi(10,10);

        Jogador vilao = new Vilao(10,10);
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
