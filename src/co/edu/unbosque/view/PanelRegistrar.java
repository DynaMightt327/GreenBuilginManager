package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistrar extends JPanel{
	
	private PanelRegistrarResidente prr;
	
	private JLabel titulo;
	private JLabel info;
	
	private JLabel nombre;
	private JLabel apellido;
	private JLabel edad;
	private JLabel genero;
	private JLabel correo;
	private JLabel id;
	private JLabel telefono;
	private JLabel rutaFoto;
	private JLabel estado;
	private JLabel tipoPersona;
	
	private JTextField tnombre;
	private JTextField tapellido;
	private JTextField tedad;
	private JComboBox<String> tgenero;
	private JTextField tcorreo;
	private JTextField tid;
	private JTextField ttelefono;
	private JButton trutaFoto;
	private JComboBox<String> testado;
	private JComboBox ttipoPersona;
	
	// atributos residente
	private JLabel tipo;
	private JLabel numeroApartamento;
	private JLabel torre;
	private JLabel parqueaderoAsignado;
	private JLabel mascotaRegistrada;
	private JLabel vehiculoRegistrado;
	private JLabel tieneCargadorDeAuto;
	private JLabel tieneBicicleta;
	private JLabel numBicicletero;
	private JLabel tienePaquete;
	private JLabel tieneMulta;
	private JLabel datoPaquete;
	private JLabel datoMulta;
	private JLabel fechaDeInicio;
	
	public PanelRegistrar() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(110, 0, 740, 720);
		this.setLayout(null);
		this.setBackground(Color.white);
		
		prr = new PanelRegistrarResidente();
		prr.setVisible(false);
		add(prr);
		
		titulo = new JLabel("-> Registro de nuevo usuario");
		titulo.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		titulo.setBounds(50, 50, 550, 58);
		add(titulo);
		
		info = new JLabel("Completa todos los campos para guardar correctamente la información");
		info.setFont(new Font("Noto Sans", Font.PLAIN, 12));
		info.setBounds(50, 90, 549, 20);
		add(info);
		
		nombre = new JLabel("Nombre/s");
		nombre.setBounds(30, 110, 150, 20);
		add(nombre);

		tnombre = new JTextField();
		tnombre.setBounds(30, 140, 164, 20);
		add(tnombre);

		apellido = new JLabel("Apellidos");
		apellido.setBounds(30, 160, 150, 20);
		add(apellido);

		tapellido = new JTextField();
		tapellido.setBounds(30, 190, 164, 20);
		add(tapellido);

		edad = new JLabel("Fecha nacimiento( DD/MM/AAAA)");
		edad.setBounds(30, 210, 200, 20);
		add(edad);

		tedad = new JTextField();
		tedad.setBounds(30, 240, 164, 20);
		add(tedad);

		genero = new JLabel("genero");
		genero.setBounds(30, 260, 250, 20);
		add(genero);

		tgenero = new JComboBox<String>(new String[] { "...", "Masculino", "Femenino" });
		tgenero.setBounds(30, 290, 164, 20);
		add(tgenero);

		correo = new JLabel("Correo electrónico");
		correo.setBounds(30, 310, 150, 20);
		add(correo);

		tcorreo = new JTextField();
		tcorreo.setBounds(30, 340, 164, 20);
		add(tcorreo);
		
		id = new JLabel("num. documento");
		id.setBounds(30, 360, 150, 20);
		add(id);

		tid = new JTextField();
		tid.setBounds(30, 390, 164, 20);
		add(tid);

		telefono = new JLabel("Telefono");
		telefono.setBounds(30, 410, 150, 20);
		add(telefono);

		ttelefono = new JTextField();
		ttelefono.setBounds(30, 440, 164, 20);
		add(ttelefono);

		rutaFoto = new JLabel("Foto de la persona");
		rutaFoto.setBounds(30, 560, 150, 20);
		add(rutaFoto);

		trutaFoto = new JButton("Subir foto");
		trutaFoto.setBounds(30, 590, 124, 30);
		trutaFoto.setBackground(Color.decode("#F9CFCE"));
		trutaFoto.setFocusPainted(false);
		trutaFoto.setBorderPainted(false);
		add(trutaFoto);

		estado = new JLabel("Estado");
		estado.setBounds(30, 460, 250, 20);
		add(estado);

		testado = new JComboBox<String>(new String[] { "...", "Activo", "Inactivo	" });
		testado.setBounds(30, 490, 164, 20);
		add(testado);
		
		tipoPersona = new JLabel("Tipo de persona");
		tipoPersona.setBounds(30, 510, 250, 20);
		add(tipoPersona);
		
		ttipoPersona = new JComboBox<String>(new String[] { "...", "Residente", "Empleado", "Administrador" });
		ttipoPersona.setBounds(30, 540, 164, 20);
		add(ttipoPersona);
		
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getInfo() {
		return info;
	}

	public void setInfo(JLabel info) {
		this.info = info;
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

	public JLabel getRutaFoto() {
		return rutaFoto;
	}

	public void setRutaFoto(JLabel rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

	public JLabel getEstado() {
		return estado;
	}

	public void setEstado(JLabel estado) {
		this.estado = estado;
	}

	public JLabel getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(JLabel tipoPersona) {
		this.tipoPersona = tipoPersona;
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

	public JComboBox getTtipoPersona() {
		return ttipoPersona;
	}

	public void setTtipoPersona(JComboBox ttipoPersona) {
		this.ttipoPersona = ttipoPersona;
	}

	public JLabel getTipo() {
		return tipo;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JLabel getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(JLabel numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public JLabel getTorre() {
		return torre;
	}

	public void setTorre(JLabel torre) {
		this.torre = torre;
	}

	public JLabel getParqueaderoAsignado() {
		return parqueaderoAsignado;
	}

	public void setParqueaderoAsignado(JLabel parqueaderoAsignado) {
		this.parqueaderoAsignado = parqueaderoAsignado;
	}

	public JLabel getMascotaRegistrada() {
		return mascotaRegistrada;
	}

	public void setMascotaRegistrada(JLabel mascotaRegistrada) {
		this.mascotaRegistrada = mascotaRegistrada;
	}

	public JLabel getVehiculoRegistrado() {
		return vehiculoRegistrado;
	}

	public void setVehiculoRegistrado(JLabel vehiculoRegistrado) {
		this.vehiculoRegistrado = vehiculoRegistrado;
	}

	public JLabel getTieneCargadorDeAuto() {
		return tieneCargadorDeAuto;
	}

	public void setTieneCargadorDeAuto(JLabel tieneCargadorDeAuto) {
		this.tieneCargadorDeAuto = tieneCargadorDeAuto;
	}

	public JLabel getTieneBicicleta() {
		return tieneBicicleta;
	}

	public void setTieneBicicleta(JLabel tieneBicicleta) {
		this.tieneBicicleta = tieneBicicleta;
	}

	public JLabel getNumBicicletero() {
		return numBicicletero;
	}

	public void setNumBicicletero(JLabel numBicicletero) {
		this.numBicicletero = numBicicletero;
	}

	public JLabel getTienePaquete() {
		return tienePaquete;
	}

	public void setTienePaquete(JLabel tienePaquete) {
		this.tienePaquete = tienePaquete;
	}

	public JLabel getTieneMulta() {
		return tieneMulta;
	}

	public void setTieneMulta(JLabel tieneMulta) {
		this.tieneMulta = tieneMulta;
	}

	public JLabel getDatoPaquete() {
		return datoPaquete;
	}

	public void setDatoPaquete(JLabel datoPaquete) {
		this.datoPaquete = datoPaquete;
	}

	public JLabel getDatoMulta() {
		return datoMulta;
	}

	public void setDatoMulta(JLabel datoMulta) {
		this.datoMulta = datoMulta;
	}

	public JLabel getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(JLabel fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}
	
	
}
