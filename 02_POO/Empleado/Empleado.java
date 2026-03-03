package E4;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private double salarioBase;

    //Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //Getters Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //metodos
    public abstract double calcularSalario();

    public String mostrarDatos(){
        return "Empleado: " + nombre +
                " | Salario Final: " + calcularSalario() + "€";
    }
}
