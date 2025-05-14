package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "Pedro";
        c1.itens.add(new Item("Mouse", 2, 45.58));
        c1.itens.add(new Item("Pendrive", 4, 32.80));
        c1.itens.add(new Item("Webcam", 1, 240.00));

        System.out.println(c1.itens.size());

    }

}
