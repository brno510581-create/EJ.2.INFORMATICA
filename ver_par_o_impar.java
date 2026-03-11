import java.util.*;

public class ver_par_o_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {

            int num;
            System.out.println("Ingrese un numero: ");

            if (sc.hasNextInt()) {
                num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println(num + " es par");
                } else {
                    System.out.println(num + " es impar");
                }
            }

            System.out.println("queres probar otro numero?");
            respuesta = sc.next();

        } while (respuesta.equals("si"));

        sc.close();
    }
}
