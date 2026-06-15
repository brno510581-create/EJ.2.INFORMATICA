package practico_polimorfismo;

public class EmpleadoFijo extends Empleado {

    // Variable para EmpleadoFijo
    private double salarioFijo;

    // Constructor para EmpleadoFijo
    public EmpleadoFijo(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    // Método para calcular salario de EmpleadoFijo
    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
}