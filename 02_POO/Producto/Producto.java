package E3;

public class Producto {

    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Métodos
    public int vender(int cantidad) {

        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad;
            return cantidad; // devuelve lo que se ha vendido
        } else {
            System.out.println("Stock insuficiente.");
            return 0;
        }
    }

    public void reponer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public double valorInventario() {
        return precio * stock;
    }

    public boolean hayStock(){
        return stock > 0;
    }

    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio +
                "€ | Stock: " + stock + " + unidades";
    }
}
