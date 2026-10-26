package tema05.ejemplos.ejemplo01vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("1234-ABC");
        Moto moto = new Moto("5678-DEF");
        System.out.println(coche.getMatricula());
        coche.desplazarse();
        moto.desplazarse();
    }
}
