package tema02.ejemplos.ejemplo01cuentabancaria;

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
        // Sobrecarga: cada llamada selecciona un constructor diferente.
        CuentaBancaria cuentaSinSaldo = new CuentaBancaria("Ana");
        CuentaBancaria cuentaConSaldo = new CuentaBancaria("Nora", 100);

        System.out.println(cuentaSinSaldo.titular + ": " + cuentaSinSaldo.saldo);
        System.out.println(cuentaConSaldo.titular + ": " + cuentaConSaldo.saldo);

        cuentaConSaldo.ingresar(50);
        System.out.println("Retirada aceptada: " + cuentaConSaldo.retirar(40));
        System.out.println("Saldo final: " + cuentaConSaldo.saldo);

        // Un método static se llama mediante el nombre de la clase.
        System.out.println("Cantidad válida: " + CuentaBancaria.cantidadValida(20));
        System.out.println("Cero es válido: " + CuentaBancaria.cantidadValida(0));
    }
}
