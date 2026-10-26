package tema07.ejemplos.ejemplo01figuras;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("azul", 2),
            new Rectangulo("rojo", 3, 4)
        };
        for (Figura figura : figuras) {
            figura.describir();
            System.out.printf("Área: %.2f%n", figura.area());
        }
    }
}
