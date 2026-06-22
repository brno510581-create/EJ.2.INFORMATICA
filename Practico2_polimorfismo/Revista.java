package Practico2_polimorfismo;

public class Revista extends Publicacion {

    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("REVISTA");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Edicion: " + numeroEdicion);
        System.out.println("   ");
    }
}