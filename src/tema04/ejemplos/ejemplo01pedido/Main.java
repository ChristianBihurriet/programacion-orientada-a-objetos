package tema04.ejemplos.ejemplo01pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregar("Cuaderno", 2, 3.50);
        pedido.agregar("Bolígrafo", 3, 1.20);
        System.out.printf("Total: %.2f €%n", pedido.total());
    }
}
