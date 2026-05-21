package Poo_ej_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Datos de la persona:");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        // mayor de edad
        if (edad >= 18) {

        } else {
            System.out.println("No es mayor de edad");
            return; // Salir del programa si no es mayor de edad
        }

        System.out.print("Documento: ");
        String documento = sc.nextLine();
        System.out.println(" ");

        Persona p = new Persona(nombre, edad, documento);
        p.mostrarInfo();
        System.out.println(" ");

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Cuenta cuenta = new Cuenta(p, saldo);

        // mostrar información de la cuenta
        cuenta.mostrarInfo();

        // ingresa y retira dinero

        System.out.print("Ingrese dinero a depositar: ");
        double ingreso = sc.nextDouble();
        cuenta.ingresar(ingreso);
        System.out.println(" ");

        System.out.print("Ingrese dinero a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);
        System.out.println(" ");

        // resultado final
        cuenta.mostrarInfo();

        sc.close();
    }
}
