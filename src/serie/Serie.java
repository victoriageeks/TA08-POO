package serie;

public class Serie {
	private String titulo;
	private int num_de_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constante
	private final int num_de_temporadas_D = 3;
	private final boolean entregado_D = false;

	
	// ----- Constructores -----
	// Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.num_de_temporadas = num_de_temporadas_D;
		this.entregado = entregado_D;
		this.genero = "";
		this.creador = "";
	}
	
	// Constructor con título y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.num_de_temporadas = num_de_temporadas_D;
		this.entregado = entregado_D;
		this.genero = "";
		this.creador = creador;
	}
	
	// Constructor con todos los atributos menos entregado
	public Serie(String titulo, int num_de_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.num_de_temporadas = num_de_temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumDeTemporadas() {
		return num_de_temporadas;
	}
	public void setNumDeTemporadas(int num_de_temporadas) {
		this.num_de_temporadas = num_de_temporadas;
	}
	public boolean getEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
}
