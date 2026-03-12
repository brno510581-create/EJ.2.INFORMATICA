import java.util.*;
public class celsius_a_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + f);

        sc.close();
    }
}
 