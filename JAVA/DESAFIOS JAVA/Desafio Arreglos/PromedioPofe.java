import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class PromedioPofe {
    public static void main(String[] args) {
        Console console = System.console();
        Map <String, ArrayList> libroClases = new HashMap<String, ArrayList>(); // crea un map donde va el nombre del alumno y las notas
        System.out.println("******Bienvenido/a******");
        int cantidad = Integer.parseInt(console.readLine("Ingrese cantidad de alumnos a ingresar: ")); //pide ingresa la cantidad de alumnos
        Integer cantidadNotas = Integer.parseInt(console.readLine("Ingrese la cantidad de notas: "));
        while(cantidad!=0){ //contador 
            String nombre = console.readLine("Ingrese nombre del alumno/a: "); // pide nombre del alumno
            ArrayList <Float> notas = new ArrayList<Float>(); //crea arraylist donde se van a añadir las notas
            for (int i = 1; i <= cantidadNotas; i++){ // bucle que pide las notas segun la cantidad de notas 
                Float nota;
                //bucle do while donde pide la nota, si la nota no esta dentre del rango, entrega un error y vuelve a pedir la misma nota
                do {
                    nota = Float.parseFloat(console.readLine("Ingrese nota "+i+": "));
                    if (nota < 1.0 || nota > 7.0 ){
                    System.out.println("Error al ingresar la nota");
                    }
                } while (nota < 1.0f || nota > 7.0f); 
                notas.add(nota); //anade la nota al arraylist
            }
            libroClases.put(nombre, notas); //anade al map creado anteriormente el nombre del alumno y las notas correspondientes
            cantidad--; //disminuye el contador en 1
        }
        System.out.println(libroClases);//muestra el map
        for(String i: libroClases.keySet()){ //for each 
            float suma = 0.0f; // crea la variable suma
            for(Object x : libroClases.get(i)){
                suma = (Float) x + suma;
            }
            System.out.println("El promedio de: "+i+" fue de: "+Math.round((suma/cantidadNotas)*10.0)/10.0f);      
        }
    }
}    
