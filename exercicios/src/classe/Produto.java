package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nome){ //construtor pedindo nome como parametro
        this.nome = nome;
    }

    Produto(){} //Construtor padrão pq eu criei um que pedia nome

    double precoComDesconto( double descontoDoGerente ){
        return preco * (1 - (desconto+descontoDoGerente));
    }
}
