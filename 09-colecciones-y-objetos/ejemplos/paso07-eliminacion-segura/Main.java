import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado", 4));
        productos.add(new Producto("Ratón", 0));
        productos.add(new Producto("Monitor", 2));
        productos.add(new Producto("Altavoces", 0));

        // No se elimina directamente desde un for-each.
        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            Producto producto = iterador.next();
            if (producto.getStock() == 0) {
                System.out.println("Se elimina: " + producto.getNombre());
                iterador.remove();
            }
        }

        System.out.println("Productos restantes:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}
