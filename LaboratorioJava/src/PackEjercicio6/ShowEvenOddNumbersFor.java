package PackEjercicio6;

public class ShowEvenOddNumbersFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if((i % 2) == 0)
                System.out.println("El número "+i+" es par.");
            else
                System.out.println("El número "+i+" es impar.");
        }
    }
}
