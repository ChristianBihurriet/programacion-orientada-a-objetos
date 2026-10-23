public class Tarjeta implements MetodoPago {
    private double limiteDisponible;
    public Tarjeta(double limiteDisponible) { this.limiteDisponible = limiteDisponible; }

    @Override
    public boolean pagar(double importe) {
        if (importe <= 0 || importe > limiteDisponible) return false;
        limiteDisponible -= importe;
        System.out.println("Pago con tarjeta aceptado");
        return true;
    }
}
