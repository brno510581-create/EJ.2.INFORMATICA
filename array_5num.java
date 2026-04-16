import java.util.*;

public class array_5num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("ingrese 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println( " ");
        
        System.out.println("los numeros son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
    }
}