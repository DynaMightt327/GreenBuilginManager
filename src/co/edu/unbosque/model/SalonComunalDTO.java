package co.edu.unbosque.model;

public class SalonComunalDTO extends ZonaComun {
	
	private String horario;
	private String ultimoMantenimiento;
	private int cantidadSilla;
	
	public SalonComunalDTO() {
		// TODO Auto-generated constructor stub
	}

	public SalonComunalDTO(String horario, String ultimoMantenimiento, int cantidadSilla) {
		super();
		this.horario = horario;
		this.ultimoMantenimiento = ultimoMantenimiento;
		this.cantidadSilla = cantidadSilla;
	}

	public SalonComunalDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima, String horario, String ultimoMantenimiento, int cantidadSilla) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		this.horario = horario;
		this.ultimoMantenimiento = ultimoMantenimiento;
		this.cantidadSilla = cantidadSilla;
	}

	public SalonComunalDTO(String estado, int medidaCuadrada, boolean estaDisponible, int capacidadMaxima) {
		super(estado, medidaCuadrada, estaDisponible, capacidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getUltimoMantenimiento() {
		return ultimoMantenimiento;
	}

	public void setUltimoMantenimiento(String ultimoMantenimiento) {
		this.ultimoMantenimiento = ultimoMantenimiento;
	}

	public int getCantidadSilla() {
		return cantidadSilla;
	}

	public void setCantidadSilla(int cantidadSilla) {
		this.cantidadSilla = cantidadSilla;
	}

	@Override
	public String toString() {
		return "SalonComunal [horario=" + horario + ", ultimoMantenimiento=" + ultimoMantenimiento + ", cantidadSilla="
				+ cantidadSilla + "]";
	}
	
	

}
