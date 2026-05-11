package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class Residente extends Persona {

	private String tipo;
	private int numeroApartaento;
	private String torre;
	private String parqueaderoAsignado;
	private String mascotaRegistrada;
	private String vehiculoRegistrado;
	private boolean tieneBicicleta;
	private int numBicicletero;
	private boolean tienePaquete;
	private boolean tieneMulta;
	private String datoPaquete;
	private String datoMulta;
	private LocalDateTime fechaDeInicio;

	public Residente() {
		// TODO Auto-generated constructor stub
	}

	public Residente(String tipo, int numeroApartaento, String torre, String parqueaderoAsignado,
			String mascotaRegistrada, String vehiculoRegistrado, boolean tieneBicicleta, int numBicicletero,
			boolean tienePaquete, boolean tieneMulta, String datoPaquete, String datoMulta,
			LocalDateTime fechaDeInicio) {
		super();
		this.tipo = tipo;
		this.numeroApartaento = numeroApartaento;
		this.torre = torre;
		this.parqueaderoAsignado = parqueaderoAsignado;
		this.mascotaRegistrada = mascotaRegistrada;
		this.vehiculoRegistrado = vehiculoRegistrado;
		this.tieneBicicleta = tieneBicicleta;
		this.numBicicletero = numBicicletero;
		this.tienePaquete = tienePaquete;
		this.tieneMulta = tieneMulta;
		this.datoPaquete = datoPaquete;
		this.datoMulta = datoMulta;
		this.fechaDeInicio = fechaDeInicio;
	}

	public Residente(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String tipo, int numeroApartaento, String torre, String parqueaderoAsignado,
			String mascotaRegistrada, String vehiculoRegistrado, boolean tieneBicicleta, int numBicicletero,
			boolean tienePaquete, boolean tieneMulta, String datoPaquete, String datoMulta,
			LocalDateTime fechaDeInicio) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado);
		this.tipo = tipo;
		this.numeroApartaento = numeroApartaento;
		this.torre = torre;
		this.parqueaderoAsignado = parqueaderoAsignado;
		this.mascotaRegistrada = mascotaRegistrada;
		this.vehiculoRegistrado = vehiculoRegistrado;
		this.tieneBicicleta = tieneBicicleta;
		this.numBicicletero = numBicicletero;
		this.tienePaquete = tienePaquete;
		this.tieneMulta = tieneMulta;
		this.datoPaquete = datoPaquete;
		this.datoMulta = datoMulta;
		this.fechaDeInicio = fechaDeInicio;
	}

	public Residente(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroApartaento() {
		return numeroApartaento;
	}

	public void setNumeroApartaento(int numeroApartaento) {
		this.numeroApartaento = numeroApartaento;
	}

	public String getTorre() {
		return torre;
	}

	public void setTorre(String torre) {
		this.torre = torre;
	}

	public String getParqueaderoAsignado() {
		return parqueaderoAsignado;
	}

	public void setParqueaderoAsignado(String parqueaderoAsignado) {
		this.parqueaderoAsignado = parqueaderoAsignado;
	}

	public String getMascotaRegistrada() {
		return mascotaRegistrada;
	}

	public void setMascotaRegistrada(String mascotaRegistrada) {
		this.mascotaRegistrada = mascotaRegistrada;
	}

	public String getVehiculoRegistrado() {
		return vehiculoRegistrado;
	}

	public void setVehiculoRegistrado(String vehiculoRegistrado) {
		this.vehiculoRegistrado = vehiculoRegistrado;
	}

	public boolean isTieneBicicleta() {
		return tieneBicicleta;
	}

	public void setTieneBicicleta(boolean tieneBicicleta) {
		this.tieneBicicleta = tieneBicicleta;
	}

	public int getNumBicicletero() {
		return numBicicletero;
	}

	public void setNumBicicletero(int numBicicletero) {
		this.numBicicletero = numBicicletero;
	}

	public boolean isTienePaquete() {
		return tienePaquete;
	}

	public void setTienePaquete(boolean tienePaquete) {
		this.tienePaquete = tienePaquete;
	}

	public boolean isTieneMulta() {
		return tieneMulta;
	}

	public void setTieneMulta(boolean tieneMulta) {
		this.tieneMulta = tieneMulta;
	}

	public String getDatoPaquete() {
		return datoPaquete;
	}

	public void setDatoPaquete(String datoPaquete) {
		this.datoPaquete = datoPaquete;
	}

	public String getDatoMulta() {
		return datoMulta;
	}

	public void setDatoMulta(String datoMulta) {
		this.datoMulta = datoMulta;
	}

	public LocalDateTime getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(LocalDateTime fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	@Override
	public String toString() {
		return "Residente [tipo=" + tipo + ", numeroApartaento=" + numeroApartaento + ", torre=" + torre
				+ ", parqueaderoAsignado=" + parqueaderoAsignado + ", mascotaRegistrada=" + mascotaRegistrada
				+ ", vehiculoRegistrado=" + vehiculoRegistrado + ", tieneBicicleta=" + tieneBicicleta
				+ ", numBicicletero=" + numBicicletero + ", tienePaquete=" + tienePaquete + ", tieneMulta=" + tieneMulta
				+ ", datoPaquete=" + datoPaquete + ", datoMulta=" + datoMulta + ", fechaDeInicio=" + fechaDeInicio
				+ "]";
	}

	

}
