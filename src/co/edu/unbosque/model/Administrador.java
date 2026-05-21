package co.edu.unbosque.model;

public class Administrador extends Persona {
	
	private String conjuntoACargo;
	private double salario;
	private String tipoContrato;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String conjuntoACargo, double salario, String tipoContrato) {
		super();
		this.conjuntoACargo = conjuntoACargo;
		this.salario = salario;
		this.tipoContrato = tipoContrato;
	}

	public Administrador(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena, String conjuntoACargo, double salario,
			String tipoContrato) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		this.conjuntoACargo = conjuntoACargo;
		this.salario = salario;
		this.tipoContrato = tipoContrato;
	}

	public Administrador(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena) {
		super(nombre, apellido, edad, genero, correo, id, telefono, rutaFoto, estado, contrasena);
		// TODO Auto-generated constructor stub
	}

	public String getConjuntoACargo() {
		return conjuntoACargo;
	}

	public void setConjuntoACargo(String conjuntoACargo) {
		this.conjuntoACargo = conjuntoACargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrador [conjuntoACargo=" + conjuntoACargo + ", salario=" + salario + ", tipoContrato="
				+ tipoContrato + "]";
	}
	
	

}
