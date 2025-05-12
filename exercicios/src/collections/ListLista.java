package collections;

import java.util.ArrayList;

public class ListLista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Pedro")); //INSTANCIANDO USUARIO AO MESMO TEMPO QUE ADICIONO "new Usuario";
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Antonio"));
        lista.add(new Usuario("Pedro")); //aceita repetição pois pode acessada e organizada por índice;
        lista.add(new Usuario("Joaquina"));

        //GET --> permite encontrar o obj acessando diretamente o índice;
        System.out.println("Impresso por GET: " + lista.get(3));

        //REMOVE --> possibilidade de remover também por índice;
        System.out.println(lista.remove(2)); // retorna o nome do obj e remove;
        System.out.println(lista.remove(new Usuario("Joaquina"))); // retorna true ou false, se for true remove;

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
