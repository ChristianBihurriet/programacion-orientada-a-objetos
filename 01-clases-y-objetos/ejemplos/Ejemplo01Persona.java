public class Ejemplo01Persona {
    static class Persona {
        String nombre;
        int edad;

        void presentarse() {
            System.out.printf("Soy %s y tengo %d años.%n", nombre, edad);
        }
    }

    public static void main(String[] args) {
        Persona ana = new Persona();
        ana.nombre = "Ana";
        ana.edad = 20;

        Persona omar = new Persona();
        omar.nombre = "Omar";
        omar.edad = 22;

        ana.presentarse();
        omar.presentarse();
    }
}
