package tema04.ejemplos.ejemplo02equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private final String nombre;
    private final List<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre) { this.nombre = nombre; }
    public void fichar(Jugador jugador) { jugadores.add(jugador); }

    public void mostrarPlantilla() {
        System.out.println(nombre + ":");
        for (Jugador jugador : jugadores) System.out.println("- " + jugador.getNombre());
    }
}
