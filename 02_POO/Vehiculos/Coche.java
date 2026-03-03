package E5;

public class Coche extends Vehiculo {

    //Atributos
    private double consumoPorKm;

    public Coche(String marca, String modelo, double kilometros, double consumoPorKm) {
        super(marca, modelo, kilometros);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularConsumo() {
        return getKilometros() * consumoPorKm;
    }
}
