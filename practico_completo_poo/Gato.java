package practico_completo_poo;
public class Gato extends Animal {

    public Gato(String nombre, int edad, String sonido) {
        super(nombre, edad, sonido);
    }

    public void maullarFuerte() {
        System.out.println(getNombre() + " está maullando fuerte.");
    }
}