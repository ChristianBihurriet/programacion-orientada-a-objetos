package tema06.ejemplos.ejemplo02figuras;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {new Circulo(2), new Rectangulo(3, 4)};
        for (Figura figura : figuras) System.out.printf("Área: %.2f%n", figura.area());
    }
}
