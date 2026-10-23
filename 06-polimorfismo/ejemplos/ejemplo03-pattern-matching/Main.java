public class Main {
    private static void observar(Animal animal) {
        if (animal instanceof Perro perro) perro.moverCola();
        else if (animal instanceof Gato gato) gato.ronronear();
    }

    public static void main(String[] args) {
        observar(new Perro());
        observar(new Gato());
    }
}
