package Tarea2UML;

import java.util.ArrayList;

public class biblioteca {

    // Atributos privados
    private String nombre;
    private ArrayList<libro> libros;

    // Constructor
    public biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Método agregarLibro
    public void agregarLibro(libro l) {
        libros.add(l);
    }

    // Método listarLibros
    public void listarLibros() {
        System.out.println(nombre);
        System.out.println("Lista de libros:");

        for (int i = 0; i < libros.size(); i++) {
            
            libros.get(i).mostrarInfo();
        }
    }

    // Método getCantidadLibros
    public int getCantidadLibros() {
        return libros.size();
    }
}