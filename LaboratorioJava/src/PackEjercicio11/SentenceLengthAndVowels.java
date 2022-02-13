package PackEjercicio11;

import java.util.Scanner;

public class SentenceLengthAndVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String cad = input.nextLine();
        int cont = 0;
        for(int i = 0; i < cad.length(); i++){
            char character = cad.charAt(i);
            switch(character){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("La frase '"+cad+"' tiene una longitud de "+cad.length()+" caracteres.");
        System.out.println("La frase '"+cad+"' tiene "+cont+" letras vocales.");
    }
}
