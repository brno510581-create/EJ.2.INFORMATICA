package Repaso_escrito;


public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Circulo con radio 5
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(3, 4, 5);

        // Invocar calcularArea() y mostrar resultado
        double area = c.calcularArea();
        System.out.println("El área del círculo es: " + area);

        area = t.calcularArea();
        System.out.println("El área del triángulo es: " + area);
    }

}