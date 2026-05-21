package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelRegistrarVisitante extends JPanel{
	
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
	private JLabel torre;
	private JLabel piso;
	private JLabel apartamento;
	private JLabel esFrecuente;
 
	private JTextField tnombre;
	private JTextField tapellido;
	private JTextField tedad;
	private JComboBox<String> tgenero;
	private JTextField tcorreo;
	private JTextField tid;
	private JTextField ttelefono;
	private JComboBox<String> testado;
	private JPasswordField tcontrasena;
	private JButton trutaFoto;
	private JLabel tfotoPreview;
	private JTextField ttorre;
	private JTextField tpiso;
	private JTextField tapartamento;
	private JComboBox<String> tesFrecuente;
 
	private JButton volver;
	private JButton guardar;
 
	public PanelRegistrarVisitante() {
		iniComponentes();
		setVisible(false);
	}
 
	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#ddd3f2"));
 
		// --- Columna izquierda ---
 
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
 
		tgenero = new JComboBox<String>(new String[] { "...", "Femenino", "Masculino" });
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
 
		// --- Columna central ---
 
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
 
		testado = new JComboBox<String>(new String[] { "...", "Activo", "Inactivo" });
		testado.setBounds(380, 175, 200, 25);
		add(testado);
 
		contrasena = new JLabel("Contraseña");
		contrasena.setBounds(380, 215, 150, 20);
		add(contrasena);
 
		tcontrasena = new JPasswordField();
		tcontrasena.setBounds(380, 240, 200, 25);
		add(tcontrasena);
 
		esFrecuente = new JLabel("¿Es visitante frecuente?");
		esFrecuente.setBounds(380, 280, 200, 20);
		add(esFrecuente);
 
		tesFrecuente = new JComboBox<String>(new String[] { "...", "Sí", "No" });
		tesFrecuente.setBounds(380, 305, 200, 25);
		add(tesFrecuente);
 
		guardar = new JButton("GUARDAR");
		guardar.setBounds(380, 370, 150, 30);
		guardar.setBackground(Color.decode("#F9CFCE"));
		guardar.setFocusPainted(false);
		guardar.setBorderPainted(false);
		add(guardar);
 
		// --- Columna derecha ---
 
		torre = new JLabel("Torre");
		torre.setBounds(730, 20, 150, 20);
		add(torre);
 
		ttorre = new JTextField();
		ttorre.setBounds(730, 45, 200, 25);
		add(ttorre);
 
		piso = new JLabel("Piso");
		piso.setBounds(730, 85, 150, 20);
		add(piso);
 
		tpiso = new JTextField();
		tpiso.setBounds(730, 110, 200, 25);
		add(tpiso);
 
		apartamento = new JLabel("Apartamento");
		apartamento.setBounds(730, 150, 150, 20);
		add(apartamento);
 
		tapartamento = new JTextField();
		tapartamento.setBounds(730, 175, 200, 25);
		add(tapartamento);
 
		rutaFoto = new JLabel("Foto de perfil");
		rutaFoto.setBounds(730, 215, 150, 20);
		add(rutaFoto);
 
		tfotoPreview = new JLabel();
		tfotoPreview.setBounds(730, 240, 100, 100);
		tfotoPreview.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		add(tfotoPreview);
 
		trutaFoto = new JButton("SUBIR FOTO");
		trutaFoto.setBounds(730, 350, 150, 30);
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

	public JLabel getTorre() {
		return torre;
	}

	public void setTorre(JLabel torre) {
		this.torre = torre;
	}

	public JLabel getPiso() {
		return piso;
	}

	public void setPiso(JLabel piso) {
		this.piso = piso;
	}

	public JLabel getApartamento() {
		return apartamento;
	}

	public void setApartamento(JLabel apartamento) {
		this.apartamento = apartamento;
	}

	public JLabel getEsFrecuente() {
		return esFrecuente;
	}

	public void setEsFrecuente(JLabel esFrecuente) {
		this.esFrecuente = esFrecuente;
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

	public JButton getTrutaFoto() {
		return trutaFoto;
	}

	public void setTrutaFoto(JButton trutaFoto) {
		this.trutaFoto = trutaFoto;
	}

	public JLabel getTfotoPreview() {
		return tfotoPreview;
	}

	public void setTfotoPreview(JLabel tfotoPreview) {
		this.tfotoPreview = tfotoPreview;
	}

	public JTextField getTtorre() {
		return ttorre;
	}

	public void setTtorre(JTextField ttorre) {
		this.ttorre = ttorre;
	}

	public JTextField getTpiso() {
		return tpiso;
	}

	public void setTpiso(JTextField tpiso) {
		this.tpiso = tpiso;
	}

	public JTextField getTapartamento() {
		return tapartamento;
	}

	public void setTapartamento(JTextField tapartamento) {
		this.tapartamento = tapartamento;
	}

	public JComboBox<String> getTesFrecuente() {
		return tesFrecuente;
	}

	public void setTesFrecuente(JComboBox<String> tesFrecuente) {
		this.tesFrecuente = tesFrecuente;
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
