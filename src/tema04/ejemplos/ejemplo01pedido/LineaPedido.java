package tema04.ejemplos.ejemplo01pedido;

public class LineaPedido {
    private final String producto;
    private final int cantidad;
    private final double precioUnitario;

    public LineaPedido(String producto, int cantidad, double precioUnitario) {
        if (cantidad <= 0 || precioUnitario < 0) throw new IllegalArgumentException("Línea no válida");
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double subtotal() { return cantidad * precioUnitario; }
    public String getProducto() { return producto; }
}
