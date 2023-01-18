import java.io.Console;

/* Escriba una función que, dada una temperatura en grados Celsius, la devuelva en grados
Fahrenheit. Use su función en un programa que lea una cantidad indeterminada de
temperaturas en Celsius (que termina cuando se ingresa el valor -999) e imprima en pantalla el
valor correspondiente en Fahrenheit. */
public class GuiaFunciones3 {
    static Float CelsiusAFarenheit (float grados){
        float farenheit = (grados*1.8f)+32;
        return farenheit;
    }

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println(":::::...MENU...:::::");
        while (true) {
            float grado = Float.parseFloat(console.readLine("Ingrese la temperatura en grados Celsius: \n"));
            if (grado == -999){
                System.out.println("Finalizado");
                break;
            }
            System.out.println("La temperatura en grados farenheit es de: "+CelsiusAFarenheit(grado));
        } 
    }
}
