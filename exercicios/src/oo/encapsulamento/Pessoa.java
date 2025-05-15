package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() { return idade; }

    public void setIdade(int idade) {
        idade = Math.abs(idade); // transforma negativo em positivo
        if(idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }
}
