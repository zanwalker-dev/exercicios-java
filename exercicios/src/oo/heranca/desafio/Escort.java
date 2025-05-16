package oo.heranca.desafio;

public class Escort extends Carro implements Esportivo,Luxo {

    String nome = "Escort";

    private boolean ligarTurbo;
    private boolean ligarAr;

    Escort(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {

        if (ligarTurbo && !ligarAr) {
            return 30;
        } else if(ligarTurbo && ligarAr) {
            return 25;
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        } else{
            return 15;
        }

    }

    //    @Override
//    void acelerar(){
//        if(velocidade + 15 > VELOCIDADE_MAXIMA){
//            velocidade = VELOCIDADE_MAXIMA;
//        } else {
//            velocidade = velocidade + 15;
//        }
//    }
//
//    @Override
//    void frear(){ //sobrescrevendo da forma mais padrão
//        if(velocidade >= 15){
//            velocidade -= 15;
//        } else {
//            velocidade = 0;
//        }
//    }

    public String toString(){
        return nome;
    }
}
