package Tarea;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(String nombre, int edad, String curso)
        throws NombreInvalidoException, EdadInvalidaException, CursoInvalidoException {

            if (nombre == null || nombre.isEmpty()) {
                throw new NombreInvalidoException("El nombre no puede estar vacío.");
            }

            if (edad < 18 || edad > 65) {
                throw new EdadInvalidaException("La edad no esta en el rango de 18 y 65");
            }

        if (!curso.equalsIgnoreCase("Java") &&
                !curso.equalsIgnoreCase("Python") &&
                !curso.equalsIgnoreCase("Bases de Datos")) {
                throw new CursoInvalidoException("Curso no válido");
            }

            this.nombre = nombre;
            this.edad = edad;
            this.curso = curso;
        }

        @Override
        public String toString() {
            return nombre + " - " + edad + " - " + curso;
        }
    }
