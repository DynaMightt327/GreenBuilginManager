package co.edu.unbosque.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserva {
	
	private int idReserva;
	private String residente;
	private String zonaComun;
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private String estado;
	private LocalDateTime fechaCreacion;
	private String observacones;
	private double valorDeposito;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(int idReserva, String residente, String zonaComun, LocalDate fecha, LocalTime horaInicio,
			LocalTime horaFin, String estado, LocalDateTime fechaCreacion, String observacones, double valorDeposito) {
		super();
		this.idReserva = idReserva;
		this.residente = residente;
		this.zonaComun = zonaComun;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
		this.observacones = observacones;
		this.valorDeposito = valorDeposito;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getResidente() {
		return residente;
	}

	public void setResidente(String residente) {
		this.residente = residente;
	}

	public String getZonaComun() {
		return zonaComun;
	}

	public void setZonaComun(String zonaComun) {
		this.zonaComun = zonaComun;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getObservacones() {
		return observacones;
	}

	public void setObservacones(String observacones) {
		this.observacones = observacones;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", residente=" + residente + ", zonaComun=" + zonaComun + ", fecha="
				+ fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", estado=" + estado
				+ ", fechaCreacion=" + fechaCreacion + ", observacones=" + observacones + ", valorDeposito="
				+ valorDeposito + "]";
	}
	
	

}
