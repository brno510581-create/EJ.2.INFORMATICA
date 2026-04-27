package Poo_ej_1;

public class Cuenta {
    private Persona titular;
    private double cantidad;

    // Constructor vacío
    public Cuenta() {
        this.titular = new Persona();
        this.cantidad = 0;
    }

    // Constructor con parametros
    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // get y set para cada atributo
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    // mostrar información de una cuenta
    public void mostrarInfo() {
        System.out.println("Titular: " + this.titular.getNombre());
        System.out.println("Cantidad: " + this.cantidad);
    }

    // ingresar dinero a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se ha ingresado " + cantidad + " a la cuenta");
        } else {
            System.out.println("No se puede ingresar un monto negativo");
        }
    }

    // retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de la cuenta");
        } else {
            System.out.println("No se puede retirar un monto mayor al que tiene la cuenta");
        }
    }

}
