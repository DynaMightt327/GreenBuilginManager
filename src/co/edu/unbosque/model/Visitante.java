package co.edu.unbosque.model;

public class Visitante extends Persona {
	
	private int torre;
	private int piso;
	private int apartamento;
	private boolean esFrecuente;
	
	public Visitante() {
		// TODO Auto-generated constructor stub
	}

	public Visitante(int torre, int piso, int apartamento, boolean esFrecuente) {
		super();
		this.torre = torre;
		this.piso = piso;
		this.apartamento = apartamento;
		this.esFrecuente = esFrecuente;
	}

	public Visitante(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena, int torre, int piso, int apartamento,
			boolean esFrecuente) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		this.torre = torre;
		this.piso = piso;
		this.apartamento = apartamento;
		this.esFrecuente = esFrecuente;
	}

	public Visitante(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		// TODO Auto-generated constructor stub
	}

	public int getTorre() {
		return torre;
	}

	public void setTorre(int torre) {
		this.torre = torre;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public boolean isEsFrecuente() {
		return esFrecuente;
	}

	public void setEsFrecuente(boolean esFrecuente) {
		this.esFrecuente = esFrecuente;
	}

	@Override
	public String toString() {
		return super.toString() +"Visitante [torre=" + torre + ", piso=" + piso + ", apartamento=" + apartamento + ", esFrecuente="
				+ esFrecuente + "]";
	}
	
	

}
