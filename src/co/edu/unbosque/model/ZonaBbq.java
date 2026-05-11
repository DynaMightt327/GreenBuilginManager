package co.edu.unbosque.model;

public class ZonaBbq extends ZonaComun {
	
	private int numParrilla;
	private boolean requiereDeposito;
	private String tipoParrilla;
	
	public ZonaBbq() {
		// TODO Auto-generated constructor stub
	}

	public ZonaBbq(int numParrilla, boolean requiereDeposito, String tipoParrilla) {
		super();
		this.numParrilla = numParrilla;
		this.requiereDeposito = requiereDeposito;
		this.tipoParrilla = tipoParrilla;
	}

	public ZonaBbq(String nombre, int capacidadMaxima, boolean estaDisponible, String horario, int numParrilla,
			boolean requiereDeposito, String tipoParrilla) {
		super(nombre, capacidadMaxima, estaDisponible, horario);
		this.numParrilla = numParrilla;
		this.requiereDeposito = requiereDeposito;
		this.tipoParrilla = tipoParrilla;
	}

	public ZonaBbq(String nombre, int capacidadMaxima, boolean estaDisponible, String horario) {
		super(nombre, capacidadMaxima, estaDisponible, horario);
		// TODO Auto-generated constructor stub
	}

	public int getNumParrilla() {
		return numParrilla;
	}

	public void setNumParrilla(int numParrilla) {
		this.numParrilla = numParrilla;
	}

	public boolean isRequiereDeposito() {
		return requiereDeposito;
	}

	public void setRequiereDeposito(boolean requiereDeposito) {
		this.requiereDeposito = requiereDeposito;
	}

	public String getTipoParrilla() {
		return tipoParrilla;
	}

	public void setTipoParrilla(String tipoParrilla) {
		this.tipoParrilla = tipoParrilla;
	}

	@Override
	public String toString() {
		return super.toString()+"ZonaBbq [numParrilla=" + numParrilla + ", requiereDeposito=" + requiereDeposito + ", tipoParrilla="
				+ tipoParrilla + "]";
	}
	
	

}
