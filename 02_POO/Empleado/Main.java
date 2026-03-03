package E4;

public class Main {

    public static void main(String[] args) {

        Empleado e1 = new EmpleadoFijo("Adriana Arnau", 2500, 300);
        Empleado e2 = new EmpleadoPorHoras("Noha Román",
                60, 8.00);

        System.out.println(e1.mostrarDatos());
        System.out.println(e2.mostrarDatos());

        System.out.println("\n¿Quién gana más?");

        if (e1.calcularSalario() > e2.calcularSalario()) {
            System.out.println(e1.mostrarDatos());
        } else {
            System.out.println(e2.mostrarDatos());
        }

    }
}
