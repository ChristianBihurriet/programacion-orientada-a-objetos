public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Sara"); // existe antes e independientemente
        Equipo equipo = new Equipo("Atlántico");
        equipo.fichar(jugador);
        equipo.mostrarPlantilla();
    }
}
