package tema06.ejemplos.ejemplo05parametropolimorfico;

public class Main {
    private static void presentarYEscuchar(Animal animal) {
        // El parámetro acepta cualquier objeto que sea un Animal.
        System.out.println("Nombre: " + animal.getNombre());
        animal.emitirSonido();
    }

    public static void main(String[] args) {
        Perro perro = new Perro("Toby");
        Gato gato = new Gato("Luna");

        presentarYEscuchar(perro);
        presentarYEscuchar(gato);
    }
}
