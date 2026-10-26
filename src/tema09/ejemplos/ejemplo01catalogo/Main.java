package tema09.ejemplos.ejemplo01catalogo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(new Producto("A1", "Ratón"));
        catalogo.add(new Producto("B2", "Teclado"));

        System.out.println("Primero: " + catalogo.get(0).getNombre());
        for (Producto producto : catalogo) System.out.println(producto.getNombre());
        System.out.println("Contiene A1: " + catalogo.contains(new Producto("A1", "Otro nombre")));

        // Se recorre desde el final para eliminar sin desplazar índices pendientes.
        for (int indice = catalogo.size() - 1; indice >= 0; indice--) {
            Producto producto = catalogo.get(indice);
            if (producto.getNombre().startsWith("T")) {
                catalogo.remove(indice);
            }
        }
        System.out.println("Tamaño final: " + catalogo.size());
    }
}
