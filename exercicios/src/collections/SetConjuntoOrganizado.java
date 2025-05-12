package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoOrganizado {
    //Exemplo de como organizar, forma homogênea(apenas um tipo);
    public static void main(String[] args) {

        //O SortedSet e o TreeSet organiza por ordem natural (crescente para números, alfabética para strings, etc.)
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Cesar");
        listaAprovados.add("Francisco");
        listaAprovados.add("Açucena");
        listaAprovados.add("Fabiana");


        for(String candidato : listaAprovados){
            System.out.println("Candidato(a) aprovado(a): " + candidato);
        }

        //Set por padrão não é organizada por ordem, e o HashSet segue esse padrão
        Set<Integer> nums = new HashSet<>(); //obs: Integer pq não aceita primitivo, então wrap int --> Integer
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for(Integer num : nums){
            System.out.println(num);
        }
    }
}
