package co.edu.unbosque.model;

public class SalonComunal extends ZonaComun {
	
	private boolean tieneCocina;
	private boolean tieneAireAcondicionado;
	private double aream2;
	
	public SalonComunal() {
		// TODO Auto-generated constructor stub
	}

	public SalonComunal(boolean tieneCocina, boolean tieneAireAcondicionado, double aream2) {
		super();
		this.tieneCocina = tieneCocina;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.aream2 = aream2;
	}

	public SalonComunal(int capacidadMaxima, boolean estaDisponible, String horario, String estado, boolean tieneCocina,
			boolean tieneAireAcondicionado, double aream2) {
		super(capacidadMaxima, estaDisponible, horario, estado);
		this.tieneCocina = tieneCocina;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.aream2 = aream2;
	}

	public SalonComunal(int capacidadMaxima, boolean estaDisponible, String horario, String estado) {
		super(capacidadMaxima, estaDisponible, horario, estado);
		// TODO Auto-generated constructor stub
	}

	public boolean isTieneCocina() {
		return tieneCocina;
	}

	public void setTieneCocina(boolean tieneCocina) {
		this.tieneCocina = tieneCocina;
	}

	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	public double getAream2() {
		return aream2;
	}

	public void setAream2(double aream2) {
		this.aream2 = aream2;
	}

	@Override
	public String toString() {
		return super.toString() + "SalonComunal [tieneCocina=" + tieneCocina + ", tieneAireAcondicionado=" + tieneAireAcondicionado
				+ ", aream2=" + aream2 + "]";
	}

}
