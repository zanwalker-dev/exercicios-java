package controle;

//public class DesafioFor {
//    public static void main(String[] args) {
//
//        String valor = "#";
//
//        for( int i = 1; i <= 5; i++){
//            System.out.println(valor);
//            valor += "#";
//        }
//
//    }
//}

// Versão do desafio:
//
//public class DesafioFor {
//    public static void main(String[] args) {
//
//        String valor = "#";
//        String valorMax = "#####";
//
//        for( int i = valor.length(); i <= valorMax.length(); i++){
//            System.out.println(valor);
//            valor += "#";
//        }
//    }
//}

// Versão otimizada

public class DesafioFor {
    public static void main(String[] args) {

        for( String valor = "#"; !valor.equals("######"); valor += "#"){
            System.out.println(valor);
        }
    }
}


