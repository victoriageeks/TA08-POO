package electrodomestico;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		/*Crearemos una clase llamada Electrodomestico con las siguientes características:
		 * 	- Sus atributos son precio base, color, consumo energético (letras A-F) y peso.
		 * 	Indica que se podrán heredar.
		 * 	- Por defecto, el color será blanco, el consumo energético será F, el precioBase
		 * 	es de 100 euros y el peso de 5kg. Usa constantes para ello.
		 * 	- Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el
		 * 	nombre esrá en mayúsculas o minúsculas.
		 * 	- Los constructores que se implementarán serán:
		 * 		- Un constructor por defecto.
		 *		- Un constructor con el precio y el peso. El resto por defecto.
		 *		- Un constructor con todos los atributos.*/

		Scanner sc = new Scanner(System.in);
		int eleccion;
		
		double precioBase;
		String color;
		char consumoEnergetico;
		double peso;
		
		
		System.out.println("Bienvenido, ¿qué desea realizar? \n1)Crear un constructor por defecto. \n2)Crear un constructor con el precio y el peso. \n3)Crear un constructor con todos los atributos.");
		eleccion = sc.nextInt();
		
		switch(eleccion) {
		case 1:
			Electrodomestico e1 = new Electrodomestico();
			System.out.println("----- Electrodoméstico 1 -----");
			System.out.println("Precio base: " + e1.getPrecioBase() + "\nColor: " + e1.getColor() + "\nConsumo energético: " + e1.getConsumoEnergetico() + "\nPeso: " + e1.getPeso());
			break;
		case 2:
			System.out.println("Escribe el precio base:");
			precioBase = sc.nextDouble();
			System.out.println(precioBase);
			System.out.println("Escribe el peso:");
			peso = sc.nextDouble();
			
			Electrodomestico e2 = new Electrodomestico(precioBase,peso);
			
			System.out.println("----- Electrodoméstico 2 -----");
			System.out.println("Precio base: " + e2.getPrecioBase() + "\nColor: " + e2.getColor() + "\nConsumo energético: " + e2.getConsumoEnergetico() + "\nPeso: " + e2.getPeso());
			break;
		case 3:
			System.out.println("Escribe el precio Base:");
			precioBase = sc.nextDouble();
			System.out.println("Escribe un color (blanco, negro, rojo, azul o gris):");
			color = sc.next().toLowerCase();
			System.out.println("Escribe el consumo energético:");
			consumoEnergetico = sc.next().toUpperCase().charAt(0);
			System.out.println("Escribe el peso:");
			peso = sc.nextDouble();
			
			Electrodomestico e3 = new Electrodomestico(precioBase,color,consumoEnergetico,peso);
			System.out.println("----- Electrodoméstico 3 -----");
			System.out.println("Precio base: " + e3.getPrecioBase() + "\nColor: " + e3.getColor() + "\nConsumo energético: " + e3.getConsumoEnergetico() + "\nPeso: " + e3.getPeso());
			break;
	}
		sc.close();
		
		
	}

}
