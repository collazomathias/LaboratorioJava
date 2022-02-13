package PackEjercicio14;

import java.util.Scanner;

public class PrintNumbersTwoByTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int number = input.nextInt();
        if(number <= 1000){
            for(int i = number; i <= 1000; i += 2)
                System.out.println(i);
        } else
            System.out.println("El número ingresado es mayor que 1000.");
    }
}
