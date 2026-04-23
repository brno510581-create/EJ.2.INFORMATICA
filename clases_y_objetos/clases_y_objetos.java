
class Habitacion {
    String nombreHabitacion;
    double temperaturaActual;

    // Metodo para asignar nombre
    void Nombre(String nombre) {
        nombreHabitacion = nombre;
    }

    // Metodo para asignar temperatura
    void Temperatura(double temperatura) {
        temperaturaActual = temperatura;
    }

    // Metodo para mostrar información
    void Info() {
        System.out.println("Habitación: " + nombreHabitacion);
        System.out.println("Temperatura: " + temperaturaActual + "°C");
        System.out.println("  ");
    }

    // Metodo para aumentar temperatura
    void aumentarTemperatura(double valor) {
        temperaturaActual += valor;
    }

    // Metodo para disminuir temperatura
    void disminuirTemperatura(double valor) {
        temperaturaActual -= valor;
    }
}

