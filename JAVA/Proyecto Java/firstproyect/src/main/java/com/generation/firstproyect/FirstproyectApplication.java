package com.generation.firstproyect;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproyect.models.Botella;
import com.generation.firstproyect.models.Parlante;
import com.generation.firstproyect.models.Perro;

@SpringBootApplication
public class FirstproyectApplication {

	public static void main(String[] args) {
		Console console = System.console();

		/*Necesitamos preguntarle al usuario cuántos objetos quiere crear, en este caso, cuántas
		botellas quiere crear.*/
		
		/*Vamos hacer un bucle que nos va a indicar la cantidad de objetos que quiere crear, y los datos
		 * a pedir (marca, el material, el contenido de la botella, etc)*/
		/*Los objetos que se creen, deben guardarse en un Arraylist y mostrarlo en pantalla */

		Integer contador = Integer.parseInt(console.readLine("ingrese cuantas botellas quiere crear: ")); // este es nuestro contador de cuantas botellas quiere crear el usuario
		// ArrayList <Botella> jabaBotellas = new ArrayList<>(); //este es nuestro arraylist donde se guardaran las "botellas" creadas por el usuario
		Map <String, Botella> jabaBotellas = new HashMap<>();
		//ahora haremos el bucle While, hasta que el contador sea 0
		for(int i = 1; i <= contador; i++){
			Botella botella = new Botella(); //esta botella vacia, recibira los atributos que tiene el objeto "botella"

			System.out.println("Ingrese los atributos de la botella " + i); //nos dice el nro de botella que está creando
			//aqui pedimos al usuario ingresar todos los atributos de nuestro "objeto" botella
			botella.setLiquido(console.readLine("ingrese el contenido de la botella: ")); // ingrese el liquido
			botella.setMarca(console.readLine("ingrese la marca de la botella: ")); // ingrese la marca
			botella.setMl(Integer.parseInt(console.readLine("ingrese el volumen de la botella: "))); // ingrese el volumen
			botella.setMaterial(console.readLine("ingrese el material de la botella: "));	// ingrese el material

			jabaBotellas.put("Botella " + i, botella);
			System.out.println("------------------------------------------------------------------------------------");

			
		}
		System.out.println(jabaBotellas);









		//SpringApplication.run(FirstproyectApplication.class, args);
/* 
		Parlante parlanteDefault = new Parlante();
		Parlante parlanteCompleto = new Parlante("JBL", "Partybox 110", "Negro", "Si", "Si", 160.0f, "Si", 2, "Si", "Si", "Si"); */

		//Llenar el objeto vacio con metodos set
		/* parlanteDefault.setMarca("Soundcore");
		parlanteDefault.setModelo("3");
		parlanteDefault.setColor("Azul");
		parlanteDefault.setEntradaAudio("Si");
		parlanteDefault.setSalidaAudio("No");
		parlanteDefault.setEntradaCorriente(110f);
		parlanteDefault.setBotonEncendido("Si");
		parlanteDefault.setBocina(1);
		parlanteDefault.setBotonApagado("Si");
		parlanteDefault.setBotonVolumenMas("No");
		parlanteCompleto.setBotonVolumenMenos("No");
		//editar el objeto completo con metodos set
		parlanteCompleto.setColor("Gris");
		parlanteCompleto.setBotonVolumenMas("No");
		parlanteCompleto.setBotonVolumenMenos("No");
		parlanteCompleto.setModelo("Partybox 120");
		
		System.out.println(parlanteDefault);
		System.out.println(parlanteCompleto); */
		
		//Guardar en variables 3 atributos con el metodo get
		/* String marca = parlanteCompleto.getMarca();
		System.out.println(marca);

		Integer bocina = parlanteDefault.getBocina();
		System.out.println(bocina);

		String color = parlanteCompleto.getColor();
		System.out.println(color);
 */

		/* Perro perroDefault = new Perro(); //creando un perro con el constructor por defecto porque no estoy usando variables
		Perro perroCompleto = new Perro("Max", "rulos", "Salchicha", true);
		Perro perroQuiltro = new Perro("Pelusa","Liso");

		perroDefault.setNombre("copi-copi");
		perroDefault.setPelaje("pelo duro");
		perroDefault.setRaza("gucci");
		perroDefault.setVacunado(true);
		
		System.out.println("Perro por default: "+perroDefault.toString());
		System.out.println("Perro completo: "+perroCompleto.toString());
		System.out.println("Perro quiltro: "+perroQuiltro.toString());

		System.out.println("Perro por default: "+perroDefault.getNombre());
		System.out.println("Perro completo: "+perroCompleto.getRaza());
		System.out.println("Perro quiltro: "+perroQuiltro.getVacunado());

		String nombrePerro = perroDefault.getNombre();
		System.out.println(nombrePerro); */

		/*perroDefault.ladrar();
		perroCompleto.caminar();
		System.out.println(perroQuiltro.truco("da la pata")); */
	}
}