public class Animal {
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void emitirSonido() {
        System.out.println("Sonido de animal");
    }
}
