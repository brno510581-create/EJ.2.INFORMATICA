package cuenta_joven;

public class CuentaJoven extends Cuenta {

    private double bonificacion;

    public CuentaJoven(Persona titular, double cantidad, double bonificacion) {
        super(titular, cantidad);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido() {
        int edad = getTitular().getEdad();
        return edad >= 18 && edad < 25;
    }

    public void retirar(double cantidad) {
        if (esTitularValido()) {

            double descuento = cantidad - (cantidad * bonificacion / 100);

            System.out.println("Retira: " + cantidad);

            super.retirar(descuento);

        } else {
            System.out.println("No puede retirar dinero");
        }
    }

    public void mostrar() {
        System.out.println("Cuenta Joven");
        System.out.println("Bonificación: " + bonificacion + "%");
        super.mostrar();
    }
}