package classe.desafioJantar;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João",74.6);

        Comida com1 = new Comida("Arroz",0.234);
        Comida com2 = new Comida("Purê",0.356);
        Comida com3 = new Comida("Frango",0.5);

        System.out.printf("%s tinha %.2fkg antes de comer: %s,%s e %s.\n",p1.nome, p1.peso, com1.nome, com2.nome, com3.nome);
        System.out.printf("Agora %s tem %.2fkg depois de comer: %s,%s e %s.\n",p1.nome, p1.comer(com1.peso + com2.peso + com3.peso), com1.nome, com2.nome, com3.nome);
    }
}
