package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria ("Dante Sparda", 100);

        System.out.println(c1);

        c1.ingresar(50);

        System.out.println(c1);

        c1.retirar(30);

        System.out.println(c1);

        System.out.println(c1.tieneDinero());

    }
}
