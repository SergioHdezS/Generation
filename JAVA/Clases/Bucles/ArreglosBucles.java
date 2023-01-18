import java.io.Console;

public class ArreglosBucles {
    /* bucles js
     * for, for each, while, do while, en java tenemos los mismos 
     * for en JavaScript -> for (vari i=0, i<2; i++){}
     * for en Java -> for (int = 0; i<2; i++){}
     * for each en js -> nomArreglo.forEach(element)(siendo element cada objeto del arreglo)
     * for each en Java -> for(String nomArreglo: element){}
     * while en Javascript -> while(condicion){verificar que en algun momento se cumpla la condicion}
     * ehilr en Java -> while(condicion){}(igual que en js)0
     * do while en Javascript -> do {se hace la operacion}while(condicion);
     * do while en Java -> do{se hace la operacion}while(condicion);
     * el do while se ocupa en casos donde si o si almenos una vez se debe realizar la operacion 
     */
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Bienvenido/a.");
        int contador = 0;
        int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular: "));
        /* while (repeticion != 0){
            repeticion--;
        } */
        /* while(contador != repeticiones){
            int venta = Integer.parseInt(console.readLine("Ingrese el monto de ventas: "));
            if (venta >= 10000){
                System.out.println("Su comision es de "+(venta*0.3)+", correspondiente al 30%.");
            } else if (venta > 5000 && venta <= 9999){
                System.out.println("Su comision es de "+(venta*0.2)+", correspondiente al 20%.");
            } else if (venta > 1001 && venta <= 4999){
                System.out.println("Su comision es de "+(venta*0.1)+", correspondiente al 10%.");
            } else{
                System.out.println("A usted no le corresponde comision.");
            }
            contador++; //puede ir arriba o abajo
        } */

        /* for (int i = 0; i<repeticiones; i++){
            int venta = Integer.parseInt(console.readLine("Ingrese el monto de ventas: "));
            if (venta >= 10000){
                System.out.println("Su comision es de "+(venta*0.3)+", correspondiente al 30%.");
            } else if (venta > 5000 && venta <= 9999){
                System.out.println("Su comision es de "+(venta*0.2)+", correspondiente al 20%.");
            } else if (venta > 1001 && venta <= 4999){
                System.out.println("Su comision es de "+(venta*0.1)+", correspondiente al 10%.");
            } else{
                System.out.println("A usted no le corresponde comision.");
            } */
        
        
    }
}

