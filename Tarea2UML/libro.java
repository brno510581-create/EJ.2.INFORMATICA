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

    // Metodo mostrarInfo
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + " Autor: " + autor);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}