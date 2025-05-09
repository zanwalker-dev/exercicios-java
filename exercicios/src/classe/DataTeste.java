package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = "23";
        d1.mes = "02";
        d1.ano = "1997";

        Data d2 = new Data();
        d2.dia = "27";
        d2.mes = "12";
        d2.ano = "1993";

        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);


    }
}
