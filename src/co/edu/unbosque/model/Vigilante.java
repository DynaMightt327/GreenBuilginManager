package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Vigilante extends Persona {
	
	private String turno;
	private String empresaSeguridad;
	private LocalDateTime fechaInicio;
	private String novedad;
	
	public Vigilante() {
		// TODO Auto-generated constructor stub
	}

	public Vigilante(String turno, String empresaSeguridad, LocalDateTime fechaInicio, String novedad) {
		super();
		this.turno = turno;
		this.empresaSeguridad = empresaSeguridad;
		this.fechaInicio = fechaInicio;
		this.novedad = novedad;
	}

	public Vigilante(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String turno, String empresaSeguridad, LocalDateTime fechaInicio, String novedad) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto);
		this.turno = turno;
		this.empresaSeguridad = empresaSeguridad;
		this.fechaInicio = fechaInicio;
		this.novedad = novedad;
	}

	public Vigilante(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto);
		// TODO Auto-generated constructor stub
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getEmpresaSeguridad() {
		return empresaSeguridad;
	}

	public void setEmpresaSeguridad(String empresaSeguridad) {
		this.empresaSeguridad = empresaSeguridad;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getNovedad() {
		return novedad;
	}

	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}

	@Override
	public String toString() {
		return "Vigilante [turno=" + turno + ", empresaSeguridad=" + empresaSeguridad + ", fechaInicio=" + fechaInicio
				+ ", novedad=" + novedad + "]";
	}
	
	
	

}
