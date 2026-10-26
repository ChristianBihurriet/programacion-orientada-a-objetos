import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Omar");
        nombres.add("Lía");

        System.out.println("Recorrido con índice:");
        for (int indice = 0; indice < nombres.size(); indice++) {
            System.out.println(indice + ": " + nombres.get(indice));
        }

        System.out.println("Recorrido for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
