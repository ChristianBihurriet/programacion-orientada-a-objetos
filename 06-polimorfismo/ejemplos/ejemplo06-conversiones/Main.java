public class Main {
    public static void main(String[] args) {
        // Upcasting: es implícito y seguro porque todo Perro es un Animal.
        Animal animal = new Perro();
        animal.emitirSonido();

        // Downcasting seguro tras comprobar el tipo real.
        if (animal instanceof Perro perro) {
            perro.moverCola();
        }

        Animal otroAnimal = new Gato();
        if (otroAnimal instanceof Perro) {
            System.out.println("El otro animal es un perro");
        } else {
            System.out.println("No se convierte a Perro porque su tipo real es Gato");
        }

        // Este error habitual compila, pero la JVM rechaza la conversión.
        try {
            Perro conversionIncorrecta = (Perro) otroAnimal;
            conversionIncorrecta.moverCola();
        } catch (ClassCastException error) {
            System.out.println("Conversión incorrecta interceptada");
        }
    }
}
