package PackEjercicio10;

import java.util.Scanner;

public class RemoveBlanks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String sentence = input.nextLine();
        String newSentence = sentence.replaceAll("\\s+", "");
        System.out.println("La nueva frase es: "+newSentence);
    }
}
