package password;

public class mainApp {

	public static void main(String[] args) {
		/* Haz una clase llamada Password que siga las siguientes condiciones:
		 * 	- Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
		 * 	- Los constructores serán los siguientes:
		 * 		- un constructor por defecto.
		 * 		- un constructor con la longitud que nosotros le pasemos. Generará una
		 * 		contraseña aleatoria con esa longitud.*/

		Password p1 = new Password();
		Password p2 = new Password(5);
		
		System.out.println("Contraseña 1:");
		System.out.println("Longitud: " + p1.getLongitud() + "\nContraseña: "+ p1.getContraseña());
		System.out.println("--------------");
		System.out.println("Contraseña 2:");
		System.out.println("Longitud: " + p2.getLongitud() + "\nContraseña: "+ p2.getContraseña());
	}

}
