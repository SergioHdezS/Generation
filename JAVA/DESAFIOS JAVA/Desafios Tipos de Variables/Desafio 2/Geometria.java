import java.io.Console;

public class Geometria {
    public static void main(String[] args) {
        Console console = System.console();
        // Pedir al usuario que ingrese diametro
        String diametro = console.readLine("Ingrese diametro: ");
        Double radio = Double.parseDouble(diametro)/2;
        // Perimetro
        // Double perimetro = 3.14*2*radio;
        Double perimetro = (Math.PI)*2*radio;
        // Area
        // Double area = 3.14 * radio * radio
        Double area = Math.pow(radio,2) * Math.PI;
        // imprimir en consola
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("El perímetro del círculo es: "+perimetro);
        System.out.println("El área del círculo es: "+area);
    }
}
