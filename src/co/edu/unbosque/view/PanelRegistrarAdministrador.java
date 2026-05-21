package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelRegistrarAdministrador extends JPanel{
	
	private JLabel nombre;
	private JLabel apellido;
	private JLabel edad;
	private JLabel genero;
	private JLabel correo;
	private JLabel id;
	private JLabel telefono;
	private JLabel estado;
	private JLabel contrasena;
	private JLabel rutaFoto;
	private JLabel fotoPreview;
	private JLabel conjuntoACargo;
	private JLabel salario;
	private JLabel tipoContrato;

	private JTextField tnombre;
	private JTextField tapellido;
	private JTextField tedad;
	private JComboBox<String> tgenero;
	private JTextField tcorreo;
	private JTextField tid;
	private JTextField ttelefono;
	private JButton trutaFoto;
	private JComboBox<String> testado;
	private JPasswordField tcontrasena;
	private JTextField tconjuntoACargo;
	private JTextField tsalario;
	private JComboBox<String> ttipoContrato;
	
	private JButton volver;
	private JButton guardar;
	
	public PanelRegistrarAdministrador() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#ddd3f2"));

		nombre = new JLabel("Nombre/s");
		nombre.setBounds(30, 20, 150, 20);
		add(nombre);

		tnombre = new JTextField();
		tnombre.setBounds(30, 45, 200, 25);
		add(tnombre);

		apellido = new JLabel("Apellidos");
		apellido.setBounds(30, 85, 150, 20);
		add(apellido);

		tapellido = new JTextField();
		tapellido.setBounds(30, 110, 200, 25);
		add(tapellido);

		genero = new JLabel("Género");
		genero.setBounds(30, 150, 150, 20);
		add(genero);

		tgenero = new JComboBox<String>(new String[] {"...", "Femenino", "Masculino"});
		tgenero.setBounds(30, 175, 200, 25);
		add(tgenero);

		edad = new JLabel("Fecha de nacimiento (DD/MM/AAAA)");
		edad.setBounds(30, 215, 250, 20);
		add(edad);

		tedad = new JTextField();
		tedad.setBounds(30, 240, 200, 25);
		add(tedad);

		correo = new JLabel("Correo electrónico");
		correo.setBounds(30, 280, 150, 20);
		add(correo);

		tcorreo = new JTextField();
		tcorreo.setBounds(30, 305, 200, 25);
		add(tcorreo);

		volver = new JButton("VOLVER");
		volver.setBounds(30, 370, 150, 30);
		volver.setBackground(Color.decode("#F9CFCE"));
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		add(volver);

		id = new JLabel("Número de documento");
		id.setBounds(380, 20, 200, 20);
		add(id);

		tid = new JTextField();
		tid.setBounds(380, 45, 200, 25);
		add(tid);

		telefono = new JLabel("Teléfono");
		telefono.setBounds(380, 85, 150, 20);
		add(telefono);

		ttelefono = new JTextField();
		ttelefono.setBounds(380, 110, 200, 25);
		add(ttelefono);

		estado = new JLabel("Estado");
		estado.setBounds(380, 150, 150, 20);
		add(estado);

		testado = new JComboBox<String>(new String[] {"...", "Activo", "Inactivo"});
		testado.setBounds(380, 175, 200, 25);
		add(testado);

		contrasena = new JLabel("Contraseña");
		contrasena.setBounds(380, 215, 150, 20);
		add(contrasena);

		tcontrasena = new JPasswordField();
		tcontrasena.setBounds(380, 240, 200, 25);
		add(tcontrasena);

		conjuntoACargo = new JLabel("Conjunto a cargo");
		conjuntoACargo.setBounds(380, 280, 150, 20);
		add(conjuntoACargo);

		tconjuntoACargo = new JTextField();
		tconjuntoACargo.setBounds(380, 305, 200, 25);
		add(tconjuntoACargo);

		guardar = new JButton("GUARDAR");
		guardar.setBounds(380, 370, 150, 30);
		guardar.setBackground(Color.decode("#F9CFCE"));
		guardar.setFocusPainted(false);
		guardar.setBorderPainted(false);
		add(guardar);

		salario = new JLabel("Salario");
		salario.setBounds(730, 20, 150, 20);
		add(salario);

		tsalario = new JTextField();
		tsalario.setBounds(730, 45, 200, 25);
		add(tsalario);

		tipoContrato = new JLabel("Tipo de contrato");
		tipoContrato.setBounds(730, 85, 150, 20);
		add(tipoContrato);

		ttipoContrato = new JComboBox<String>(new String[] {"...", "Indefinido", "Fijo"});
		ttipoContrato.setBounds(730, 110, 200, 25);
		add(ttipoContrato);

		rutaFoto = new JLabel("Foto de perfil");
		rutaFoto.setBounds(730, 150, 150, 20);
		add(rutaFoto);

		fotoPreview = new JLabel();
		fotoPreview.setBounds(730, 175, 100, 100);
		fotoPreview.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		add(fotoPreview);

		trutaFoto = new JButton("SUBIR FOTO");
		trutaFoto.setBounds(730, 285, 150, 30);
		trutaFoto.setBackground(Color.decode("#F9CFCE"));
		trutaFoto.setFocusPainted(false);
		trutaFoto.setBorderPainted(false);
		add(trutaFoto);
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido() {
		return apellido;
	}

	public void setApellido(JLabel apellido) {
		this.apellido = apellido;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getEstado() {
		return estado;
	}

	public void setEstado(JLabel estado) {
		this.estado = estado;
	}

	public JLabel getContrasena() {
		return contrasena;
	}

	public void setContrasena(JLabel contrasena) {
		this.contrasena = contrasena;
	}

	public JLabel getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(JLabel rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public JLabel getFotoPreview() {
		return fotoPreview;
	}

	public void setFotoPreview(JLabel fotoPreview) {
		this.fotoPreview = fotoPreview;
	}

	public JLabel getConjuntoACargo() {
		return conjuntoACargo;
	}

	public void setConjuntoACargo(JLabel conjuntoACargo) {
		this.conjuntoACargo = conjuntoACargo;
	}

	public JLabel getSalario() {
		return salario;
	}

	public void setSalario(JLabel salario) {
		this.salario = salario;
	}

	public JLabel getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(JLabel tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public JTextField getTnombre() {
		return tnombre;
	}

	public void setTnombre(JTextField tnombre) {
		this.tnombre = tnombre;
	}

	public JTextField getTapellido() {
		return tapellido;
	}

	public void setTapellido(JTextField tapellido) {
		this.tapellido = tapellido;
	}

	public JTextField getTedad() {
		return tedad;
	}

	public void setTedad(JTextField tedad) {
		this.tedad = tedad;
	}

	public JComboBox<String> getTgenero() {
		return tgenero;
	}

	public void setTgenero(JComboBox<String> tgenero) {
		this.tgenero = tgenero;
	}

	public JTextField getTcorreo() {
		return tcorreo;
	}

	public void setTcorreo(JTextField tcorreo) {
		this.tcorreo = tcorreo;
	}

	public JTextField getTid() {
		return tid;
	}

	public void setTid(JTextField tid) {
		this.tid = tid;
	}

	public JTextField getTtelefono() {
		return ttelefono;
	}

	public void setTtelefono(JTextField ttelefono) {
		this.ttelefono = ttelefono;
	}

	public JButton getTrutaFoto() {
		return trutaFoto;
	}

	public void setTrutaFoto(JButton trutaFoto) {
		this.trutaFoto = trutaFoto;
	}

	public JComboBox<String> getTestado() {
		return testado;
	}

	public void setTestado(JComboBox<String> testado) {
		this.testado = testado;
	}

	public JPasswordField getTcontrasena() {
		return tcontrasena;
	}

	public void setTcontrasena(JPasswordField tcontrasena) {
		this.tcontrasena = tcontrasena;
	}

	public JTextField getTconjuntoACargo() {
		return tconjuntoACargo;
	}

	public void setTconjuntoACargo(JTextField tconjuntoACargo) {
		this.tconjuntoACargo = tconjuntoACargo;
	}

	public JTextField getTsalario() {
		return tsalario;
	}

	public void setTsalario(JTextField tsalario) {
		this.tsalario = tsalario;
	}

	public JComboBox<String> getTtipoContrato() {
		return ttipoContrato;
	}

	public void setTtipoContrato(JComboBox<String> ttipoContrato) {
		this.ttipoContrato = ttipoContrato;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}
	
	
}
