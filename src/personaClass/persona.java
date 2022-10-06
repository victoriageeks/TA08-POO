package personaClass;

public class persona {
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	// Constante
	private final static String SEXO_H = "Hombre";
	
	
	// ------------------ Constructores ------------------ //
	
	// Constructor por defecto
	public persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXO_H;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	// Constructor personalizado
	public persona (String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	// Constructor completo
	public persona (String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getSexoH() {
		return SEXO_H;		
	}
	

}
