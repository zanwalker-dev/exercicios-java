package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Tablet";
        p1.preco = 5650.00;
        p1.desconto = 0.28;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 80.00;
        p2.desconto = 0.18;

        System.out.println(p1.nome + " " + p1.preco + " " + p1.desconto);
        System.out.println(p2.nome + " " + p2.preco + " " + p2.desconto);

        double precoFinal1 = p1.preco * (1 -  p1.desconto);
        double precoFinal2 = p2.preco * (1 -  p2.desconto);
        System.out.println(precoFinal1 + " " + precoFinal2);
    }
}
