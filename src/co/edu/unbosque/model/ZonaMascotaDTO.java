package co.edu.unbosque.model;

public class ZonaMascotaDTO extends ZonaComun {
	
	private String horario;
	private double tamanoMaximo;
	private String estadoDeCaneca;
	private String estadoBebederos;
	
	public ZonaMascotaDTO() {
		// TODO Auto-generated constructor stub
	}

	public ZonaMascotaDTO(String horario, double tamanoMaximo, String estadoDeCaneca, String estadoBebederos) {
		super();
		this.horario = horario;
		this.tamanoMaximo = tamanoMaximo;
		this.estadoDeCaneca = estadoDeCaneca;
		this.estadoBebederos = estadoBebederos;
	}

	public ZonaMascotaDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima, String horario, double tamanoMaximo, String estadoDeCaneca, String estadoBebederos) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.horario = horario;
		this.tamanoMaximo = tamanoMaximo;
		this.estadoDeCaneca = estadoDeCaneca;
		this.estadoBebederos = estadoBebederos;
	}

	public ZonaMascotaDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getTamanoMaximo() {
		return tamanoMaximo;
	}

	public void setTamanoMaximo(double tamanoMaximo) {
		this.tamanoMaximo = tamanoMaximo;
	}

	public String getEstadoDeCaneca() {
		return estadoDeCaneca;
	}

	public void setEstadoDeCaneca(String estadoDeCaneca) {
		this.estadoDeCaneca = estadoDeCaneca;
	}

	public String getEstadoBebederos() {
		return estadoBebederos;
	}

	public void setEstadoBebederos(String estadoBebederos) {
		this.estadoBebederos = estadoBebederos;
	}

	@Override
	public String toString() {
		return super.toString() +"ZonaMascota [horario=" + horario + ", tamanoMaximo=" + tamanoMaximo + ", estadoDeCaneca="
				+ estadoDeCaneca + ", estadoBebederos=" + estadoBebederos + "]";
	}
	
	

}
