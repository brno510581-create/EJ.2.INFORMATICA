package Practico2_polimorfismo;

public class Libro extends Publicacion {

    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("LIBRO");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println("  ");
    }
}