package tema04.ejemplos.ejemplo01pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<LineaPedido> lineas = new ArrayList<>();

    public void agregar(String producto, int cantidad, double precio) {
        lineas.add(new LineaPedido(producto, cantidad, precio));
    }

    public double total() {
        double total = 0;
        for (LineaPedido linea : lineas) total += linea.subtotal();
        return total;
    }
}
