package tema08.ejemplos.ejemplo01pagos;

public class Monedero implements MetodoPago {
    private double saldo;
    public Monedero(double saldo) { this.saldo = saldo; }

    @Override
    public boolean pagar(double importe) {
        if (importe <= 0 || importe > saldo) return false;
        saldo -= importe;
        System.out.println("Pago con monedero aceptado");
        return true;
    }
}
