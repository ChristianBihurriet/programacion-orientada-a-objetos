package tema06.ejemplos.ejemplo05parametropolimorfico;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau");
    }
}
