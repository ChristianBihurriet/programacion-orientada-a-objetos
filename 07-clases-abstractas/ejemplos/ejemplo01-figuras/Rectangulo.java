public class Rectangulo extends Figura {
    private final double base, altura;
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    @Override public double area() { return base * altura; }
}
