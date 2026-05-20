package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Administrador extends Persona {
	
	
	private LocalDateTime fechaIncio;
	private long nit;
	private String nivelAcceso;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(LocalDateTime fechaIncio, long nit, String nivelAcceso) {
		super();
		this.fechaIncio = fechaIncio;
		this.nit = nit;
		this.nivelAcceso = nivelAcceso;
	}

	public Administrador(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, LocalDateTime fechaIncio, long nit, String nivelAcceso) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado);
		this.fechaIncio = fechaIncio;
		this.nit = nit;
		this.nivelAcceso = nivelAcceso;
	}

	public Administrador(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado);
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getFechaIncio() {
		return fechaIncio;
	}

	public void setFechaIncio(LocalDateTime fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public long getNit() {
		return nit;
	}

	public void setNit(long nit) {
		this.nit = nit;
	}

	public String getNivelAcceso() {
		return nivelAcceso;
	}

	public void setNivelAcceso(String nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}

	@Override
	public String toString() {
		return super.toString() +  "Administrador  \nfechaIncio " + fechaIncio + ", nit=" + nit + ", nivelAcceso="
				+ nivelAcceso + "]";
	}

	

}
