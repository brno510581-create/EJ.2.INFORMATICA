import java.util.*;

public class mostrar_numeros_primos_entre_ayb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("ingrese primero el numero ");
        a = sc.nextInt();

        System.out.println("ingrese segundo el numero ");
        b = sc.nextInt();

        System.out.println("numeros primos entre " + a + " y " + b);

        for (int i = a; i <= b; i++) {

            boolean Primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    Primo = false;
                    break;
                }
            }

            if (Primo && i > 1) {
                System.out.println(i);
            }

        }

        sc.close();
    }
}