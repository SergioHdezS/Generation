import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class NotasAlumnos {
    public static void main(String[] args) {
        Console console = System.console();
        Map<String, ArrayList> notasAlumno = new HashMap<>(); // crea hashmap con llave string que va a ser el nombre del alumno y valor un arraylist con las notas de cada alumno
        System.out.println(":::::..Bienvenido/a..:::::");
         // pedir ingresar cantidad de alumnos
        int cantidadAlumnos = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos/as a ingresar: ")); // pide ingresar cantidad de alumnos
        while (cantidadAlumnos != 0){ // bucle que opera segun la cantidad de alumnos
            String nombreAlumno = console.readLine("Ingrese el nombre del alumno/a: "); // Ingresa el nombre del alumno
            Float nota1 = Float.parseFloat(console.readLine("Ingrese la primera nota: ")); //pedimos ingresa notas
            Float nota2 = Float.parseFloat(console.readLine("Ingrese la segunda nota: ")); 
            Float nota3 = Float.parseFloat(console.readLine("Ingrese la tercera nota: "));
            ArrayList<Float> notas = new ArrayList<>(Arrays.asList(nota1, nota2, nota3)); //crea arraylist con las notas
            notasAlumno.put(nombreAlumno, notas);  // se agrega al map el nombre y las notas
            cantidadAlumnos--; // contador
        } 
        System.out.println(notasAlumno);
    }   
}


