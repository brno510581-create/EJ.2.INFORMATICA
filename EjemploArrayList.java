import java.util.ArrayList;

public class EjemploArrayList {
public static void main(String[] args) {
ArrayList<String> listaFrutas = new ArrayList<>();

listaFrutas.add("Manzana");
listaFrutas.add("Banana");
listaFrutas.add("Naranja");
listaFrutas.add("Pera");
listaFrutas.add("Uva");

listaFrutas.get(3);

System.out.println("Tamaño: " + listaFrutas.size());

listaFrutas.remove("Banana");

listaFrutas.remove("Uva");

for (String f : listaFrutas) {
System.out.println(f);
}
System.out.println(" ");
for (String f : listaFrutas) {
System.out.println(f);
}

}
}