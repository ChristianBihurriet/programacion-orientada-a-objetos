public class Moto extends Vehiculo {
    public Moto(String matricula) { super(matricula); }

    @Override
    public void desplazarse() { System.out.println("La moto avanza sobre dos ruedas"); }
}
