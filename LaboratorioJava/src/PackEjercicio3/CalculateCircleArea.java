package PackEjercicio3;

import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();
        double area = Double.parseDouble(String.valueOf(Math.PI * (Math.pow(radio, 2))));
        System.out.println("El área del círculo con radio "+radio+" es: "+area+" centímetros cuadrados.");
    }
}
