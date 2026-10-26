public class Libro {
    private final String titulo;
    private final Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarFicha() {
        System.out.println(titulo + ", de " + autor.getNombre());
    }
}
