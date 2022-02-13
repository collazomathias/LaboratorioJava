package PackEjercicio8;

import java.util.Scanner;

public class WorkingDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana: ");
        String day = input.nextLine();
        switch(day.toLowerCase()){
            case "domingo":
                System.out.println("El día "+day+" es un día no laboral.");
                break;
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
            case "sábado":
                System.out.println("El día "+day+" es un día laboral.");
                break;
        }
    }
}
