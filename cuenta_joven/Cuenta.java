package cuenta_joven;

public class Cuenta {

    private Persona titular;
    private double cantidad;

    // Constructor
    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Getter titular
    public Persona getTitular() {
        return titular;
    }
// retirar dinero
    public void retirar(double cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    // Mostrar
    public void mostrar() {
        System.out.println("Titular:");
        titular.mostrarInfo();
        System.out.println("Saldo: " + cantidad);
    }
}