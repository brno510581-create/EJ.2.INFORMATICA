import java.util.*;

public class calculadora_dos_numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer  numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("quieres sumar, restar, multiplicar o dividir? ");
        String operacion = sc.next();

        switch (operacion) {
            case "sumar":
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case "restar":
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case "multiplicar":
                System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                break;
            case "dividir":
                System.out.println("El resultado de la división es: " + (num1 / num2));
                break;
            default:
                System.out.println("Opción no valida");
                break;

        }

        sc.close();

    }
}