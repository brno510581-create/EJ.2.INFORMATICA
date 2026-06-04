    package sistema_de_vehiculos_con_herencia;


    // Clase hija Moto
    class Moto extends Vehiculo {

        // Atributo 
        int cilindrada;

        // Constructor
        public Moto(String marca, String modelo, int anio, double kilometraje, int cilindrada) {
            super(marca, modelo, anio, kilometraje);
            this.cilindrada = cilindrada;
        }
    }