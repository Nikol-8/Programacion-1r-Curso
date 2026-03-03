package E5;

public class Moto extends Vehiculo{

    //Atributos
    private int cilindrada;

    //Constructor
    public Moto(String marca, String modelo, double kilometros, int cilindrada) {
        super(marca, modelo, kilometros);
        this.cilindrada = cilindrada;
    }

    //Getters Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public double calcularConsumo() {
        if (cilindrada > 500) {
            return getKilometros() * 0.08;
        }
        return getKilometros() * 0.05;
    }
}
