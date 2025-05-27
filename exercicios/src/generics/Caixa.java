package generics;

public class Caixa<TYPE> {

    private TYPE coisa;

    public void guardar(TYPE coisa) {
        this.coisa = coisa;
    }

    public TYPE abrir() {
        return coisa;
    }
}
