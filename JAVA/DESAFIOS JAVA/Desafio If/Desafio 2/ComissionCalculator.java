import java.io.Console;

public class ComissionCalculator {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Bienvenido/a.");
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
    }
}
