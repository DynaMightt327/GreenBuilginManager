package co.edu.unbosque.model;

public class Torre {
	
	private int numApartamento;
	private int numPiso;
	private int numTorre;
	private String estadoPanelSolar;
	private String estado;
	
	public Torre() {
		// TODO Auto-generated constructor stub
	}

	public Torre(int numApartamento, int numPiso, int numTorre, String estadoPanelSolar, String estado) {
		super();
		this.numApartamento = numApartamento;
		this.numPiso = numPiso;
		this.numTorre = numTorre;
		this.estadoPanelSolar = estadoPanelSolar;
		this.estado = estado;
	}

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}

	public int getNumTorre() {
		return numTorre;
	}

	public void setNumTorre(int numTorre) {
		this.numTorre = numTorre;
	}

	public String getEstadoPanelSolar() {
		return estadoPanelSolar;
	}

	public void setEstadoPanelSolar(String estadoPanelSolar) {
		this.estadoPanelSolar = estadoPanelSolar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Torre [numApartamento=" + numApartamento + ", numPiso=" + numPiso + ", numTorre=" + numTorre
				+ ", estadoPanelSolar=" + estadoPanelSolar + ", estado=" + estado + "]";
	}
	
	

}
