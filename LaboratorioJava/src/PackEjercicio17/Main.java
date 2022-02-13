package PackEjercicio17;

public class Main {
    public static void main(String[] args) {
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(100, 50);
        Lavadora lav3 = new Lavadora(80);
        Television tv1 = new Television();
        Television tv2 = new Television(200, 25);
        Television tv3 = new Television(55, true);
        Television tv4 = new Television(43, false);
        Electrodomesticos batidora = new Electrodomesticos();
        Electrodomesticos licuadora = new Electrodomesticos(100, 1);
        Electrodomesticos cafetera = new Electrodomesticos(60, "Negro", 'C', 1.5);

        Electrodomesticos[] productos = {lav1, lav2, lav3, tv1, tv2, tv3, tv4, batidora, licuadora, cafetera};
        double precioTotalLavadora = 0;
        double precioTotalTelevision = 0;
        double precioTotalElectrodomesticos = 0;
        double precio;
        for (Electrodomesticos producto : productos) {
            if(producto.getClass() == Lavadora.class){
                precio = ((Lavadora) producto).precioFinal(((Lavadora) producto).getCarga());
                precioTotalLavadora += precio;
                precioTotalElectrodomesticos += precio;
                System.out.println("Soy una lavadora y mi precio final es de: "+precio+"€.");
            } else if(producto.getClass() == Television.class){
                precio = ((Television) producto).precioFinal(((Television) producto).resolucion, ((Television) producto).sintonizadorTDT);
                precioTotalTelevision += precio;
                precioTotalElectrodomesticos += precio;
                System.out.println("Soy una televisión y mi precio final es de: "+precio+"€.");
            } else if(producto.getClass() == Electrodomesticos.class){
                precio = producto.precioFinal(producto.precioBase, producto.consumoEnergetico, producto.peso);
                precioTotalElectrodomesticos += precio;
                System.out.println("Soy un electrodoméstico y mi precio final es de: "+precio+"€.");
            }
        }
        System.out.println("\nEl precio total de televisiones es: "+precioTotalTelevision+"€.");
        System.out.println("El precio total de lavadoras es: "+precioTotalLavadora+"€.");
        System.out.println("El precio total de electrodomésticos (incluye televisiones y lavadoras) es: "+precioTotalElectrodomesticos+"€.");
    }
}
