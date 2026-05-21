package co.edu.unbosque.model;

public class ParqueInfantil extends ZonaComun {
	
	private String horario;
	private String estado;
	
	public ParqueInfantil() {
		// TODO Auto-generated constructor stub
	}

	public ParqueInfantil(String horario, String estado) {
		super();
		this.horario = horario;
		this.estado = estado;
	}

	public ParqueInfantil(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima,
			String horario, String estado2) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.horario = horario;
		estado = estado2;
	}

	public ParqueInfantil(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ParqueInfantil [horario=" + horario + ", estado=" + estado + "]";
	}
	
	

}
