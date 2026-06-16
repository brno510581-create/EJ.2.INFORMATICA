package CondicionalesYBucles;
import java.util.*;

public class numero_de_dias_mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

     do{
            int dias;
            int mes;
            int anio;
            System.out.println("Ingresa un mes del 1 al 12");
            mes = sc.nextInt();

            System.out.println("Ingresa un año");
            anio = sc.nextInt();

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;
                case 2:
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                default:
                    System.out.println("Mes no valido");
                    return;
            }
            System.out.println(" ");
            System.out.println("El numero de dias en " + anio + " del mes " + mes + " es " + dias);

            System.out.println(" ");

            System.out.println("quieres saber otro mes? ");
            respuesta = sc.next();
         }while(respuesta.equals("si"));

           
        sc.close();
    }
}