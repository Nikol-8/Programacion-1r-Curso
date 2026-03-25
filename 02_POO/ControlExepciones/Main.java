package Tarea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroEstudiantes registro = new RegistroEstudiantes();

        int opcion = 0;

        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Guardar en archivo");
            System.out.println("4. Cargar desde archivo");
            System.out.println("5. Salir");

            try {
                System.out.println("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Nombre: ");
                            String nombre = sc.nextLine();

                            System.out.println("Edad: ");
                            int edad = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Curso: ");
                            String curso = sc.nextLine();

                            Estudiante e = new Estudiante(nombre, edad, curso);
                            registro.registrarEstudiante(e);
                        } catch (Exception ex) {
                            System.out.println("Error: " + ex.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            registro.mostrarEstudiantes();
                        } catch (ListaVaciaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Ruta del archivo: " );
                            String rutaGuardar = sc.nextLine();
                            registro.guardarEnArchivo(rutaGuardar);
                        } catch (Exception ex) {
                            System.out.println("Error al guardar el archivo.");
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Ruta del archivo: ");
                            String rutaCargar = sc.nextLine();
                            registro.cargarDesdeArchivo(rutaCargar);
                        } catch (Exception e) {
                            System.out.println("Error al cargar el archivo.");
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opci'on no válida");
                }

            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
                sc.nextLine();

            }
        } while (opcion != 5);

        sc.close();
    }

}
