package streams;

public class Livro {

    String titulo;
    String autor;
    int paginas;

    Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return titulo.toString();
    }
}
