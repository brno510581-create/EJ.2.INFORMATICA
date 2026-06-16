package Calculos;
import java.util.*;

public class pedir_dos_num_y_sumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

System.out.println("cuantos numeros quieres sumar?");

int a,b;

 System.out.println("ingresa el primer numero");
 a=sc.nextInt();
 System.out.println("ingresa el segundo numero");
 b=sc.nextInt();

System.out.println("la suma es"+(a+b));

    
        
        sc.close();
    }
}