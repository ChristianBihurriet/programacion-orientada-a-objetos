import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrayNombres = new String[2];
        arrayNombres[0] = "Ana";
        arrayNombres[1] = "Omar";

        System.out.println("Longitud fija del array: " + arrayNombres.length);
        System.out.println("Primer nombre del array: " + arrayNombres[0]);

        List<String> listaNombres = new ArrayList<>();
        System.out.println("Lista vacía: " + listaNombres.isEmpty());

        listaNombres.add("Ana");
        listaNombres.add("Omar");
        listaNombres.add("Lía"); // La lista puede crecer sin indicar un tamaño.

        System.out.println("Tamaño variable de la lista: " + listaNombres.size());
        System.out.println("Lista vacía: " + listaNombres.isEmpty());
    }
}
