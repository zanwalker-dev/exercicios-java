package classe;

public class Data {

    String dia;
    String mes;
    String ano;

    Data(){
        dia = "01";
        mes = "01";
        ano = "1970";
    }

    Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        return dia + "/" + mes + "/" + ano;
    }

}
