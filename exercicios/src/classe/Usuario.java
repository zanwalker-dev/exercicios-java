package classe;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {

        Usuario outro = (Usuario) obj;

        //FALTA USAR O HASHCODE

        if(obj instanceof Usuario){ //garantindo que o objeto comparado é realmente do tipo usuário para evitar erros

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        return false;
    }
}
