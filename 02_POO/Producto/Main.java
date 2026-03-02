package E3;

public class Main {

    public static void main(String[] args) {

        Producto libro = new Producto( "Atomic Habits", 12.95, 6);
        Producto libreta = new Producto("libreta/s", 4.95, 7);

        System.out.println("Se ha vendido " + libro.vender(3) + " unidades de " + libro.getNombre());
        System.out.println(libro.getStock());

        libro.vender(3);

        System.out.println(libro.getStock());

        libro.vender(9);

        System.out.println();
        System.out.println("Hay " + libreta.getStock()
                + " unidades de " + libreta.getNombre());
        libreta.reponer(10);
        System.out.println("Después de reponer hay " + libreta.getStock()
                + " unidades de " + libreta.getNombre());


        if (libro.valorInventario() > libreta.valorInventario()) {
            System.out.println("\nEl libro tiene mayor valor en inventario");
        } else {
            System.out.println("\nLa libreta tiene mayor valor en inventario");
        }
    }

}
