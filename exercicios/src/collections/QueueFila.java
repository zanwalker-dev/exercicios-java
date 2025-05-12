package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Pedro");// add: caso a fila tenha tamanho definido, ele gera um erro e não adiciona se exceder o limite;
        fila.offer("Joaquina"); // offer: retorna false e não adiciona se exceder o limite, true se ainda tiver limite;
        fila.offer("Maria");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Guilherme");
        System.out.println("Fila inicial: " + fila);

        //PEEK & ELEMENT --> Lê o elemento que for o primeiro da fila mas não elimina;
        System.out.println("peek: " + fila.peek()); //se a fila estiver vazia retorna null;
        System.out.println("element: " + fila.element()); //se a fila estiver vazia retorna erro;

        //POLL & REMOVE --> Retorna o primeiro elemento da fila e remove ele;
        //ps: se a fila acabar POLL retorna null e REMOVE retorna erro;
        System.out.println(fila.poll()); // retorna Pedro(primeiro da fila) e remove;
        System.out.println(fila.remove()); // retorna Joaquina(q agr é a primeira da fila) e remove;
        System.out.println(fila.poll()); // retorna Maria(q agr é a primeira da fila) e remove;
        System.out.println("Fila após o POLL remover na ordem: " + fila);

        //Outras funções:
        //fila.size(); --> tamanho da fila
        //fila.clear(); --> limpar a fila
        //fila.isEmpty(); --> verificar se a fila está vazia




    }
}
