package co.edu.unbosque.model;

public class PersonaAseo extends Persona {
	
	private String empresa;
	private String horario;
	private String observacion;
	
	public PersonaAseo() {
		// TODO Auto-generated constructor stub
	}

	public PersonaAseo(String empresa, String horario, String observacion) {
		super();
		this.empresa = empresa;
		this.horario = horario;
		this.observacion = observacion;
	}

	public PersonaAseo(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String empresa, String horario, String observacion) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto);
		this.empresa = empresa;
		this.horario = horario;
		this.observacion = observacion;
	}

	public PersonaAseo(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto);
		// TODO Auto-generated constructor stub
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "PersonaAseo [empresa=" + empresa + ", horario=" + horario + ", observacion=" + observacion + "]";
	}
	
	
	
	

}
