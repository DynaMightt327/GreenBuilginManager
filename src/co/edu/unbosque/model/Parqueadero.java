package co.edu.unbosque.model;

public class Parqueadero extends ZonaComun {
	
	private int numParqueadero;
	private int numeroPuesto;
	
	public Parqueadero() {
		// TODO Auto-generated constructor stub
	}

	public Parqueadero(int numParqueadero, int numeroPuesto) {
		super();
		this.numParqueadero = numParqueadero;
		this.numeroPuesto = numeroPuesto;
	}

	public Parqueadero(String nombre, int capacidadMaxima, boolean estaDisponible, String horario, int numParqueadero,
			int numeroPuesto) {
		super(nombre, capacidadMaxima, estaDisponible, horario);
		this.numParqueadero = numParqueadero;
		this.numeroPuesto = numeroPuesto;
	}

	public Parqueadero(String nombre, int capacidadMaxima, boolean estaDisponible, String horario) {
		super(nombre, capacidadMaxima, estaDisponible, horario);
		// TODO Auto-generated constructor stub
	}

	public int getNumParqueadero() {
		return numParqueadero;
	}

	public void setNumParqueadero(int numParqueadero) {
		this.numParqueadero = numParqueadero;
	}

	public int getNumeroPuesto() {
		return numeroPuesto;
	}

	public void setNumeroPuesto(int numeroPuesto) {
		this.numeroPuesto = numeroPuesto;
	}

	@Override
	public String toString() {
		return super.toString()+"Parqueadero [numParqueadero=" + numParqueadero + ", numeroPuesto=" + numeroPuesto + "]";
	}
	
	
	

}
