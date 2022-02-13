package PackEjercicio7;

import java.util.Scanner;

public class NumberGreaterThanCero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        do{
            System.out.println("Ingrese un número: ");
            num = input.nextDouble();
        }while(num < 0);
        System.out.println("El número "+num+" es mayor o igual a 0.");
    }
}
