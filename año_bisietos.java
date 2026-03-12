import java.util.*;

public class año_bisietos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
String respuesta;

do {
        int año;

        System.out.println("Ingresa un año:");
        año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
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