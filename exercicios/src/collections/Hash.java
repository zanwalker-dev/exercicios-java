package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Antonio"));

        System.out.println(usuarios.contains(new Usuario("Maria")));
    }
}
