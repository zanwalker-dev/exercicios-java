package excessao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeDoAtributo;
    NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está negativo.", nomeDoAtributo);
    }
}
