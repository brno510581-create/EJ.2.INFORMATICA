package Poo_ej_1;

public class Persona {
    private String nombre;
    private int edad;
    private String documento;

    // constructor vacio
    public Persona() {
        nombre = "";
        edad = 0;
        documento = "";
    }

    // constructor con parametros
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // set y get para cada atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    // mostrar informacion de una persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Documento: " + this.documento);
    }

   
    }
