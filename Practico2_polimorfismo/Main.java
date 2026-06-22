package Practico2_polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Publicacion> biblioteca = new ArrayList<>();

        biblioteca.add(new Libro("El libro de la vida", "Juan Perez", 100));
        biblioteca.add(new Revista("La revista de la vida", "Juan Perez", 10));
        biblioteca.add(new Libro("El libro de la vida", "Juan Perez", 100));
        biblioteca.add(new Libro("El libro de la vida", "Juan Perez", 100));

        for (Publicacion p : biblioteca) {
            p.mostrarInformacion();
        }

        System.out.println("Total de publicaciones: " + biblioteca.size());
    }
}