public class Ejemplo01CuentaSegura {
    static class Cuenta {
        private final String titular;
        private double saldo;

        Cuenta(String titular, double saldoInicial) {
            if (titular == null || titular.isBlank() || saldoInicial < 0) {
                throw new IllegalArgumentException("Datos iniciales no válidos");
            }
            this.titular = titular;
            saldo = saldoInicial;
        }

        public String getTitular() { return titular; }
        public double getSaldo() { return saldo; }

        public void ingresar(double cantidad) {
            validarCantidad(cantidad);
            saldo += cantidad;
        }

        public boolean retirar(double cantidad) {
            validarCantidad(cantidad);
            if (cantidad > saldo) return false;
            saldo -= cantidad;
            return true;
        }

        private void validarCantidad(double cantidad) {
            if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Lía", 80);
        cuenta.ingresar(20);
        System.out.println(cuenta.getTitular() + ": " + cuenta.getSaldo());
        System.out.println("Retirada de 150: " + cuenta.retirar(150));
    }
}
