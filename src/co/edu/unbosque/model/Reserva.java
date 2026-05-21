package co.edu.unbosque.model;

import java.time.LocalDate;

public class Reserva {
	
	private String nombreCompleto;
	private String tipoZona;
	private int edad;
	private long id;
	private long telefono;
	private String correo;
	private LocalDate fechaReserva;
	private String horaInicio;
	private String horaFinal;
	private int costo;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(String nombreCompleto, String tipoZona, int edad, long id, long telefono, String correo,
			LocalDate fechaReserva, String horaInicio, String horaFinal, int costo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.tipoZona = tipoZona;
		this.edad = edad;
		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaReserva = fechaReserva;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.costo = costo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTipoZona() {
		return tipoZona;
	}

	public void setTipoZona(String tipoZona) {
		this.tipoZona = tipoZona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Reserva [nombreCompleto=" + nombreCompleto + ", tipoZona=" + tipoZona + ", edad=" + edad + ", id=" + id
				+ ", telefono=" + telefono + ", correo=" + correo + ", fechaReserva=" + fechaReserva + ", horaInicio="
				+ horaInicio + ", horaFinal=" + horaFinal + ", costo=" + costo + "]";
	}

	
	
	

}
