package tema09.ejemplos.paso06gestorcoleccion;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.agregar(new Producto("A1", "Teclado"));
        catalogo.agregar(new Producto("B2", "Ratón"));

        catalogo.mostrarProductos();
        System.out.println("Número de productos: " + catalogo.getNumeroProductos());

        Producto encontrado = catalogo.buscarPorCodigo("A1");
        if (encontrado != null) {
            System.out.println("Búsqueda: " + encontrado.getNombre());
        }
    }
}
