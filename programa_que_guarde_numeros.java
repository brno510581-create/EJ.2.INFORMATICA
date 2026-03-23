import java.util.*;

public class programa_que_guarde_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // decalramos array
        int array[] = new int[5];

        System.out.println("ingrese 5 numeros");
        int suma = 0;

        //for para guardar y sumar
        for (int i = 0; i < array.length; i++) {
            System.out.println("numero " + (i + 1));
            array[i] = sc.nextInt();
            suma = suma + array[i];
        }

        //salida de datos
        System.out.println("la suma de los numeros es: " + suma);
        sc.close();
    }

}
