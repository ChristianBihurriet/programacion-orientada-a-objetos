import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new CopiaSeguridad());
        tareas.add(new EnviarInforme());
        for (Tarea tarea : tareas) tarea.ejecutar();
    }
}
