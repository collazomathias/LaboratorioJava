package PackEjercicio4;

import java.util.Scanner;

public class CalculatePriceWithIVA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = input.nextDouble();
        double precioIVA = precio * 0.21;
        System.out.println("El precio con IVA es: "+(precio + precioIVA)+".");
    }
}
