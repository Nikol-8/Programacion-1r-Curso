package E4;

public class EmpleadoFijo  extends Empleado{

    //Atributos
    private double bonus;

    public EmpleadoFijo(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    //Getters Setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public  double calcularSalario(){
        return getSalarioBase() + bonus;
    }
}
