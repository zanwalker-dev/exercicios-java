package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(); //Exemplo constructor padrão

        Data d2 = new Data( "23","02","1997" ); //Exemplo passando parametros

        Data d3 = new Data(); //Exemplo padrão mas alterando manualmente
        d3.dia = "27";
        d3.mes = "12";
        d3.ano = "1993";

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());


    }
}
