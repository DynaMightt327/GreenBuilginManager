package co.edu.unbosque.model;

public class ZonaBbq extends ZonaComun {
	
	private int numParrilla;
	private int estadoAsadero;
	private int numSilla;
	private String ultimoMantenimiento;
	
	public ZonaBbq() {
		// TODO Auto-generated constructor stub
	}

	public ZonaBbq(int numParrilla, int estadoAsadero, int numSilla, String ultimoMantenimiento) {
		super();
		this.numParrilla = numParrilla;
		this.estadoAsadero = estadoAsadero;
		this.numSilla = numSilla;
		this.ultimoMantenimiento = ultimoMantenimiento;
	}

	public ZonaBbq(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima,
			int numParrilla, int estadoAsadero, int numSilla, String ultimoMantenimiento) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.numParrilla = numParrilla;
		this.estadoAsadero = estadoAsadero;
		this.numSilla = numSilla;
		this.ultimoMantenimiento = ultimoMantenimiento;
	}

	public ZonaBbq(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public int getNumParrilla() {
		return numParrilla;
	}

	public void setNumParrilla(int numParrilla) {
		this.numParrilla = numParrilla;
	}

	public int getEstadoAsadero() {
		return estadoAsadero;
	}

	public void setEstadoAsadero(int estadoAsadero) {
		this.estadoAsadero = estadoAsadero;
	}

	public int getNumSilla() {
		return numSilla;
	}

	public void setNumSilla(int numSilla) {
		this.numSilla = numSilla;
	}

	public String getUltimoMantenimiento() {
		return ultimoMantenimiento;
	}

	public void setUltimoMantenimiento(String ultimoMantenimiento) {
		this.ultimoMantenimiento = ultimoMantenimiento;
	}

	@Override
	public String toString() {
		return "ZonaBbq [numParrilla=" + numParrilla + ", estadoAsadero=" + estadoAsadero + ", numSilla=" + numSilla
				+ ", ultimoMantenimiento=" + ultimoMantenimiento + "]";
	}
	
	

}
