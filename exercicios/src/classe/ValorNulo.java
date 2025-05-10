package classe;

public class ValorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

//        String s2 = null;
//        System.out.println(s2.concat("????")); //vai dar erro de runtime por estar tentando acessar um atributo
                                                 //de uma variavel nulo

//      String s2;
//      System.out.println(s2.concat("????")); // não vai dar certo pq ainda não foi inicializado
    }
}
