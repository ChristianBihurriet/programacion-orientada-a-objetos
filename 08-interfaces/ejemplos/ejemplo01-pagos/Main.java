public class Main {
    private static void procesarPago(MetodoPago metodo, double importe) {
        // El método depende del contrato, no de Tarjeta o Monedero.
        boolean aceptado = metodo.pagar(importe);
        System.out.println("Resultado: " + aceptado);
    }

    public static void main(String[] args) {
        MetodoPago[] metodos = {
            new Tarjeta(100),
            new Monedero(30)
        };

        for (MetodoPago metodo : metodos) {
            procesarPago(metodo, 25);
        }

        // Caso límite: el monedero no dispone de saldo suficiente.
        procesarPago(new Monedero(10), 25);
    }
}
