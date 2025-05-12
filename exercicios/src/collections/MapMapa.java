package collections;

import java.util.HashMap;
import java.util.Map;

public class MapMapa {

    public static void main(String[] args) {

        //estrutura de chave e valor, como uma tabela CHAVE:VALOR
        Map<Integer, String> usuarios = new HashMap<>();

        //Usasse PUT no lugar de ADD para adicionar itens ao map
        usuarios.put(1, "Pedro"); // Se houver repetição da chave ele altera o valor da chave no lugar de adicionar
        usuarios.put(2, "Carlos");
        usuarios.put(3, "Rodrigo");
        usuarios.put(4, "Pedro"); // permite repetir contanto que a chave seja diferente;

        System.out.println(usuarios.size());

        //KEYSET --> retorna o conjuto das chaves;
        System.out.println(usuarios.keySet());

        //VALUES --> retorna o conjunto de valores;
        System.out.println(usuarios.values());

        //ENTRYSET --> retorna chave e valor ao mesmo tempo;
        System.out.println(usuarios.entrySet());

        //CONTAINSKEY & CONTAINSVALUE --> verificação se contém apartir de chave ou valor. ps: retorna true ou false;
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Pedro"));

        //GET --> pega um elemento atraves da CHAVE;
        System.out.println(usuarios.get(1));

        //FOREACH percorrendo a CHAVE:
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        //FOREACH percorrendo o VALOR:
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        //FOREACH percorrendo CHAVE e VALOR:
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro);
        }

    }
}
