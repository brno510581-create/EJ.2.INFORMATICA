package Repaso_escrito;

// Clase Circulo que hereda de Figura
class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribir el método calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
