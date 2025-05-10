package classe;

public class DesafioStatic {

    int a = 3;//não pode alterar essa linha

    public static void main(String[] args) { //static só pode acessar outro static

       DesafioStatic d = new DesafioStatic(); //para acessar um objeto de instancia dentro da classe preciso instanciar
        System.out.println(d.a);
    }
}
