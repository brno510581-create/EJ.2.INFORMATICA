package CondicionalesYBucles;
import java.util.*;

public class mayor_menor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        int adivina = (int) (Math.random() * 100) + 1;

        do {

            
            if (num < adivina) {
                System.out.println("es mayor");
            } else if (num > adivina) {
                System.out.println("es menor");
            }
           

            System.out.println("ingrese otro numero");
            num = sc.nextInt();

        } while (num != adivina);

        System.out.println("Adivinaste el número");

        sc.close();

    }

}
