package co.edu.unbosque.view;

public class ViewFacade {
	
	private VentanaPrincipal vp;
	private VentanaIngresar vi;
	private VentanaAdministrador va;
	
	public ViewFacade() {
		vp = new VentanaPrincipal();
		vi = new VentanaIngresar();
		va = new VentanaAdministrador();
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

	public VentanaIngresar getVi() {
		return vi;
	}

	public void setVi(VentanaIngresar vi) {
		this.vi = vi;
	}

	public VentanaAdministrador getVa() {
		return va;
	}

	public void setVa(VentanaAdministrador va) {
		this.va = va;
	}
	
}
