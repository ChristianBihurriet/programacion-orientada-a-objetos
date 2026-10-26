package tema09.ejemplos.paso07eliminacionsegura;

public class Producto {
    private final String nombre;
    private final int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }
}
