public class Vehiculo {
    private final String matricula;

    public Vehiculo(String matricula) { this.matricula = matricula; }
    public String getMatricula() { return matricula; }
    public void desplazarse() { System.out.println("El vehículo se desplaza"); }
}
