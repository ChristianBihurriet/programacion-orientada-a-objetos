package tema07.ejemplos.ejemplo01figuras;

public class Circulo extends Figura {
    private final double radio;
    public Circulo(String color, double radio) { super(color); this.radio = radio; }
    @Override public double area() { return Math.PI * radio * radio; }
}
