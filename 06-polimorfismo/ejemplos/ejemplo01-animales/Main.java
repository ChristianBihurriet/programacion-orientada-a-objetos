public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.emitirSonido(); // disponible en Animal; ejecutado desde Perro
        // animal.moverCola(); // no compila: el tipo declarado no ofrece ese método
    }
}
