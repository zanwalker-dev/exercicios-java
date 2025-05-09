package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto.desconto = 0.25;

        Produto p1 = new Produto();
        p1.nome = "Tablet";
        p1.preco = 5650.00;

        Produto p2 = new Produto("Mouse"); // exemplo passando parametro no construtor
        p2.preco = 80.00;


        System.out.printf("O preço do %s com desconto é R$ %.2f \n",p1.nome, p1.precoComDesconto(0));
        System.out.printf("O preço do %s com desconto do gerente é R$ %.2f ",p1.nome, p1.precoComDesconto(0.1));

        System.out.println();

        System.out.printf("O preço do %s com desconto é R$ %.2f \n",p2.nome, p2.precoComDesconto(0));
        System.out.printf("O preço do %s com desconto do gerente é R$ %.2f ",p2.nome, p2.precoComDesconto(0.1));
    }
}
