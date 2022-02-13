package PackEjercicio12;

import java.io.IOException;
import java.util.Scanner;

public class CompareWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String word1 = input.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String word2 = input.nextLine();
        boolean largo = true;
        if(word1.equals(word2))
            System.out.println("Las palabras son iguales.");
        else {
            for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
                try {
                    char charWord1 = word1.charAt(i);
                    char charWord2 = word2.charAt(i);
                    if (charWord1 != charWord2)
                        System.out.println("Los caracteres son diferentes en la posición " + (i + 1) + ". ("+charWord1+" distinto de "+charWord2+").");
                } catch (Exception e) {
                    largo = false;
                }
            }
            if(largo == false)
                System.out.println("Las palabras no tienen el mismo largo.");
            System.out.println("Las palabras son diferentes.");
        }
    }
}
