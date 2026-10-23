public abstract class Figura {
    private final String color;

    protected Figura(String color) { this.color = color; }
    public String getColor() { return color; }
    public void describir() { System.out.println("Figura de color " + color); }
    public abstract double area();
}
