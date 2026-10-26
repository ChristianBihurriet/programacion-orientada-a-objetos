public class Main {
    public static void main(String[] args) {
        // El autor existe antes que los libros y puede asociarse con varios.
        Autor autora = new Autor("Ana María Matute");

        Libro primerLibro = new Libro("Primera memoria", autora);
        Libro segundoLibro = new Libro("Olvidado rey Gudú", autora);

        primerLibro.mostrarFicha();
        segundoLibro.mostrarFicha();

        // Los dos libros conservan una referencia al mismo objeto Autor.
        System.out.println("Los libros comparten autora: "
                + (primerLibro.getAutor() == segundoLibro.getAutor()));
    }
}
