import java.util.Scanner;

public class factorial_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		
		System.out.println("El factorial de " + num + " es " + fact);
		
		sc.close();
    }
}
