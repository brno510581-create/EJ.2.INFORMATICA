package sistema_de_vehiculos_con_herencia;


// Clase principal
public class Main {

    public static void main(String[] args) {

        // Crear objetos
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 35000, 4);
        Moto moto1 = new Moto("Yamaha", "MT-07", 2022, 12000, 700);

        // Metodos heredados
        auto1.encender();
        auto1.mostrarInfo();
        System.out.println("Puertas: " + auto1.puertas);
        auto1.apagar();

        System.out.println("  ");

        moto1.encender();
        moto1.mostrarInfo();
        System.out.println("Cilindrada: " + moto1.cilindrada + " cc");
        moto1.apagar();
    }
}