import java.io.Console;

public class Main {
    public static void main (String[] args) {
        // para mostrar consola en javascript era console.log();
        //para mostrar en consola en Java 
        System.out.print("Este es un mensaje en consola");
        // imprime con salto de linea
        System.out.println("Este es un mensaje en consola");
        // Para pedirle informacion al usuario de ocupa
        Console console = System.console();
        //Variable
        //Tipos de variables en Javascript -> boolean, number, string, array, object
        // var nombre = 1
        //Tipos de variables en Java -> boolean, numeros = int(entero), double(16 digitos despues de la coma) y float (7 digitos despues de la coma)
        //String (cadena de texto se ocupa comilla doble), char(1 caracter, se ocupa '')
        //array y object
        //Como se declaran las variables-> int numero = 1;
        // String palabra = "pala";
        //matriz(arrays) ->[1,'a',2, "hola",3,4]; 
        // arreglos -> [1,2,5,4]; arreglo[2] == 2
        //diccionarios -> [{id:1, nombre:"Nicolas"}, {id:2, nombre:"Kiara"}]
        // diccionario[0] -> {id:1, nombre:"Nicolas"} diccionario[1] -> {id:2, nombre:"Kiara"}
        //diccionario[0].nombre -> "Nicolas", diccionario[1].id -> 2
        String nombre = console.readLine("inserte nombre: ");
        System.out.println("este es el nombre: "+nombre);
        // vamos a pedir al ususario 2 numeros
        String num = console.readLine("inserte numero 1: ");
        int nuevoNum = Integer.parseInt(num);
        String num2  = console.readLine("inserte numero 2: ");
        int nuevoNum2 = Integer.parseInt(num2);
        int suma = nuevoNum + nuevoNum2;
        // optimizacion de codigo int suma = Integer.parseInt(num) + Integer.parseInt(num2);
        System.out.println("el numero es: "+suma);

    }
}