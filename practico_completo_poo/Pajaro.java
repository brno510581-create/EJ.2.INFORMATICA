package practico_completo_poo;
public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad, String sonido) {
        super(nombre, edad, sonido);
    }

    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}