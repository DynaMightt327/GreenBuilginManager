package co.edu.unbosque.model;

public class CoWorking extends ZonaComun {
	
	private int numPuestos;
	private String estadoInternet;
	
	public CoWorking() {
		// TODO Auto-generated constructor stub
	}

	public CoWorking(int numPuestos, String estadoInternet) {
		super();
		this.numPuestos = numPuestos;
		this.estadoInternet = estadoInternet;
	}

	public CoWorking(int capacidadMaxima, boolean estaDisponible, String horario, int numPuestos,
			String estadoInternet) {
		super(capacidadMaxima, estaDisponible, horario);
		this.numPuestos = numPuestos;
		this.estadoInternet = estadoInternet;
	}

	public CoWorking(int capacidadMaxima, boolean estaDisponible, String horario) {
		super(capacidadMaxima, estaDisponible, horario);
		// TODO Auto-generated constructor stub
	}

	public int getNumPuestos() {
		return numPuestos;
	}

	public void setNumPuestos(int numPuestos) {
		this.numPuestos = numPuestos;
	}

	public String getEstadoInternet() {
		return estadoInternet;
	}

	public void setEstadoInternet(String estadoInternet) {
		this.estadoInternet = estadoInternet;
	}

	@Override
	public String toString() {
		return "CoWorking [numPuestos=" + numPuestos + ", estadoInternet=" + estadoInternet + "]";
	}
	
	
	

}
