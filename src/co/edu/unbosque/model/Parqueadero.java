package co.edu.unbosque.model;

public class Parqueadero {
	
	private int numeroParqueadero;
	private String estado;
	
	public Parqueadero() {
		// TODO Auto-generated constructor stub
	}

	public Parqueadero(int numeroParqueadero, String estado) {
		super();
		this.numeroParqueadero = numeroParqueadero;
		this.estado = estado;
	}

	public int getNumeroParqueadero() {
		return numeroParqueadero;
	}

	public void setNumeroParqueadero(int numeroParqueadero) {
		this.numeroParqueadero = numeroParqueadero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Parqueadero [numeroParqueadero=" + numeroParqueadero + ", estado=" + estado + "]";
	}
	
	

}
