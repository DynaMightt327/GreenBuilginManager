package co.edu.unbosque.view;

public class ViewFacade {
	
	private VentanaInicial vi;
	private VentanaAdministrador va;
	private VentanaResidente vr;
	private VentanaEmpleado ve;
	
	public ViewFacade() {
		vi = new VentanaInicial();
		va = new VentanaAdministrador();
		vr = new VentanaResidente();
		ve = new VentanaEmpleado();
	}

	public VentanaInicial getVi() {
		return vi;
	}

	public void setVi(VentanaInicial vi) {
		this.vi = vi;
	}

	public VentanaAdministrador getVa() {
		return va;
	}

	public void setVa(VentanaAdministrador va) {
		this.va = va;
	}

	public VentanaResidente getVr() {
		return vr;
	}

	public void setVr(VentanaResidente vr) {
		this.vr = vr;
	}

	public VentanaEmpleado getVe() {
		return ve;
	}

	public void setVe(VentanaEmpleado ve) {
		this.ve = ve;
	}

}
