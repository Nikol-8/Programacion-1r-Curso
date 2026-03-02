package Ejercicio2;

public class CuentaBancaria {

    //Atributos
    private String Titular;
    private double saldo;

    //Constructor
    public CuentaBancaria(String titular, double salario) {
        Titular = titular;
        this.saldo = salario;
    }

    //Métodos
    public double ingresar (double cantidad){
        if (cantidad >= 0) {
            saldo += cantidad;
        }
        return cantidad;
    }

    public double retirar(double cantidad){
        if (cantidad >= 0 && saldo >= cantidad) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public boolean tieneDinero() {
        return saldo >= 0;
    }

    public String toString() {
        return "Titular: " + Titular + ", Saldo: " + saldo;
    }

}

