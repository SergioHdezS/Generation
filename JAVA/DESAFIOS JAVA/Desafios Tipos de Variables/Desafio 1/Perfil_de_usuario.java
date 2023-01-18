import java.io.Console;

public class Perfil_de_usuario {
    public static void main(String[] args) {
        Console console = System.console();
        // nombre
        String nombre = console.readLine("Inserte nombre: ");
        // edad
        String edad = console.readLine("Inserte edad: ");
        int edad2 = Integer.parseInt(edad);
        int anioActual = 2022;
        int anioNacimiento = (anioActual - edad2);
        // genero
        String genero = console.readLine("Inserte genero: ");
        String mayus = genero.toUpperCase();
        // preferencia laboral
        String preferencia = console.readLine("Inserte preferencia laboral: ");
        // nacionalidad 
        String nacionalidad = console.readLine("Inserte nacionalidad: ");
        // tipo de sangre
        String tipoSangre = console.readLine("Ingrese tipo de sangre: ");
        //output
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Nombre de usuario: "+nombre);
        System.out.println("Edad: " + edad2 + " años.");
        System.out.println("Año  de nacimiento: "+anioNacimiento);
        System.out.println("Género: "+ mayus.charAt(0));
        System.out.println("Preferencia laboral: "+preferencia);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Tipo de sangre: "+tipoSangre);
    }
}
