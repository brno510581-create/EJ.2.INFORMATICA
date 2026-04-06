import java.util.*;

public class arraylist_recuperar_elemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colores = new ArrayList<String>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("naranja");

        String elemento = colores.get(1);

        System.out.println(elemento);

        sc.close();
    }
}