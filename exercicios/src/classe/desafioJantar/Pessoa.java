package classe.desafioJantar;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) { this.nome = nome; this.peso = peso; }

    double comer(double pesoComida) {
        return this.peso + pesoComida;
    }
}
