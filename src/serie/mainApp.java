package serie;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		/* Crearemos una clase llamada Serie con las siguientes características:
		 *	- Sus atributos son título, numero de temporadas, entregado, género y creador.
		 *	- Por defecto, el número de temporadas es de 3 y entregado false. El resto de
		 *	atributos serán valores por defecto según el tipo de atributo.
		 *
		 * 	- Los constructores que se implementaran serán:
		 * 		- un constructor por defecto.
		 * 		- un constructor con el título y el creador. El resto por defecto.
		 * 		- un constructor con todos los atributos, excepto de entregado.*/

		Scanner sc = new Scanner(System.in);
		int eleccion;
		String titulo;
		int num_de_temporadas;
		String genero;
		String creador;
		
		System.out.println("Bienvenido, ¿qué desea realizar? \n1)Crear un constructor por defecto. \n2)Crear un constructor con el título y creador. \n3)Crear un constructor con todos los atributos menos entregado.");
		eleccion = sc.nextInt();
		
		switch(eleccion) {
		case 1:
			Serie s1 = new Serie();
			System.out.println("----- Serie 1 -----");
			System.out.println("Título: " + s1.getTitulo() + "\nNúmero de temporadas: " + s1.getNumDeTemporadas() + "\nEntregado? " + s1.getEntregado() + "\nGénero: " + s1.getGenero() + "\nNombre del creador: " + s1.getCreador());
			break;
		case 2:
			System.out.println("Introduce el título de la serie: ");
			titulo = sc.next();
			System.out.println("Introduce el nombre de su creador: ");
			creador = sc.next();
			Serie s2 = new Serie(titulo,creador);
			System.out.println("----- Serie 2 -----");
			System.out.println("Título: " + s2.getTitulo() + "\nNúmero de temporadas: " + s2.getNumDeTemporadas() + "\nEntregado? " + s2.getEntregado() + "\nGénero: " + s2.getGenero() + "\nNombre del creador: " + s2.getCreador());
			break;
		case 3: 
			System.out.println("Introduce el título de la serie: ");
			titulo = sc.next();
			System.out.println("Introduce el número de temporadas: ");
			num_de_temporadas = sc.nextInt();
			System.out.println("Introduce su género: ");
			genero = sc.next();
			System.out.println("Introduce el nombre de su creador: ");
			creador = sc.next();
			
			Serie s3 = new Serie(titulo,num_de_temporadas,genero,creador);
			System.out.println("Título: " + s3.getTitulo() + "\nNúmero de temporadas: " + s3.getNumDeTemporadas() + "\nGénero: " + s3.getGenero() + "\nNombre del creador: " + s3.getCreador());
			break;
		}
		sc.close();
	}

}
