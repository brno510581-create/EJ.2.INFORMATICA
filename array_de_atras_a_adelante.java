import java.util.*;

public class array_de_atras_a_adelante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int array[] = new int[5];

System.out.println("ingrese 5 numeros");
 //guardar los numeros 
for (int i = 0; i < array.length; i++) {        
    System.out.println("numero " + (i + 1));
    array[i] = sc.nextInt();
}
System.out.println("numeros guardados");

//numeros guardados al reves
for (int i = array.length - 1; i >= 0; i--) {
    System.out.println(array[i]);
}
      
        sc.close();

    }
}