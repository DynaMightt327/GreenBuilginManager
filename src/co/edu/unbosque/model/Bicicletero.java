package co.edu.unbosque.model;

public class Bicicletero {
	
	private int numPuesto;
	private int capacidadMaxima;
	private String estado;
	private int numBicicletero;
	
	public Bicicletero() {
		// TODO Auto-generated constructor stub
	}

	public Bicicletero(int numPuesto, int capacidadMaxima, String estado, int numBicicletero) {
		super();
		this.numPuesto = numPuesto;
		this.capacidadMaxima = capacidadMaxima;
		this.estado = estado;
		this.numBicicletero = numBicicletero;
	}

	public int getNumPuesto() {
		return numPuesto;
	}

	public void setNumPuesto(int numPuesto) {
		this.numPuesto = numPuesto;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumBicicletero() {
		return numBicicletero;
	}

	public void setNumBicicletero(int numBicicletero) {
		this.numBicicletero = numBicicletero;
	}

	@Override
	public String toString() {
		return "Bicicletero [numPuesto=" + numPuesto + ", capacidadMaxima=" + capacidadMaxima + ", estado=" + estado
				+ ", numBicicletero=" + numBicicletero + "]";
	}
	
	

}
