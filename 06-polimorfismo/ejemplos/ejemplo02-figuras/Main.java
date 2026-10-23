import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = List.of(new Circulo(2), new Rectangulo(3, 4));
        for (Figura figura : figuras) System.out.printf("Área: %.2f%n", figura.area());
    }
}
