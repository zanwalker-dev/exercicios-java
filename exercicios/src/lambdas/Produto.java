package lambdas;

public class Produto {

    final String nome;
    final double preco;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    final double desconto;
}
