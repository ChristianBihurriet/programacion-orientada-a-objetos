public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.mostrarAviso();
        robot.recargar();
        robot.mover(15);
        System.out.println("Batería: " + robot.getBateria() + " " + Recargable.unidad());
    }
}
