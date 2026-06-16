package CondicionalesYBucles;
import java.util.*;

public class año_bisietos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            int anio;

            System.out.println("Ingresa un año:");
            anio = sc.nextInt();

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año si es bisiesto");
            } else {
                System.out.println("El año no es bisiesto");
            }
            System.out.println("¿Quieres probar otro año?");
            respuesta = sc.next();
        } while (respuesta.equals("si"));

        sc.close();
    }
}