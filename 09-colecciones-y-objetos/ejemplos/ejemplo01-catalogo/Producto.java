import java.util.Objects;

public class Producto {
    private final String codigo;
    private final String nombre;

    public Producto(String codigo, String nombre) {
        this.codigo = Objects.requireNonNull(codigo);
        this.nombre = Objects.requireNonNull(nombre);
    }

    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) return true;
        if (!(otro instanceof Producto producto)) return false;
        return codigo.equals(producto.codigo);
    }

    @Override
    public int hashCode() { return Objects.hash(codigo); }
}
