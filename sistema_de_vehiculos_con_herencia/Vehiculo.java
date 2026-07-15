package sistema_de_vehiculos_con_herencia;

// Clase madre
class Vehiculo {

    // Atributos
    String marca;
    String modelo;
    int anio;
    double kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    // Métodos  
    public void encender() {
        System.out.println("El vehoiculo está encendido.");
    }

    public void apagar() {
        System.out.println("El vehoiculo está apagado.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
    }
}