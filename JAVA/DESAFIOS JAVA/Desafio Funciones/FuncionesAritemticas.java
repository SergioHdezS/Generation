import java.io.Console;

public class FuncionesAritemticas {
    static int Suma (int  num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    static int Resta (int  num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    static int Multiplicacion (int  num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    static float Division (float num1, float num2){
        float resultado = num1 / num2;
        return resultado;
    }
    public static void main(String[] args) {
        Console console = System.console(); // Declaramos la consola para pedir datos al ussuario

        int opcion = 0; // Declaramos la variable opcion igual a cero, que usaremos en el bucle 

        while (opcion != 5){ //Funciona hasta que el usuario ingrese la opcion 5
            System.out.println(":::::MENU:::::");
            System.out.println("Ingrese 1 para sumar");
            System.out.println("Ingrese 2 para restar");
            System.out.println("Ingrese 3 para multiplicar");
            System.out.println("Ingrese 4 para dividir");
            System.out.println("Ingrese 5 para finalizar");
            System.out.println("");
            opcion = Integer.parseInt(console.readLine("Ingrese opcion: "));
            if (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5){
                System.out.println("Opercaion no valida, intente nuevamente");
            } else {
                if (opcion == 5){
                    System.out.println("Finalizado");
                    break;
                }
                int num1 = Integer.parseInt(console.readLine("Ingrese primer numero: "));
                int num2 = Integer.parseInt(console.readLine("Ingrese segundo numero: "));
                if (opcion == 1){
                    System.out.println("Su resultado es: "+Suma(num1, num2));
                    System.out.println("");
                } else if (opcion == 2){
                    System.out.println("Su resultado es: "+Resta(num1, num2));
                    System.out.println("");
                } else if (opcion == 3){
                    System.out.println("Su resultado es: "+Multiplicacion(num1, num2));
                    System.out.println("");
                } else if (opcion == 4){
                    while (num2 == 0){
                        System.out.println("Error, ingrese otro numero diferente de 0");
                        num2 = Integer.parseInt(console.readLine("Ingrese el segundo numero: "));
                    } 
                    System.out.println("Su resultado es: "+Division(num1, num2));
                    System.out.println("");
                }
            }
        }
    }
}
