package PackEjercicio1;

public class CompareNumbers {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 10.5;
        if(num1 > num2)
            System.out.println("El número "+num1+" es mayor que el número "+num2+".");
        else if(num1 < num2)
            System.out.println("El número "+num2+" es mayor que el número "+num1+".");
        else
            System.out.println("Los números ingresados son iguales.");
    }
}
