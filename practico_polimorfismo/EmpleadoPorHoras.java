package practico_polimorfismo;

public class EmpleadoPorHoras extends Empleado {

    // Variables para EmpleadoPorHoras
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructor para EmpleadoPorHoras
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    // Método para calcular salario de EmpleadoPorHoras
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}