public class Ejemplo01CuentaBancaria {
    static class CuentaBancaria {
        String titular;
        double saldo;

        CuentaBancaria(String titular) {
            this(titular, 0);
        }

        CuentaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            saldo = saldoInicial;
        }

        void ingresar(double cantidad) {
            saldo += cantidad;
        }

        boolean retirar(double cantidad) {
            if (cantidad > saldo) return false;
            saldo -= cantidad;
            return true;
        }

        static boolean cantidadValida(double cantidad) {
            return cantidad > 0;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Nora", 100);
        cuenta.ingresar(50);
        System.out.println("Retirada aceptada: " + cuenta.retirar(40));
        System.out.println("Saldo: " + cuenta.saldo);
        System.out.println("Cantidad válida: " + CuentaBancaria.cantidadValida(20));
    }
}
