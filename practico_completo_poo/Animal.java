package practico_completo_poo;
public class Animal {

    private String nombre;
    private int edad;
    private String sonido;

    // Constructor
public Animal(String nombre, int edad, String sonido) {
    this.nombre = nombre;
    this.edad = edad;
    this.sonido = sonido;
}
    

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    // Métodos
    public void emitirSonido() {
        System.out.println("Sonido: " + sonido);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sonido: " + sonido);
    }

  public String nivelEnergia(int vecesActividad) {

    int energia = 100 - (edad * 5) - (vecesActividad * 3);

    if (energia >= 70) {
        return "Alta";
    } else if (energia >= 40) {
        return "Media";
    } else {
        return "Baja";
    }
}
    }
