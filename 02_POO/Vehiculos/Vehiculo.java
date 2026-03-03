package E5;

public abstract class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private double kilometros;

    //Constructor
    public Vehiculo(String marca, String modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    //Getters Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }


    //Metodos

    //Cada tipo de vehículo calcula el consumo diferente
    public abstract double calcularConsumo();

    public String mostrarInfo() {
        return marca + " | " + modelo +
                " | " + kilometros + " km" +
                " | Consumo: " + calcularConsumo() + " L";
    }
}
