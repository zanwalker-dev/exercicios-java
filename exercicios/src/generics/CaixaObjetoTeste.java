package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        //EXEMPLO SEM UDO DO GENERICS(versão mais trabalhosa e ruim)
        CaixaObjeto caixaA = new CaixaObjeto(); //Toda vez que for chamar a coisa precisa fazer um cast explicito do tipo

        caixaA.guardar(2.3); //converte automaticamente esse double para Double(wraper)

        Integer coisa = (Integer) caixaA.abrir(); // tive que fazer cast afinal

        System.out.println(coisa); //vai retornar uma exception justamente pq o tipo da coisa é Double e não Interger
    }

}

