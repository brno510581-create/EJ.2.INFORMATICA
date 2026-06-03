package practico_completo_poo;
public class Perro extends Animal {

    public Perro(String nombre, int edad, String sonido) {
        super(nombre, edad, sonido);
    }

    public void correr() {
        System.out.println(getNombre() + " esta corriendo.");
    }
}