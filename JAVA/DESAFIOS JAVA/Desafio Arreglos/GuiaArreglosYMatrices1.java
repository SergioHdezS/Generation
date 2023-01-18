import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen de 1 a 10 los siguientes
aspectos: atención, calidad de la comida, precio, ambiente. Escriba un programa que le pida las valoraciones
anteriores a los cinco clientes y luego imprima en pantalla el promedio obtenido en cada uno de los criterios.
Indicación: use un arreglo de dos dimensiones: las filas representan las calificaciones otorgadas por cada
cliente, mientras que las columnas representan los distintos criterios de evaluación. */

public class GuiaArreglosYMatrices1 {
    public static void main(String[] args) {
        Console console = System.console();
        // crear map donde iran el nombre del cliente y un arraylist con las evaluaciones
        Map<String, ArrayList> evaluacionesClientes = new HashMap<String, ArrayList>();
        int cantidadDeClientes = Integer.parseInt(console.readLine("Ingrese la cantidad de clientes: "));
        //bucle que pide el nombre del cliente y sus respectivas evaluaciones
        while (cantidadDeClientes != 0){
            //Crea map de cada aspecto a evaluar
            Map<String, Float> atencion = new HashMap<String, Float>();
            Map<String, Float> calidadDeComida = new HashMap<String, Float>();
            Map<String, Float> precio = new HashMap<String, Float>();
            Map<String, Float> ambiente = new HashMap<String, Float>();
            Map<String, Float> promedio = new HashMap<String, Float>();
            //pido nombre del cliente
            String nombre = console.readLine("Ingrese nombre del cliente: ");
            float suma = 0.0f;
            for (int i = 0; i<4; i++){
                if (i ==  0){
                    Float evaluacionAtencion = Float.parseFloat(console.readLine("Ingrese evaluacion de la atencion: "));
                    atencion.put("Atencion", evaluacionAtencion);
                    suma = suma + evaluacionAtencion;                   
                }else if (i== 1){
                    Float evaluacionCalidadComida = Float.parseFloat(console.readLine("Ingrese evaluacion de la calidad de la comida: "));
                    calidadDeComida.put("Calidad de comida", evaluacionCalidadComida);
                    suma = suma + evaluacionCalidadComida;
                }else if (i == 2){
                    Float evaluacionPrecio = Float.parseFloat(console.readLine("Ingrese evaluacion del precio: "));
                    precio.put("Precio", evaluacionPrecio);
                    suma = suma + evaluacionPrecio;
                }else if (i == 3){
                    Float evaluacionAmbiente = Float.parseFloat(console.readLine("Ingrese evaluacion del ambiente: "));
                    ambiente.put("Atencion", evaluacionAmbiente);
                    suma = suma + evaluacionAmbiente;
                }
            }
            float calculoPromedio = suma/4;
            promedio.put("Promedio: ", calculoPromedio);
            ArrayList <Map> evaluaciones = new ArrayList<Map>();
            evaluaciones.add(atencion);
            evaluaciones.add(calidadDeComida);
            evaluaciones.add(precio);
            evaluaciones.add(ambiente);
            evaluaciones.add(promedio);
            evaluacionesClientes.put(nombre, evaluaciones);
            //pido evaluaciones de cada aspecto   
            cantidadDeClientes--;
        }
        System.out.println(evaluacionesClientes);
    }
}
