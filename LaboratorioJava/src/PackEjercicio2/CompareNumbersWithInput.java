package PackEjercicio2;
import java.util.Scanner;

public class CompareNumbersWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        if(num1 > num2)
            System.out.println("El número "+num1+" es mayor que el número "+num2+".");
        else if(num1 < num2)
            System.out.println("El número "+num2+" es mayor que el número "+num1+".");
        else
            System.out.println("Los números ingresados son iguales.");
    }
}
