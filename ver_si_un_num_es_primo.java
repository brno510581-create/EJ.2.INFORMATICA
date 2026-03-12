 import java.util.*;


public class ver_si_un_num_es_primo {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
String respuesta;

do{

    int num;
    boolean primo=true;

    System.out.println("ingresa un numero");
    num=sc.nextInt();

   
    
    for(int i=2;i<num;i++){
        if(num%i==0){
            primo=false;
            break;
        }
    }
    if(primo){
        System.out.println("es primo");
    }
    else{
        System.out.println("no es primo");
    }


System.out.println("quieres probar otro numero?");
respuesta=sc.next();


}while(respuesta.equals("si"));


    sc.close();

}
}
