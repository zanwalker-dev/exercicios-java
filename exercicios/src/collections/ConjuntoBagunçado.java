package collections;

import java.util.HashSet;

public class ConjuntoBagunçado {
    //EXEMPLO DO QUE NÃO FAZER, tipos heterogeneos.
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        //Por não aceitar tipo primitivo ele faz um Wrap
        conjunto.add(1.2); //double --> Double
        conjunto.add(true); //boolean --> Boolean
        conjunto.add("string"); //string --> String
        conjunto.add(1); //int --> Integer
        conjunto.add('x'); //char --> Character

        System.out.println("Tamanho é " + conjunto.size());

        //ADD --> adciona um obj à collection
        conjunto.add("String"); // aceitou repetição pq o S está maiúsculo "String" != "string"
        System.out.println("Tamanho é " + conjunto.size());

        //REMOVE --> remove um obj de dentro de uma collection caso ele exista(true);
        System.out.println("Retorna " + conjunto.remove("teste")); // retorna  false pq esse obj não existe na collection
        System.out.println("Retorna " + conjunto.remove("string")); // retorna true pq existe e remove da collection
        System.out.println("Tamanho é " + conjunto.size());

        //CONTAINS --> verificar se contem um obj dentro de uma collection;
        System.out.println("Se contem retorna " + conjunto.contains(1)); // retorna true pq contem obj passado por parametro
        System.out.println("Se não contem retorna " + conjunto.contains('s')); //e false pq não contem o obj

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Valores de conjunto são: " + conjunto);
        System.out.println("Valores de nums são: " + nums);

        //INTERSEÇÕES

        //ADDALL --> adciona todos os objs de uma collection a outra;
        conjunto.addAll(nums);
        System.out.println("Agora os valores de num são: " + conjunto);
    }
}
