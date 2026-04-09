import java.util.*;
public class ListaAnimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> animales = new ArrayList<String>();

        animales.add("gato");
        animales.add("perro");
        animales.add("raton");
        animales.add("elefante");
        animales.add("lobo");

        System.out.println("Tamaño: " + animales.size());

        animales.get(0); 

        for (String f : animales) {
System.out.println(f);
}
        sc.close();
    }
}   