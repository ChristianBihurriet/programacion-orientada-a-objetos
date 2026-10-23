public class Coche extends Vehiculo {
    public Coche(String matricula) { super(matricula); }

    @Override
    public void desplazarse() { System.out.println("El coche circula por la carretera"); }
}
