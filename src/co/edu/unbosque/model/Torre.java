package co.edu.unbosque.model;

public class Torre {
	
	private int numTorre;
	private int numApartamento;
	private int numeroPiso;
	private String estado;
	private String observacion;
	
	public Torre() {
		// TODO Auto-generated constructor stub
	}

	public Torre(int numTorre, int numApartamento, int numeroPiso, String estado, String observacion) {
		super();
		this.numTorre = numTorre;
		this.numApartamento = numApartamento;
		this.numeroPiso = numeroPiso;
		this.estado = estado;
		this.observacion = observacion;
	}

	public int getNumTorre() {
		return numTorre;
	}

	public void setNumTorre(int numTorre) {
		this.numTorre = numTorre;
	}

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public String toString() {
		return "Torre [numTorre=" + numTorre + ", numApartamento=" + numApartamento + ", numeroPiso=" + numeroPiso
				+ ", estado=" + estado + ", observacion=" + observacion + "]";
	}
	
	

}
