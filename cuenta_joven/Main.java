package cuenta_joven;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Bruno", 23, "12345678");
        Cuenta cuenta = new CuentaJoven(p1, 1000, 10);

        cuenta.mostrar();

        System.out.println("Retiro ");
        cuenta.retirar(200); // 

        cuenta.mostrar();

        System.out.println("      ");

        Persona p2 = new Persona("Juan", 17, "99999999");
        Cuenta cuenta2 = new CuentaJoven(p2, 1000, 10);

        cuenta2.mostrar();

        System.out.println("Retiro ");
        cuenta2.retirar(200);
    }
}