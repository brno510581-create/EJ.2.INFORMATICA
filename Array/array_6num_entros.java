import java.util.*;

public class array_6num_entros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Ingrese la cantidad de numeros");
        int numero = entrada.nextInt();

        // pedir 5 numeros
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese numero ");
            int a = entrada.nextInt();
            lista.add(a);
        }

        // Sumando numeros
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        // mostrar numeros
        System.out.println("Los numeros son: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Mostrar suma
        System.out.println("La suma es: " + suma);
    }
}