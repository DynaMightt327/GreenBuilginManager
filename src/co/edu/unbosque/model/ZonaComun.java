package co.edu.unbosque.model;

public class ZonaComun {
	
	private String estado;
	private int medidaCuadrada;
	private boolean estaDisponible;
	private int capacidadMaxima;
	
	public ZonaComun() {
		// TODO Auto-generated constructor stub
	}

	public ZonaComun(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super();
		this.estado = estado;
		this.medidaCuadrada = medidaCuadrada;
		this.estaDisponible = estaDisponible;
		this.capacidadMaxima = capacidadMaxima;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getMedidaCuadrada() {
		return medidaCuadrada;
	}

	public void setMedidaCuadrada(int medidaCuadrada) {
		this.medidaCuadrada = medidaCuadrada;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	@Override
	public String toString() {
		return "ZonaComun [estado=" + estado + ", medidaCuadrada=" + medidaCuadrada + ", estaDisponible="
				+ estaDisponible + ", capacidadMaxima=" + capacidadMaxima + "]";
	}
	
	

}
