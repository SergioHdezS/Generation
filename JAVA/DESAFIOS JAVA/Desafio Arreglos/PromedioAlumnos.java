import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PromedioAlumnos {
    public static void main(String[] args) {
        Console console = System.console();        
        Map<String, ArrayList> notasAlumno = new HashMap<String, ArrayList>(); // crea hashmap con llave string que va a ser el nombre del alumno y valor un arraylist con las notas de cada alumno
        System.out.println("*****Bienvenido/a*****");
        // pedir ingresar cantidad de alumnos
        int cantidadAlumnos = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos: ")); // pide ingresar cantidad de alumnos
        while (cantidadAlumnos != 0){ // bucle que opera segun la cantidad de alumnos
            String nombreAlumno = console.readLine("Ingrese el nombre del alumno/a: "); // Ingresa el nombre del alumno
            Float nota1, nota2, nota3; 
            do { //bucle do while donde pide la nota, si la nota no esta dentre del rango, entrega un error y vuelve a pedir la misma nota
                nota1 = Float.parseFloat(console.readLine("Ingrese nota 1: "));
                if (nota1 < 1.0 || nota1 > 7.0 ){
                System.out.println("Error al ingresar la nota");
                }
            } while (nota1 < 1.0 || nota1 > 7.0); 
            do {
                nota2 = Float.parseFloat(console.readLine("Ingrese nota 2: "));
                if (nota2 < 1.0 || nota2 > 7.0 ){
                System.out.println("Error al ingresar la nota");
                }
            } while (nota2 < 1.0 || nota2 > 7.0); 
            do {
                nota3 = Float.parseFloat(console.readLine("Ingrese nota 3: "));
                if (nota3 < 1.0 || nota3 > 7.0 ){
                System.out.println("Error al ingresar la nota");
                }
            } while (nota3 < 1.0 || nota3 > 7.0); 
            //Hacer un hashmap de cada nota llave = "nota 1", valor = nota1, etc2
            Map<String, Float> primeraNota = new HashMap<String, Float>();
            primeraNota.put("Nota 1 ", nota1);
            Map<String, Float> segundaNota = new HashMap<String, Float>();
            segundaNota.put("Nota 2 ", nota2);
            Map<String, Float> terceraNota = new HashMap<String, Float>();
            terceraNota.put("Nota 3 ", nota3);
            //Hacer hashmap del promedio llave ="promedio", valor = promedio
            Float promedio = Math.round(((nota1 + nota2 + nota3)/3)*10.0)/10.0f;
            Map<String, Float> promedioNotas = new HashMap<>();
            promedioNotas.put("Promedio ", promedio);
             //Hacer un arraylist con los maps de cada nota y promedio
            ArrayList<Map> notas = new ArrayList<>(Arrays.asList(primeraNota, segundaNota, terceraNota, promedioNotas));
            notasAlumno.put(nombreAlumno, notas);  // se agrega al map el nombre y las notas
            cantidadAlumnos--; // contador
        }
        System.out.println(notasAlumno);
    }
}


/* 
//Hacer un hashmap de cada nota llave = "nota 1", valor = nota1, etc
Map<String, Float> primeraNota = new HashMap<>();
primeraNota.put("Nota 1", nota1);
Map<String, Float> segundaNota = new HashMap<>();
segundaNota.put("Nota 2", nota1);
Map<String, Float> terceraNota = new HashMap<>();
terceraNota.put("Nota 3", nota1);
//Hacer hashmap del promedio llave ="promedio", valor = promedio
Map<String, Float> promedioNotas = new HashMap<>();
promedioNotas.put("Promedio", promedio);
//Hacer un arraylist con los maps de cada nota y promedio
ArrayList<Map> notas = new ArrayList<>(Arrays.asList(primeraNota, segundaNota, terceraNota, promedioNotas));
//hacer un ultimo map con el string nombre alumno y arraylist anterior
Map<String, ArrayList> notasAlumno = new HashMap<>();
notasAlumno.put(nombreAlumno, notas); 
*/

            /* if (nota2 < 1.0f || nota2 > 7.0f){
                System.out.println("Error, vuelva a ingresar la nota");
                nota2 = Float.parseFloat(console.readLine("Ingrese la segunda nota: "));
            }
            if (nota3 < 1.0f || nota3 > 7.0f){
                System.out.println("Error, vuevla a ingresar la nota");
                nota3 = Float.parseFloat(console.readLine("Ingrese la tercera nota: "));
            } */