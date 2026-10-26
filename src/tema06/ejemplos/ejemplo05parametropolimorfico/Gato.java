package tema06.ejemplos.ejemplo05parametropolimorfico;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }
}
