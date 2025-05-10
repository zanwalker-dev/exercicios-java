package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //Atribuição por valor / cópia do valor de "a"

        a++;
        b--;
        System.out.println(a);
        System.out.println(b); //por ser uma copia ele não se afeta pelo valor módificado de "a"

        Data d1 = new Data("01","06","2018");
        Data d2 = d1; //Atribuição por referência / link para valor de d1, se o valor de d1 mudar ele muda tbm

        d1.dia = "12";
        d2.mes = "10";

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada()); //o dia foi alterado pq alterei a informação do d1

        voltarDataParaValorPadrao(d1);//alterei apenas d1, mas como d2 está referenciando d1 tbm será imprimido resetado

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);

    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = "01";
        d.mes = "01";
        d.ano = "1970";
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
