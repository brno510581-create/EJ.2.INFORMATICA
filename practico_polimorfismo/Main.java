package practico_polimorfismo;

import java.util.ArrayList;

public class Main {

    // Método principal para ejecutar el programa
    public static void main(String[] args) {

        // Crear una lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregar empleados a la lista
        empleados.add(new EmpleadoFijo("Juan", 35000));
        empleados.add(new EmpleadoFijo("Ana", 42000));
        empleados.add(new EmpleadoPorHoras("Pedro", 80, 300));
        empleados.add(new EmpleadoPorHoras("Lucia", 100, 250));

        // Calcular y mostrar el salario de cada empleado, así como el total de salarios
        double totalSalarios = 0;

        // Recorrer la lista de empleados y calcular el salario de cada uno
        for (Empleado e : empleados) {
            double salario = e.calcularSalario();

            System.out.println(
                    e.getNombre() + " cobra $" + salario);

            totalSalarios += salario;
        }

        // Mostrar el total de salarios
        System.out.println("\nTotal de salarios: $" + totalSalarios);
    }
}