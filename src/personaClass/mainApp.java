package personaClass;

public class mainApp {

	public static void main(String[] args) {
		/* Haz una clase llamada Persona que siga las siguientes condiciones:
		 *	- Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No
		 *	queremos que se accedan directamente a ellos. Piensa qué modificador de acceso es el
		 *	más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
		 *	
		 *	- Por defecto, todos los atributos menos el DNI serán valores por defecto según su
		 *	tipo (0 números, cadena vacía para String, etc.) Sexo será hombre por defecto,
		 *	usa una constante para ello.
		 *
		 *	- Se implementarán varios constructores:
		 *		- Un constructor por defecto.
		 *		- Un constructor con el nombre, edad y sexo, el resto por defecto.
		 *		- Un constructor con todos los atributos como parámetro.*/

	
		persona p1 = new persona();
		persona p2 = new persona("Victoria",20,"Mujer");
		persona p3 = new persona("Joel",20,"12345678A","Hombre",80.0,1.81);
		
		System.out.println("Persona por defecto:");
		System.out.println("Nombre: " + p1.getNombre() + "\nEdad: " + p1.getEdad() + "\nDNI: " + p1.getDNI() + "\nSexo: " + p1.getSexo() + "\nPeso: "+ p1.getPeso() + "\nAltura: " + p1.getAltura());
		System.out.println("-------------------");
		
		System.out.println("Persona personalizado:");
		System.out.println("Nombre: " + p2.getNombre() + "\nEdad: " + p2.getEdad() + "\nDNI: " + p2.getDNI() + "\nSexo: " + p2.getSexo() + "\nPeso: "+ p2.getPeso() + "\nAltura: " + p2.getAltura());
		System.out.println("-------------------");
		
		System.out.println("Persona completo:");
		System.out.println("Nombre: " + p3.getNombre() + "\nEdad: " + p3.getEdad() + "\nDNI: " + p3.getDNI() + "\nSexo: " + p3.getSexo() + "\nPeso: "+ p3.getPeso() + "\nAltura: " + p3.getAltura());
	}

}
