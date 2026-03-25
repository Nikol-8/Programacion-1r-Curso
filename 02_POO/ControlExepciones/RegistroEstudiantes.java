package Tarea;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class RegistroEstudiantes {

    private ArrayList<Estudiante> lista = new ArrayList<>();

    public void registrarEstudiante(Estudiante e) {
        lista.add(e);
    }

    public void mostrarEstudiantes() throws ListaVaciaException {
        if (lista.isEmpty()) {
            throw new ListaVaciaException("No hay estudiantes registrados");
        }

        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }

    public void guardarEnArchivo(String ruta) {
        try {
            FileWriter fw = new FileWriter(ruta);

            for (Estudiante e : lista) {
                fw.write(e.toString() + "\n");
            }

            fw.close();
            System.out.println("Datos guardados correctamente");

        } catch (Exception e) {
            System.out.println("Error al guardar archivo");
        }
    }

    public void cargarDesdeArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al cargar archivo");
        }
    }
}
