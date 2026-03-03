package E5;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        int opcion = 0;
        do {
            System.out.println("1. Crear Coche");
            System.out.println("2. Crear Moto");
            System.out.println("3. Listar Vehículos");
            System.out.println("4. Mostrar cuál consume más");
            System.out.println("5. Salir");

            System.out.print("Elije una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Kilómetros: ");
                    double kilometros = sc.nextDouble();
                    sc.nextLine();


                    System.out.println("Consumo por KM: ");
                    double consumoPorKm = sc.nextDouble();
                    sc.nextLine();

                    Vehiculo coche = new Coche(marca, modelo, kilometros, consumoPorKm);
                    vehiculos.add(coche);
                    System.out.println("Coche añadido.");
                    break;

                case 2:
                    System.out.println("Marca: ");
                    String marca2 = sc.nextLine();

                    System.out.println("Modelo: ");
                    String modelo2 = sc.nextLine();

                    System.out.println("Kilómetros: ");
                    double kilometros2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("CC: ");
                    int cc = sc.nextInt();
                    sc.nextLine();

                    Vehiculo moto = new Moto(marca2, modelo2, kilometros2, cc);
                    vehiculos.add(moto);
                    System.out.println("Moto añadida.");
                    break;

                case 3:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos en la lista.");
                        break;
                    }

                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo.mostrarInfo());
                    }
                    break;

                case 4:
                        if (vehiculos.isEmpty()) {
                            System.out.println("No hay Vehículos :(...");
                            break;
                        }
                            Vehiculo mayor = vehiculos.get(0);

                        for (Vehiculo v : vehiculos) {
                            if (v.calcularConsumo() > mayor.calcularConsumo()) {
                                mayor = v;
                            }
                        }

                        System.out.println("El vehículo que más consume es: " + mayor.mostrarInfo());
                        break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
        sc.close();
    }
}
