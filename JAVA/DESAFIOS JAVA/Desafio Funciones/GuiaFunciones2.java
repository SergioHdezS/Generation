import java.io.Console;

/* Escriba una función tal que recibe un número entero positivo. Si es par, debe devolver su
antecesor y en caso contrario, su sucesor. */
public class GuiaFunciones2 {
    static int antecesorSucesor (int num){
        int antecesor = 0;
        int sucesor = 0;
        if (num%2 == 0){
            antecesor = num-1;
            return antecesor;
        } else {
            sucesor = num+1;
            return sucesor;
        }
    }
    public static void main(String[] args) {
        Console console = System.console();
        //crear bucle para que pida constantemente un numero para operar
        while (true){
            int num = Integer.parseInt(console.readLine("Ingrese el numero que desea operar: "));
            if (num < 0){
                System.out.println("Error, ingrese solo numeros positivos");
            } else if (num > 0) {
                System.out.println(antecesorSucesor(num));
            } else if (num == 0) {
                System.out.println("Finalizado");
                break;
            }
        }
    }
}
