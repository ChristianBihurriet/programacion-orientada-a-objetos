import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = List.of(new Circulo("azul", 2), new Rectangulo("rojo", 3, 4));
        for (Figura figura : figuras) {
            figura.describir();
            System.out.printf("Área: %.2f%n", figura.area());
        }
    }
}
