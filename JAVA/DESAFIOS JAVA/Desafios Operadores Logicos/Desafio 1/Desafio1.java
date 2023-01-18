import java.io.Console;

public class Desafio1 {
    public static void main(String[] args) {
        Console console = System.console();
        /*
        Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa devuelva una 
        nota basada en las siguientes condiciones:
        Suspendió si obtuvo una nota igual o inferior a 3.
        Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
        Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
        Excelente si consiguió un 10
        Debe avisar si se ingresa un número fuera del rango (0 a 10)
        */
    // pedir ingresa la nota y establecerla como float
    float nota = Float.parseFloat(console.readLine("Ingrese la nota: ")); 
    //int nota = Integer.parseInt(console.readLine("Ingresa la nota: "));
    // condicion de nota menor o igual a 3
    if (nota <= 3 && nota >= 0){
        System.out.println("Suspendido");
    // condicion nota mayor a 3 y menor o igual a 5
    } else if ( nota > 3 && nota <= 5){
        System.out.println("Insuficiente");
    // condicion nota mayor a 5 y menor o igual 8 
    } else if ( nota > 5 && nota <= 8){
        System.out.println("Bueno");
    // condicion nota mayor a 8 y menor o igual a 10
    } else if (nota > 8 && nota <= 10){
        System.out.println("Excelente");
    // condicion que informa error al salir del rango permitido
    } else {
        System.out.println("Nota fuera del rango, vuevla a ingresar.");
    }  
    }
}
