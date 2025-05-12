package collections;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    //TOSTRING --> dispensa o uso do ".nome" neste exemplo
    public String toString() { //usado para imprimir o nome diretamente no lugar do identificador do usuário
        return "Meu nome é: " + this.nome;
    }

    //HASHCODE & EQUALS
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
