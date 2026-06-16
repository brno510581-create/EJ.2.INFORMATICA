package ArrayList;
import java.util.*;

public class lista_colores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("naranja");
        colores.add("amarillo");

        System.out.println("colores" + colores);

     
        sc.close();
    }
}