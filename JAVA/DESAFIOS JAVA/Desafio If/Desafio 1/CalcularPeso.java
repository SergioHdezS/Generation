import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CalcularPeso {
    public static void main(String[] args) {
        Console console = System.console();
        /*
        Cree una clase que se llame conversorPeso
        cree un menú en donde se le pida al usuario ingresar:
        1 si desea covertir el peso en marte    
        2 si desea convertir el peso en luna.
        Luego pida al usuario el peso que desea convertir.
        realice la busqueda de cuantos kilos en tierra son en marte y en la luna
        calcule cuanto sería el peso ingresado
        muestre en pantalla el siguente mensaje según la seleccion del usuario
        "El peso ingresado en la luna sería de: ...."
        "El peso ingresado en Marte sería de: ...."
        ejemplo:

        Bienvenido.
        Ingerse 1 si desea covertir el peso en marte.
        Ingrese 2 si desea convertir el peso en luna.
        2
        Ingrese el peso que desea convertir
        50
        El peso ingresado en la luna sería de: 8.27

        double roundOff = Math.round(random * 100.0) / 100.0;
		System.out.println(roundOff);
        (peso/9.81)*3.711)

        */

        /*
        Hacer con switch

        */
        System.out.println("::::MENU::::");
        
        int repeticion = Integer.parseInt(console.readLine("Ingrese cuantos pesos quiere calcular: "));
        
        System.out.println("Ingrese 1 si desea convertir el peso en Marte");
        System.out.println("Ingrese 2 si desea convertir el peso en la Luna");
        //ArrayList<Float> pesos = new ArrayList<>();
        ArrayList<Float> pesosMarte = new ArrayList<>();
        ArrayList<Float> pesosLuna = new ArrayList<>();

        Map<String, ArrayList> pesosOrdenados = new HashMap<>();
        pesosOrdenados.put("Marte", pesosMarte);
        pesosOrdenados.put("Luna", pesosLuna);

        while (repeticion != 0){
            int opcion = Integer.parseInt(console.readLine("Ingrese opcion: "));
            float pesoPlaneta = 0.0f;
            float peso = Float.parseFloat(console.readLine("Ingrese el peso a convertir: "));
            if (opcion == 1){
                pesoPlaneta = Math.round(((peso/9.81)*3.711)*100.0)/100.0f;
                System.out.println("El peso en Marte sería de: "+ pesoPlaneta);
                pesosMarte.add(pesoPlaneta);
            } else if (opcion == 2){
                pesoPlaneta = Math.round(((peso/9.81)*1.622)*100.0)/100.0f;
                System.out.println("El peso en la Luna sería de: "+ pesoPlaneta);
                pesosLuna.add(pesoPlaneta);
            } else {
                System.out.println("Error");
            }
            repeticion--;
            //pesos.add(pesoPlaneta);
        }
        System.out.println(pesosOrdenados);
        //System.out.println("Pesos: "+pesos);
    }
}

// GUARDAR RESULTADOS EN ARRAYLIST