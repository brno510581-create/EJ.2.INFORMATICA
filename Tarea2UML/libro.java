package Tarea2UML;

public class libro {

    // Atributos privados
    private String titulo;
    private String autor;

    // Constructor
    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " Autor: " + autor);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}