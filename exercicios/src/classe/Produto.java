package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto;

    Produto(){} //Construtor padrão pq eu criei um que pedia nome

    Produto(String nome){ //construtor pedindo nome como parametro
        this.nome = nome;
    }

    double precoComDesconto( double descontoDoGerente ){
        return preco * (1 - (desconto+descontoDoGerente));
    }
}
