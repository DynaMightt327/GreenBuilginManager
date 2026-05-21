package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelRegistrarResidente extends JPanel{
	
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
	private JLabel apartamento;
	private JLabel piso;
	private JLabel tieneReporte;
	private JLabel numeroReporte;
	private JLabel contenidoReporte;
	private JLabel tieneMulta;
	private JLabel costoMulta;
	private JLabel razonMulta;
	private JLabel cantidadDeMulta;
	private JLabel tieneParqueadero;
	private JLabel numeroParqueadero;
	private JLabel  tieneBicicletero;
	private JLabel tieneCargadorDeCarro;
	
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
	private JTextField ttorre;
	private JTextField tapartamento;
	private JTextField tpiso;
	private JComboBox<String> ttieneReporte;
	private JTextField tnumeroReporte;
	private JTextField tcontenidoReporte;
	private JComboBox<String> ttieneMulta;
	private JTextField tcostoMulta;
	private JTextField trazonMulta;
	private JTextField tcantidadDeMulta;
	private JComboBox<String> ttieneParqueadero;
	private JTextField tnumeroParqueadero;
	private JComboBox<String> ttieneBicicletero;
	private JComboBox<String> ttieneCargadorDeCarro;
	
	private JButton volver;
	private JButton guardar;
	
	public PanelRegistrarResidente() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#ddd3f2"));

		nombre = new JLabel("Nombre/s");
		nombre.setBounds(30, 20, 200, 20);
		add(nombre);

		tnombre = new JTextField();
		tnombre.setBounds(30, 45, 200, 25);
		add(tnombre);

		apellido = new JLabel("Apellidos");
		apellido.setBounds(30, 85, 200, 20);
		add(apellido);

		tapellido = new JTextField();
		tapellido.setBounds(30, 110, 200, 25);
		add(tapellido);

		genero = new JLabel("Género");
		genero.setBounds(30, 150, 200, 20);
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
		correo.setBounds(30, 280, 200, 20);
		add(correo);

		tcorreo = new JTextField();
		tcorreo.setBounds(30, 305, 200, 25);
		add(tcorreo);

		id = new JLabel("Número de documento");
		id.setBounds(30, 345, 200, 20);
		add(id);

		tid = new JTextField();
		tid.setBounds(30, 370, 200, 25);
		add(tid);

		telefono = new JLabel("Teléfono");
		telefono.setBounds(30, 410, 200, 20);
		add(telefono);

		ttelefono = new JTextField();
		ttelefono.setBounds(30, 435, 200, 25);
		add(ttelefono);

		rutaFoto = new JLabel("Foto de perfil");
		rutaFoto.setBounds(30, 475, 200, 20);
		add(rutaFoto);

		fotoPreview = new JLabel();
		fotoPreview.setBounds(30, 500, 80, 80);
		fotoPreview.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		add(fotoPreview);

		trutaFoto = new JButton("SUBIR FOTO");
		trutaFoto.setBounds(120, 500, 110, 30);
		trutaFoto.setBackground(Color.decode("#F9CFCE"));
		trutaFoto.setFocusPainted(false);
		trutaFoto.setBorderPainted(false);
		add(trutaFoto);

		volver = new JButton("VOLVER");
		volver.setBounds(730, 550, 150, 30);
		volver.setBackground(Color.decode("#F9CFCE"));
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		add(volver);

		estado = new JLabel("Estado");
		estado.setBounds(380, 20, 200, 20);
		add(estado);

		testado = new JComboBox<String>(new String[] {"...", "Activo", "Inactivo"});
		testado.setBounds(380, 45, 200, 25);
		add(testado);

		contrasena = new JLabel("Contraseña");
		contrasena.setBounds(380, 85, 200, 20);
		add(contrasena);

		tcontrasena = new JPasswordField();
		tcontrasena.setBounds(380, 110, 200, 25);
		add(tcontrasena);

		torre = new JLabel("Torre");
		torre.setBounds(380, 150, 200, 20);
		add(torre);

		ttorre = new JTextField();
		ttorre.setBounds(380, 175, 200, 25);
		add(ttorre);

		apartamento = new JLabel("Apartamento");
		apartamento.setBounds(380, 215, 200, 20);
		add(apartamento);

		tapartamento = new JTextField();
		tapartamento.setBounds(380, 240, 200, 25);
		add(tapartamento);

		piso = new JLabel("Piso");
		piso.setBounds(380, 280, 200, 20);
		add(piso);

		tpiso = new JTextField();
		tpiso.setBounds(380, 305, 200, 25);
		add(tpiso);

		tieneParqueadero = new JLabel("¿Tiene parqueadero?");
		tieneParqueadero.setBounds(380, 345, 200, 20);
		add(tieneParqueadero);

		ttieneParqueadero = new JComboBox<String>(new String[] {"...", "Sí", "No"});
		ttieneParqueadero.setBounds(380, 370, 200, 25);
		add(ttieneParqueadero);

		numeroParqueadero = new JLabel("Número de parqueadero");
		numeroParqueadero.setBounds(380, 410, 200, 20);
		add(numeroParqueadero);

		tnumeroParqueadero = new JTextField();
		tnumeroParqueadero.setBounds(380, 435, 200, 25);
		add(tnumeroParqueadero);

		tieneBicicletero = new JLabel("¿Tiene bicicletero?");
		tieneBicicletero.setBounds(380, 475, 200, 20);
		add(tieneBicicletero);

		ttieneBicicletero = new JComboBox<String>(new String[] {"...", "Sí", "No"});
		ttieneBicicletero.setBounds(380, 500, 200, 25);
		add(ttieneBicicletero);

		tieneCargadorDeCarro = new JLabel("¿Tiene cargador de carro?");
		tieneCargadorDeCarro.setBounds(380, 540, 200, 20);
		add(tieneCargadorDeCarro);

		ttieneCargadorDeCarro = new JComboBox<String>(new String[] {"...", "Sí", "No"});
		ttieneCargadorDeCarro.setBounds(380, 565, 200, 25);
		add(ttieneCargadorDeCarro);

		guardar = new JButton("GUARDAR");
		guardar.setBounds(730, 490, 150, 30);
		guardar.setBackground(Color.decode("#F9CFCE"));
		guardar.setFocusPainted(false);
		guardar.setBorderPainted(false);
		add(guardar);

		tieneReporte = new JLabel("¿Tiene reporte?");
		tieneReporte.setBounds(730, 20, 200, 20);
		add(tieneReporte);

		ttieneReporte = new JComboBox<String>(new String[] {"...", "Sí", "No"});
		ttieneReporte.setBounds(730, 45, 200, 25);
		add(ttieneReporte);

		numeroReporte = new JLabel("Número de reporte");
		numeroReporte.setBounds(730, 85, 200, 20);
		add(numeroReporte);

		tnumeroReporte = new JTextField();
		tnumeroReporte.setBounds(730, 110, 200, 25);
		add(tnumeroReporte);

		contenidoReporte = new JLabel("Contenido del reporte");
		contenidoReporte.setBounds(730, 150, 200, 20);
		add(contenidoReporte);

		tcontenidoReporte = new JTextField();
		tcontenidoReporte.setBounds(730, 175, 200, 25);
		add(tcontenidoReporte);

		tieneMulta = new JLabel("¿Tiene multa?");
		tieneMulta.setBounds(730, 215, 200, 20);
		add(tieneMulta);

		ttieneMulta = new JComboBox<String>(new String[] {"...", "Sí", "No"});
		ttieneMulta.setBounds(730, 240, 200, 25);
		add(ttieneMulta);

		costoMulta = new JLabel("Costo de la multa");
		costoMulta.setBounds(730, 280, 200, 20);
		add(costoMulta);

		tcostoMulta = new JTextField();
		tcostoMulta.setBounds(730, 305, 200, 25);
		add(tcostoMulta);

		razonMulta = new JLabel("Razón de la multa");
		razonMulta.setBounds(730, 345, 200, 20);
		add(razonMulta);

		trazonMulta = new JTextField();
		trazonMulta.setBounds(730, 370, 200, 25);
		add(trazonMulta);

		cantidadDeMulta = new JLabel("Cantidad de multas");
		cantidadDeMulta.setBounds(730, 410, 200, 20);
		add(cantidadDeMulta);

		tcantidadDeMulta = new JTextField();
		tcantidadDeMulta.setBounds(730, 435, 200, 25);
		add(tcantidadDeMulta);

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

	public JLabel getApartamento() {
		return apartamento;
	}

	public void setApartamento(JLabel apartamento) {
		this.apartamento = apartamento;
	}

	public JLabel getPiso() {
		return piso;
	}

	public void setPiso(JLabel piso) {
		this.piso = piso;
	}

	public JLabel getTieneReporte() {
		return tieneReporte;
	}

	public void setTieneReporte(JLabel tieneReporte) {
		this.tieneReporte = tieneReporte;
	}

	public JLabel getNumeroReporte() {
		return numeroReporte;
	}

	public void setNumeroReporte(JLabel numeroReporte) {
		this.numeroReporte = numeroReporte;
	}

	public JLabel getContenidoReporte() {
		return contenidoReporte;
	}

	public void setContenidoReporte(JLabel contenidoReporte) {
		this.contenidoReporte = contenidoReporte;
	}

	public JLabel getTieneMulta() {
		return tieneMulta;
	}

	public void setTieneMulta(JLabel tieneMulta) {
		this.tieneMulta = tieneMulta;
	}

	public JLabel getCostoMulta() {
		return costoMulta;
	}

	public void setCostoMulta(JLabel costoMulta) {
		this.costoMulta = costoMulta;
	}

	public JLabel getRazonMulta() {
		return razonMulta;
	}

	public void setRazonMulta(JLabel razonMulta) {
		this.razonMulta = razonMulta;
	}

	public JLabel getCantidadDeMulta() {
		return cantidadDeMulta;
	}

	public void setCantidadDeMulta(JLabel cantidadDeMulta) {
		this.cantidadDeMulta = cantidadDeMulta;
	}

	public JLabel getTieneParqueadero() {
		return tieneParqueadero;
	}

	public void setTieneParqueadero(JLabel tieneParqueadero) {
		this.tieneParqueadero = tieneParqueadero;
	}

	public JLabel getNumeroParqueadero() {
		return numeroParqueadero;
	}

	public void setNumeroParqueadero(JLabel numeroParqueadero) {
		this.numeroParqueadero = numeroParqueadero;
	}

	public JLabel getTieneBicicletero() {
		return tieneBicicletero;
	}

	public void setTieneBicicletero(JLabel tieneBicicletero) {
		this.tieneBicicletero = tieneBicicletero;
	}

	public JLabel getTieneCargadorDeCarro() {
		return tieneCargadorDeCarro;
	}

	public void setTieneCargadorDeCarro(JLabel tieneCargadorDeCarro) {
		this.tieneCargadorDeCarro = tieneCargadorDeCarro;
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

	public JTextField getTtorre() {
		return ttorre;
	}

	public void setTtorre(JTextField ttorre) {
		this.ttorre = ttorre;
	}

	public JTextField getTapartamento() {
		return tapartamento;
	}

	public void setTapartamento(JTextField tapartamento) {
		this.tapartamento = tapartamento;
	}

	public JTextField getTpiso() {
		return tpiso;
	}

	public void setTpiso(JTextField tpiso) {
		this.tpiso = tpiso;
	}

	public JComboBox<String> getTtieneReporte() {
		return ttieneReporte;
	}

	public void setTtieneReporte(JComboBox<String> ttieneReporte) {
		this.ttieneReporte = ttieneReporte;
	}

	public JTextField getTnumeroReporte() {
		return tnumeroReporte;
	}

	public void setTnumeroReporte(JTextField tnumeroReporte) {
		this.tnumeroReporte = tnumeroReporte;
	}

	public JTextField getTcontenidoReporte() {
		return tcontenidoReporte;
	}

	public void setTcontenidoReporte(JTextField tcontenidoReporte) {
		this.tcontenidoReporte = tcontenidoReporte;
	}

	public JComboBox<String> getTtieneMulta() {
		return ttieneMulta;
	}

	public void setTtieneMulta(JComboBox<String> ttieneMulta) {
		this.ttieneMulta = ttieneMulta;
	}

	public JTextField getTcostoMulta() {
		return tcostoMulta;
	}

	public void setTcostoMulta(JTextField tcostoMulta) {
		this.tcostoMulta = tcostoMulta;
	}

	public JTextField getTrazonMulta() {
		return trazonMulta;
	}

	public void setTrazonMulta(JTextField trazonMulta) {
		this.trazonMulta = trazonMulta;
	}

	public JTextField getTcantidadDeMulta() {
		return tcantidadDeMulta;
	}

	public void setTcantidadDeMulta(JTextField tcantidadDeMulta) {
		this.tcantidadDeMulta = tcantidadDeMulta;
	}

	public JComboBox<String> getTtieneParqueadero() {
		return ttieneParqueadero;
	}

	public void setTtieneParqueadero(JComboBox<String> ttieneParqueadero) {
		this.ttieneParqueadero = ttieneParqueadero;
	}

	public JTextField getTnumeroParqueadero() {
		return tnumeroParqueadero;
	}

	public void setTnumeroParqueadero(JTextField tnumeroParqueadero) {
		this.tnumeroParqueadero = tnumeroParqueadero;
	}

	public JComboBox<String> getTtieneBicicletero() {
		return ttieneBicicletero;
	}

	public void setTtieneBicicletero(JComboBox<String> ttieneBicicletero) {
		this.ttieneBicicletero = ttieneBicicletero;
	}

	public JComboBox<String> getTtieneCargadorDeCarro() {
		return ttieneCargadorDeCarro;
	}

	public void setTtieneCargadorDeCarro(JComboBox<String> ttieneCargadorDeCarro) {
		this.ttieneCargadorDeCarro = ttieneCargadorDeCarro;
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
