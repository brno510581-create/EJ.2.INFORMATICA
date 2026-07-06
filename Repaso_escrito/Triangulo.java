package Repaso_escrito;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (lado1 * lado2 * lado3) / 2;
    }
}


    

