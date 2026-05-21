package co.edu.unbosque.model;

public class VigilanteDTO extends Persona {
	
	private String horario;
	private String tipoReporte;
	private String contenidoReporte;
	
	public VigilanteDTO() {
		// TODO Auto-generated constructor stub
	}

	public VigilanteDTO(String horario, String tipoReporte, String contenidoReporte) {
		super();
		this.horario = horario;
		this.tipoReporte = tipoReporte;
		this.contenidoReporte = contenidoReporte;
	}

	public VigilanteDTO(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena, String horario, String tipoReporte,
			String contenidoReporte) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		this.horario = horario;
		this.tipoReporte = tipoReporte;
		this.contenidoReporte = contenidoReporte;
	}

	public VigilanteDTO(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		// TODO Auto-generated constructor stub
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTipoReporte() {
		return tipoReporte;
	}

	public void setTipoReporte(String tipoReporte) {
		this.tipoReporte = tipoReporte;
	}

	public String getContenidoReporte() {
		return contenidoReporte;
	}

	public void setContenidoReporte(String contenidoReporte) {
		this.contenidoReporte = contenidoReporte;
	}

	@Override
	public String toString() {
		return "Vigilante [horario=" + horario + ", tipoReporte=" + tipoReporte + ", contenidoReporte="
				+ contenidoReporte + "]";
	}
	
	
	

}
