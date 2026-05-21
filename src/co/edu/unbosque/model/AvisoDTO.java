package co.edu.unbosque.model;

public class AvisoDTO {
	
	private String tipoAviso;
	private String contenido;
	private String fecha;
	
	public AvisoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AvisoDTO(String tipoAviso, String contenido, String fecha) {
		super();
		this.tipoAviso = tipoAviso;
		this.contenido = contenido;
		this.fecha = fecha;
	}

	public String getTipoAviso() {
		return tipoAviso;
	}

	public void setTipoAviso(String tipoAviso) {
		this.tipoAviso = tipoAviso;
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
		return "Aviso [tipoAviso=" + tipoAviso + ", contenido=" + contenido + ", fecha=" + fecha + "]";
	}
	
	

}
