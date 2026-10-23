public interface Recargable {
    void recargar();

    default void mostrarAviso() { System.out.println("Usa un cargador compatible"); }
    static String unidad() { return "porcentaje"; }
}
