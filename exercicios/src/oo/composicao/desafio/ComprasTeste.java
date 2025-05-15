package oo.composicao.desafio;

public class ComprasTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("lápis", 3.87, 4);
        compra1.adicionarItem("borracha", 2.80, 6);

        Compra compra2 = new Compra();
        compra2.adicionarItem("caneta", 4.87, 2);
        compra2.adicionarItem("tesoura", 12.80, 1);

        Cliente cliente = new Cliente("João Henriqueto");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println(cliente.getTotalCompras());
    }
}
