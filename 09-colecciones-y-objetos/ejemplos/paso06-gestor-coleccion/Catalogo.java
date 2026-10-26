import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private final List<Producto> productos = new ArrayList<>();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getCodigo() + " - " + producto.getNombre());
        }
    }

    public int getNumeroProductos() {
        return productos.size();
    }
}
