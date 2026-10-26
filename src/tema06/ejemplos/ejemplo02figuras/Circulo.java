package tema06.ejemplos.ejemplo02figuras;

public class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) { this.radio = radio; }
    @Override public double area() { return Math.PI * radio * radio; }
}
