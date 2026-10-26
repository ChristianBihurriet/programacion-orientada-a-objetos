package tema09.ejemplos.paso04listaobjetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 35));
        productos.add(new Producto("Ratón", 20));
        productos.add(new Producto("Monitor", 180));

        double precioTotal = 0;
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + ": " + producto.getPrecio() + " €");
            precioTotal += producto.getPrecio();
        }

        System.out.println("Suma de precios: " + precioTotal + " €");
    }
}
