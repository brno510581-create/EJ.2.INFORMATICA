
// Clase principal

public class Main {
    public static void main(String[] args) {
        
        // Crear objetos
        Habitacion hab1 = new Habitacion();
        Habitacion hab2 = new Habitacion();

        // Usar metodos con la primera habitación
        hab1.Nombre("sala");
        hab1.Temperatura(16);
        hab1.aumentarTemperatura(2.5);
        hab1.Info();

        // Usar metodos con la segunda habitación
        hab2.Nombre("Dormitorio");
        hab2.Temperatura(26);
        hab2.disminuirTemperatura(1.5);
        hab2.Info();
    }
}