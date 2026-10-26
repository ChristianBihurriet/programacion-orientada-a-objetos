package tema06.ejemplos.ejemplo02figuras;

public class Rectangulo extends Figura {
    private final double base, altura;
    public Rectangulo(double base, double altura) { this.base = base; this.altura = altura; }
    @Override public double area() { return base * altura; }
}
