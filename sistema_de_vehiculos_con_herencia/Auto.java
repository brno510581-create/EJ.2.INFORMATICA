package sistema_de_vehiculos_con_herencia;


// Clase hija Auto
class Auto extends Vehiculo {

    // Atributo 
    int puertas;

    // Constructor
    public Auto(String marca, String modelo, int anio, double kilometraje, int puertas) {
        super(marca, modelo, anio, kilometraje);
        this.puertas = puertas;
    }
}