package co.edu.unbosque.model;

public abstract class ZonaComun {
	
	private int capacidadMaxima;
	private boolean estaDisponible;
	private String horario;
	private String estado;
	
	public ZonaComun() {
		// TODO Auto-generated constructor stub
	}

	public ZonaComun( int capacidadMaxima, boolean estaDisponible, String horario, String estado) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.estaDisponible = estaDisponible;
		this.horario = horario;
		this.estado = estado;
	}


	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ZonaComun [capacidadMaxima=" + capacidadMaxima + ", estaDisponible=" + estaDisponible + ", horario="
				+ horario + ", estado=" + estado + "]";
	}

	
	
	

}
