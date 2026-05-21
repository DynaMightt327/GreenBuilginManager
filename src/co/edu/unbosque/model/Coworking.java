package co.edu.unbosque.model;

public class Coworking extends ZonaComun {
	
	private int numeroDePuesto;
	private boolean tieneComputadores;
	private boolean tieneAccesoAInternet;
	
	public Coworking() {
		// TODO Auto-generated constructor stub
	}

	public Coworking(int numeroDePuesto, boolean tieneComputadores, boolean tieneAccesoAInternet) {
		super();
		this.numeroDePuesto = numeroDePuesto;
		this.tieneComputadores = tieneComputadores;
		this.tieneAccesoAInternet = tieneAccesoAInternet;
	}

	public Coworking(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima,
			int numeroDePuesto, boolean tieneComputadores, boolean tieneAccesoAInternet) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.numeroDePuesto = numeroDePuesto;
		this.tieneComputadores = tieneComputadores;
		this.tieneAccesoAInternet = tieneAccesoAInternet;
	}

	public Coworking(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroDePuesto() {
		return numeroDePuesto;
	}

	public void setNumeroDePuesto(int numeroDePuesto) {
		this.numeroDePuesto = numeroDePuesto;
	}

	public boolean isTieneComputadores() {
		return tieneComputadores;
	}

	public void setTieneComputadores(boolean tieneComputadores) {
		this.tieneComputadores = tieneComputadores;
	}

	public boolean isTieneAccesoAInternet() {
		return tieneAccesoAInternet;
	}

	public void setTieneAccesoAInternet(boolean tieneAccesoAInternet) {
		this.tieneAccesoAInternet = tieneAccesoAInternet;
	}

	@Override
	public String toString() {
		return super.toString() +"Coworking [numeroDePuesto=" + numeroDePuesto + ", tieneComputadores=" + tieneComputadores
				+ ", tieneAccesoAInternet=" + tieneAccesoAInternet + "]";
	}
	
	

}
