package co.edu.unbosque.model;

public class VigilanteDTO extends Persona {
	
	private String horario;
	
	public VigilanteDTO() {
		// TODO Auto-generated constructor stub
	}

	public VigilanteDTO(String horario) {
		super();
		this.horario = horario;
	}

	public VigilanteDTO(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena, String horario) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		this.horario = horario;
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

	@Override
	public String toString() {
		return super.toString() + "Vigilante [horario=" + horario + "]";
	}
	
	
	

}
