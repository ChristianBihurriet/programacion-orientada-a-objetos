import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> modulos = new ArrayList<>();

        modulos.add("Programación");
        modulos.add("Bases de datos");
        modulos.add("Sistemas");
        System.out.println("Tamaño tras añadir: " + modulos.size());

        String primero = modulos.get(0);
        System.out.println("Primer módulo: " + primero);

        String sustituido = modulos.set(2, "Entornos de desarrollo");
        System.out.println("Módulo sustituido: " + sustituido);
        System.out.println("Nuevo valor en el índice 2: " + modulos.get(2));

        String eliminadoPorIndice = modulos.remove(1);
        System.out.println("Eliminado por índice: " + eliminadoPorIndice);

        boolean eliminadoPorValor = modulos.remove("Programación");
        System.out.println("Eliminado por valor: " + eliminadoPorValor);
        System.out.println("Tamaño final: " + modulos.size());
        System.out.println("Lista vacía: " + modulos.isEmpty());
    }
}
