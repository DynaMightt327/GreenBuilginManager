package co.edu.unbosque.model;

public class Multa {

	private String razon;
	private int costo;
	private String contenido;

	public Multa() {
		// TODO Auto-generated constructor stub
	}

	public Multa(String razon, int costo, String contenido) {
		super();
		this.razon = razon;
		this.costo = costo;
		this.contenido = contenido;
	}

	public String getRazon() {
		return razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Multa [razon=" + razon + ", costo=" + costo + ", contenido=" + contenido + "]";
	}

}
