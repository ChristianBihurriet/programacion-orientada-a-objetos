package tema09.ejemplos.paso05busquedamanual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Producto buscarPorCodigo(List<Producto> productos, String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    private static void mostrarResultado(Producto producto) {
        if (producto == null) {
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("Encontrado: " + producto.getNombre());
        }
    }

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("A1", "Teclado"));
        productos.add(new Producto("B2", "Ratón"));

        mostrarResultado(buscarPorCodigo(productos, "B2"));
        mostrarResultado(buscarPorCodigo(productos, "X9"));
    }
}
