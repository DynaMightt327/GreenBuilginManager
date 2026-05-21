package co.edu.unbosque.model;

public class ReporteDTO {
	
	private String nombre;
	private String contenido;
	private String fecha;
	
	public ReporteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReporteDTO(String nombre, String contenido, String fecha) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Reporte [nombre=" + nombre + ", contenido=" + contenido + ", fecha=" + fecha + "]";
	}

	
	
	
	

}
