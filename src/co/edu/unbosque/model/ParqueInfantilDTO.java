package co.edu.unbosque.model;

public class ParqueInfantilDTO extends ZonaComun {

	private String horario;

	public ParqueInfantilDTO() {
		// TODO Auto-generated constructor stub
	}

	public ParqueInfantilDTO(String horario) {
		super();
		this.horario = horario;
	}

	public ParqueInfantilDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima,
			String horario) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.horario = horario;
	}

	public ParqueInfantilDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
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
		return super.toString() + "ParqueInfantil [horario=" + horario + "]";
	}

}
