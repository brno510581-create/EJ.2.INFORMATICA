package Tarea2UML;

public class Main {

    public static void main(String[] args) {

        // Crear libros
        libro libro1 = new libro("Don Quijote", "Miguel de Cervantes");
        libro libro2 = new libro("1984", "George Orwell");
        libro libro3 = new libro("El Principito", "Antoine de Saint-Exupéry");

        // Crear biblioteca
        biblioteca biblioteca = new biblioteca("Biblioteca Central");

        // Agregar libros
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Listar libros
        biblioteca.listarLibros();

        // Mostrar cantidad total
        System.out.println("Cantidad total de libros: " + biblioteca.getCantidadLibros());
    }
}