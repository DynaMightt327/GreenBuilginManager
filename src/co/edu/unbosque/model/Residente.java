package co.edu.unbosque.model;

public class Residente extends Persona {
	
	private String tipo;
	private int torre;
	private int apartamento;
	private int piso;
	private boolean tieneReporte;
	private int numeroReporte;
	private String contenidoReporte;
	private boolean tieneMulta;
	private int costoMulta;
	private String razonMulta;
	private int cantidadDeMulta;
	private boolean tieneParqueadero;
	private int numeroParqueadero;
	private boolean  tieneBicicletero;
	private boolean tieneCargadorDeCarro;
	
	public Residente() {
		// TODO Auto-generated constructor stub
	}

	public Residente(int torre, int apartamento, int piso, boolean tieneReporte, int numeroReporte,
			String contenidoReporte, boolean tieneMulta, int costoMulta, String razonMulta, int cantidadDeMulta,
			boolean tieneParqueadero, int numeroParqueadero, boolean tieneBicicletero, boolean tieneCargadorDeCarro) {
		super();
		this.torre = torre;
		this.apartamento = apartamento;
		this.piso = piso;
		this.tieneReporte = tieneReporte;
		this.numeroReporte = numeroReporte;
		this.contenidoReporte = contenidoReporte;
		this.tieneMulta = tieneMulta;
		this.costoMulta = costoMulta;
		this.razonMulta = razonMulta;
		this.cantidadDeMulta = cantidadDeMulta;
		this.tieneParqueadero = tieneParqueadero;
		this.numeroParqueadero = numeroParqueadero;
		this.tieneBicicletero = tieneBicicletero;
		this.tieneCargadorDeCarro = tieneCargadorDeCarro;
	}

	public Residente(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena, int torre, int apartamento, int piso,
			boolean tieneReporte, int numeroReporte, String contenidoReporte, boolean tieneMulta, int costoMulta,
			String razonMulta, int cantidadDeMulta, boolean tieneParqueadero, int numeroParqueadero,
			boolean tieneBicicletero, boolean tieneCargadorDeCarro) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		this.torre = torre;
		this.apartamento = apartamento;
		this.piso = piso;
		this.tieneReporte = tieneReporte;
		this.numeroReporte = numeroReporte;
		this.contenidoReporte = contenidoReporte;
		this.tieneMulta = tieneMulta;
		this.costoMulta = costoMulta;
		this.razonMulta = razonMulta;
		this.cantidadDeMulta = cantidadDeMulta;
		this.tieneParqueadero = tieneParqueadero;
		this.numeroParqueadero = numeroParqueadero;
		this.tieneBicicletero = tieneBicicletero;
		this.tieneCargadorDeCarro = tieneCargadorDeCarro;
	}

	public Residente(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTorre() {
		return torre;
	}

	public void setTorre(int torre) {
		this.torre = torre;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public boolean isTieneReporte() {
		return tieneReporte;
	}

	public void setTieneReporte(boolean tieneReporte) {
		this.tieneReporte = tieneReporte;
	}

	public int getNumeroReporte() {
		return numeroReporte;
	}

	public void setNumeroReporte(int numeroReporte) {
		this.numeroReporte = numeroReporte;
	}

	public String getContenidoReporte() {
		return contenidoReporte;
	}

	public void setContenidoReporte(String contenidoReporte) {
		this.contenidoReporte = contenidoReporte;
	}

	public boolean isTieneMulta() {
		return tieneMulta;
	}

	public void setTieneMulta(boolean tieneMulta) {
		this.tieneMulta = tieneMulta;
	}

	public int getCostoMulta() {
		return costoMulta;
	}

	public void setCostoMulta(int costoMulta) {
		this.costoMulta = costoMulta;
	}

	public String getRazonMulta() {
		return razonMulta;
	}

	public void setRazonMulta(String razonMulta) {
		this.razonMulta = razonMulta;
	}

	public int getCantidadDeMulta() {
		return cantidadDeMulta;
	}

	public void setCantidadDeMulta(int cantidadDeMulta) {
		this.cantidadDeMulta = cantidadDeMulta;
	}

	public boolean isTieneParqueadero() {
		return tieneParqueadero;
	}

	public void setTieneParqueadero(boolean tieneParqueadero) {
		this.tieneParqueadero = tieneParqueadero;
	}

	public int getNumeroParqueadero() {
		return numeroParqueadero;
	}

	public void setNumeroParqueadero(int numeroParqueadero) {
		this.numeroParqueadero = numeroParqueadero;
	}

	public boolean isTieneBicicletero() {
		return tieneBicicletero;
	}

	public void setTieneBicicletero(boolean tieneBicicletero) {
		this.tieneBicicletero = tieneBicicletero;
	}

	public boolean isTieneCargadorDeCarro() {
		return tieneCargadorDeCarro;
	}

	public void setTieneCargadorDeCarro(boolean tieneCargadorDeCarro) {
		this.tieneCargadorDeCarro = tieneCargadorDeCarro;
	}

	@Override
	public String toString() {
		return super.toString() +"Residente [tipo=" + tipo + ", torre=" + torre + ", apartamento=" + apartamento + ", piso=" + piso + ", tieneReporte="
				+ tieneReporte + ", numeroReporte=" + numeroReporte + ", contenidoReporte=" + contenidoReporte
				+ ", tieneMulta=" + tieneMulta + ", costoMulta=" + costoMulta + ", razonMulta=" + razonMulta
				+ ", cantidadDeMulta=" + cantidadDeMulta + ", tieneParqueadero=" + tieneParqueadero
				+ ", numeroParqueadero=" + numeroParqueadero + ", tieneBicicletero=" + tieneBicicletero
				+ ", tieneCargadorDeCarro=" + tieneCargadorDeCarro + "]";
	}
	
	

}
