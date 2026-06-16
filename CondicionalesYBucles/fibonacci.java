package CondicionalesYBucles;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num; 
        int a =0;
        int b =1;


System.out.println("cuantos numeros quieres calcular?");
num=sc.nextInt();

System.out.println("los numeros son:");

for (int i = 0; i < num; i++) {
    System.out.println(a);
    int temp = a + b;
    a = b;
    b = temp;
}

        sc.close();
    }
}