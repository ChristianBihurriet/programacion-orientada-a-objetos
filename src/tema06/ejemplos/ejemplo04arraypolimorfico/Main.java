package tema06.ejemplos.ejemplo04arraypolimorfico;

public class Main {
    public static void main(String[] args) {
        // El tipo del array es Animal, pero los objetos tienen tipos reales distintos.
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Perro()
        };

        for (Animal animal : animales) {
            animal.emitirSonido();
        }
    }
}
