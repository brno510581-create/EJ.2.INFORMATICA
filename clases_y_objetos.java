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
        System.out.println("--------------------------");
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

// Clase principal
public class clases_y_objetos {
    public static void main(String[] args) {

        // Crear objetos
        Habitacion hab1 = new Habitacion();
        Habitacion hab2 = new Habitacion();

        // Usar metodos con la primera habitación
        hab1.Nombre("Living");
        hab1.Temperatura(22);
        hab1.aumentarTemperatura(3);
        hab1.Info();

        // Usar metodos con la segunda habitación
        hab2.Nombre("Dormitorio");
        hab2.Temperatura(18);
        hab2.disminuirTemperatura(2);
        hab2.Info();
    }
}