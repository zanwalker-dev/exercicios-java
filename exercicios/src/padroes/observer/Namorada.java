package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante {

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar aos convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Surpresa!");
    }
}
