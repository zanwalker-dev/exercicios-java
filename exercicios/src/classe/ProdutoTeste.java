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

        System.out.printf("O preço do %s com desconto é R$ %.2f \n",p1.nome, p1.precoComDesconto(0));
        System.out.printf("O preço do %s com desconto do gerente é R$ %.2f ",p1.nome, p1.precoComDesconto(0.1));
    }
}
