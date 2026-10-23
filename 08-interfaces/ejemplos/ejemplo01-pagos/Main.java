import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MetodoPago> metodos = List.of(new Tarjeta(100), new Monedero(30));
        for (MetodoPago metodo : metodos) System.out.println("Resultado: " + metodo.pagar(25));
    }
}
