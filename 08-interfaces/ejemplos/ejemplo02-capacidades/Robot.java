public class Robot implements Recargable, Movible {
    private int bateria;
    @Override public void recargar() { bateria = 100; }
    @Override public void mover(int metros) {
        bateria -= Math.min(bateria, Math.abs(metros));
        System.out.println("El robot se mueve " + metros + " m");
    }
    public int getBateria() { return bateria; }
}
