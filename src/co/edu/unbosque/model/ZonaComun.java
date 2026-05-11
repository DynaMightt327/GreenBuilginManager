package co.edu.unbosque.model;

public abstract class ZonaComun {
	
	private String nombre;
	private int capacidadMaxima;
	private boolean estaDisponible;
	private String horario;
	
	public ZonaComun() {
		// TODO Auto-generated constructor stub
	}

	public ZonaComun(String nombre, int capacidadMaxima, boolean estaDisponible, String horario) {
		super();
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
		this.estaDisponible = estaDisponible;
		this.horario = horario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "ZonaComun [nombre=" + nombre + ", capacidadMaxima=" + capacidadMaxima + ", estaDisponible="
				+ estaDisponible + ", horario=" + horario + "]";
	}
	
	

}
