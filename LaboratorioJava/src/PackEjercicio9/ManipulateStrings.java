package PackEjercicio9;

import java.util.Scanner;

public class ManipulateStrings {
    public static void main(String[] args) {
        String cad = "La sonrisa sera la mejor arma contra la tristeza";
        String newCad = cad.replace('a', 'e');
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase (opcional): ");
        String cad2 = input.nextLine();
        newCad = newCad + " " + cad2;
        System.out.println("La nueva cadena es: "+newCad);
    }
}
