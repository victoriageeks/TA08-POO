package password;
import java.util.Random;

public class Password {
	private int longitud;
	private String contraseña;
	
	// constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = crearContraseña(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = crearContraseña(longitud);
	}
	
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setConstraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	// Método para crear una contraseña aleatoria según su longitud
	public String crearContraseña(int longitud) {
		Random rand = new Random();
		
		int numAleatorio;
		int i = 0;
		String contraseña = "";
		
		while(i<longitud) {
			numAleatorio = rand.nextInt(10);
			contraseña += numAleatorio;
			i++;
		}
		
		return contraseña;
		
		
	}
}
