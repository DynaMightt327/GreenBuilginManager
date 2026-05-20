package co.edu.unbosque.view;

public class ViewFacade {
	
	private VentanaInicial vp;
	private VentanaResidente vr;
	private VentanaAdministrador va;
	private VentanaEmpleado ve;
	
	public ViewFacade() {
		vp = new VentanaInicial();
		vr = new VentanaResidente();
		va = new VentanaAdministrador();
		ve = new VentanaEmpleado();
	}

	public VentanaInicial getVp() {
		return vp;
	}

	public void setVp(VentanaInicial vp) {
		this.vp = vp;
	}

	public VentanaResidente getVr() {
		return vr;
	}

	public void setVr(VentanaResidente vi) {
		this.vr = vi;
	}

	public VentanaAdministrador getVa() {
		return va;
	}

	public void setVa(VentanaAdministrador va) {
		this.va = va;
	}

	public VentanaEmpleado getVe() {
		return ve;
	}

	public void setVe(VentanaEmpleado ve) {
		this.ve = ve;
	}
	
}
