import java.util.Scanner;

public class tabla_multiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el numero para mostrar su tabla de multiplicar: ");
        int valor = sc.nextInt();

        int v = 1;
        while (v <= 10) {
            System.out.println(valor + " x " + v + " = " + (valor * v));

            v++;

            sc.close();

        }

    }
}