public class Ejemplo02Referencias {
    static class Caja {
        int contenido;
    }

    public static void main(String[] args) {
        Caja primeraReferencia = new Caja();
        primeraReferencia.contenido = 10;
        Caja segundaReferencia = primeraReferencia;

        segundaReferencia.contenido = 25;
        System.out.println(primeraReferencia.contenido); // 25: es el mismo objeto

        Caja otraCaja = new Caja();
        otraCaja.contenido = 25;
        System.out.println(primeraReferencia == otraCaja); // false: distinta identidad
    }
}
