package oo.encapsulamento.casaA;

public class Ana {

    @SuppressWarnings("unused")
    private String segredo = "segredo de ana"; //privado - apenas Ana tem acesso;
    String facoDentroDeCasa = "Dou risada de boca cheia"; //Default - Quem mora com Ana(está no msm pacote) tem acesso;
    protected String formaDeFalar = "..."; // quem está na mesma casa ou pode ser transmitido por herança;
    public String facoNaRua = "Sento na calçada"; //publico  - para todos;

}
