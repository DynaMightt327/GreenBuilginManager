package co.edu.unbosque.model;

public class ParqueInfantil extends ZonaComun {
	
	private String horario;
	
	public ParqueInfantil() {
		// TODO Auto-generated constructor stub
	}

	public ParqueInfantil(String horario) {
		super();
		this.horario = horario;
	}
	
	

	public ParqueInfantil(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima,
			String horario) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.horario = horario;
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

	@Override
	public String toString() {
		return super.toString() +"ParqueInfantil [horario=" + horario + "]";
	}

	
	
	

}
