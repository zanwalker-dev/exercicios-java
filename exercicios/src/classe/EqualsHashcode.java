package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Henrique";
        u1.email = "pedrinhohenquinho@mail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Henrique";
        u2.email = "pedrinhohenquinho@mail.com";

        System.out.println(u1 == u2); // false, o "==" irá comparar o endereço na memória e não o conteúdo do objeto
        System.out.println(u1.equals(u2)); // para dar true precisamos implementar lá no usuário
    }
}
