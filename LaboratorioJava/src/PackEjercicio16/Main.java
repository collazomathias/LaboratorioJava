package PackEjercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = input.nextInt();
        System.out.println("Ingrese el sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        double peso = input.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = input.nextDouble();

        Persona per1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona per2 = new Persona(nombre, edad, sexo);

        Persona per3 = new Persona();
        per3.setNombre(nombre);
        per3.setEdad(edad);
        per3.setSexo(sexo);
        per3.setPeso(peso);
        per3.setAltura(altura);

        System.out.println("Persona 1:");
        switch(per1.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per1.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per1);

        System.out.println("Persona 2:");
        switch(per2.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per2.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per2);

        System.out.println("Persona 3:");
        switch(per3.calcularIMC()){
            case -1:
                System.out.println("La persona está en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona está por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }

        if(per3.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per3);
    }
}
