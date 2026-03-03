package E4;

public class EmpleadoPorHoras extends Empleado {

    //Atributos
    private double horasTrabajadas;
    private double precioHora;

    //Constructor


    public EmpleadoPorHoras(String nombre,
                            double horasTrabajadas,
                            double precioHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    //Getters setters
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    //metodo
    @Override
    public double calcularSalario() {
        return  horasTrabajadas * precioHora;
    }
}
