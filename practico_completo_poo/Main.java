package practico_completo_poo;
public class Main {


    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", 4, "Guau");
        Gato gato = new Gato("Michi", 2, "Miau");
        Pajaro pajaro = new Pajaro("Piolin", 1, "Pio");

        System.out.println("PERRO");
        perro.mostrarInfo();
        perro.emitirSonido();
        perro.correr();
        System.out.println("Nivel de energía: " + perro.nivelEnergia(5));
        System.out.println( "");

        System.out.println("GATO");
        gato.mostrarInfo();
        gato.emitirSonido();
        gato.maullarFuerte();
        System.out.println("Nivel de energía: " + gato.nivelEnergia(3));
        System.out.println(" ");

        System.out.println("PAJARO");
        pajaro.mostrarInfo();
        pajaro.emitirSonido();
        pajaro.volar();
        System.out.println("Nivel de energía: " + pajaro.nivelEnergia(7));
    }
}