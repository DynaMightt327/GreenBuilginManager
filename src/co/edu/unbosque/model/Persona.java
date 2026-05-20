package co.edu.unbosque.model;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String correo;
	private long id;
	private long telefono;
	private String rutaFoto;
	private String estado;
	private String contrasena;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, int edad, String genero, String correo, long id, long telefono,
			String rutaFoto, String estado, String contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
		this.id = id;
		this.telefono = telefono;
		this.rutaFoto = rutaFoto;
		this.estado = estado;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", correo=" + correo + ", id=" + id + ", telefono=" + telefono + ", rutaFoto=" + rutaFoto
				+ ", estado=" + estado + ", contrasena=" + contrasena + "]";
	}
	
	

}
