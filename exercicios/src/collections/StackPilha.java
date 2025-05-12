package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        //ADD & PUSH --> adicionam ao stack
        livros.add("Saltimbancos"); //add --> retorna true e adiciona ou false se não tiver mais espaço;
        livros.push("Percy Jackson"); //push --> não retorna nada, apenas adiciona ou não;
        livros.push("Joao e o pé de feijão");
        livros.push("O Hobbit");
        System.out.println(livros);

        //PEEK & ELLEMENT --> verifica quem é o proximo da pilha(nesse caso, o último a ser adicionado) sem remover;
        System.out.println(livros.peek());
        System.out.println(livros.element());

        //POP,POLL & REMOVE --> verifica quem é o proximo da pilha(nesse caso, o último a ser adicionado) e remove;
        System.out.println(livros.pop()); //pop --> também retorna null como o poll se não houver mais itens na pilha
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println("Pilha depois do poll e remove: " + livros);

        //Outras funções:
        //fila.size(); --> tamanho da pilha
        //fila.clear(); --> limpar a pilha
        //fila.isEmpty(); --> verificar se a pilha está vazia
    }
}
