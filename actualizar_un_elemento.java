import java.util.*;

public class actualizar_un_elemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colores = new ArrayList<String>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("naranja");

        colores.set(4, "azul");

        System.out.println(colores);

        sc.close();
    }
}