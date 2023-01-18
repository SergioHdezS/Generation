import java.io.Console;
import java.util.ArrayList;

public class MovieDiscounts {
    public static void main(String[] args) {
        Console console = System.console();
        //Descuento segun edad
        //Precio del ticket 7 euros
        // 60% dcto para menores de 5 
        // 55% decto para mayores de 60
        System.out.println("::::...MENU...::::");
        System.out.println("******************************************");
        System.out.println("Precio entradas 7 euros.");
        System.out.println("60% de descuento para menores de 5 anios.");
        System.out.println("55% de descuento para mayores de 60 anios.");
        System.out.println("******************************************");
        int entradas = Integer.parseInt(console.readLine("Ingrese la cantidad de entradas que quiere comprar: "));
        float precioFinal = 0.0f;
        float precioNormal = 7.0f;
        float sumaEntradas = 0.0f;
        ArrayList<Float> precios = new ArrayList<>();

        for (int i=1; i<=entradas; i++){
            int edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
            if (edad<5){
                precioFinal = (float)(precioNormal*0.40);
                System.out.println("El precio de la entrada es: "+precioFinal+" euros");
            } else if (edad>60){
                precioFinal = (float)(precioNormal*0.45);
                System.out.println("El precio de la entrada es: "+precioFinal+" euros");
            } else{
                precioFinal = precioNormal;
                System.out.println("El precio de la entrada es: "+precioFinal+" euros");
            }
            sumaEntradas = sumaEntradas + precioFinal;
            precios.add(precioFinal);
        }
        System.out.println("El total a pagar es: "+sumaEntradas+" euros");
        System.out.println("Precios: "+ precios);
    }
}
