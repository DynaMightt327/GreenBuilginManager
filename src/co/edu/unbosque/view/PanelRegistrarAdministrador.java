package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelRegistrarAdministrador extends JPanel {

	private JLabel nombre;
	private JLabel apellido;
	private JLabel edad;
	private JLabel genero;
	private JLabel correo;
	private JLabel id;
	private JLabel telefono;
	private JLabel rutaFoto;
	private JLabel estado;
	private JLabel cargo;
	private JLabel fechaIncio;
	private JLabel nit;
	private JLabel nivelAcceso;
	private JLabel contrasenia;

	private JTextField tnombre;
	private JTextField tapellido;
	private JTextField tedad;
	private JComboBox<String> tgenero;
	private JTextField tcorreo;
	private JTextField tid;
	private JTextField ttelefono;
	private JButton trutaFoto;
	private JComboBox<String> testado;
	private JComboBox<String> tcargo;
	private JTextField tfechaIncio;
	private JTextField tnit;
	private JComboBox<String> tnivelAcceso;
	private JPasswordField tcontrasenia;

	public PanelRegistrarAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.white);

		// ---------- CAMPOS DE TEXTO ----------
		nombre = new JLabel("Nombre/s");
		nombre.setBounds(30, 20, 150, 20);
		add(nombre);

		tnombre = new JTextField();
		tnombre.setBounds(30, 45, 164, 20);
		add(tnombre);

		apellido = new JLabel("Apellidos");
		apellido.setBounds(30, 75, 150, 20);
		add(apellido);

		tapellido = new JTextField();
		tapellido.setBounds(30, 100, 164, 20);
		add(tapellido);

		edad = new JLabel("Apodo");
		edad.setBounds(30, 130, 150, 20);
		add(edad);

		tedad = new JTextField();
		tedad.setBounds(30, 155, 164, 20);
		add(tedad);

		genero = new JLabel("Fecha de nacimiento (DD/MM/AAAA)");
		genero.setBounds(30, 185, 250, 20);
		add(genero);

		tgenero = new JComboBox<>(new String[] { "...", "Masculino", "Femenino" });
		tgenero.setBounds(30, 210, 164, 20);
		add(tgenero);

		correo = new JLabel("Correo electrónico:");
		correo.setBounds(30, 240, 150, 20);
		add(correo);

		tcorreo = new JTextField();
		tcorreo.setBounds(30, 265, 164, 20);
		add(tcorreo);

		id = new JLabel("Contraseña");
		id.setBounds(250, 20, 164, 20);
		add(id);

		tid = new JTextField();
		tid.setBounds(250, 45, 164, 20);
		add(tid);

		telefono = new JLabel("Nombre/s");
		telefono.setBounds(30, 20, 150, 20);
		add(telefono);

		ttelefono = new JTextField();
		ttelefono.setBounds(30, 45, 164, 20);
		add(ttelefono);

		rutaFoto = new JLabel("Apellidos");
		rutaFoto.setBounds(30, 75, 150, 20);
		add(rutaFoto);

		trutaFoto = new JButton();
		trutaFoto.setBounds(30, 100, 164, 20);
		add(trutaFoto);

		estado = new JLabel("Apodo");
		estado.setBounds(30, 130, 150, 20);
		add(estado);

		testado = new JComboBox<>(new String[] {"...", "Activo", "Inactivo"});
		testado.setBounds(30, 155, 164, 20);
		add(testado);

		cargo = new JLabel("Fecha de nacimiento (DD/MM/AAAA)");
		cargo.setBounds(30, 185, 250, 20);
		add(cargo);

		tcargo = new JComboBox<>(new String[] {"...", "...", "..."});
		tcargo.setBounds(30, 210, 164, 20);
		add(tcargo);

		fechaIncio = new JLabel("Correo electrónico:");
		fechaIncio.setBounds(30, 240, 150, 20);
		add(fechaIncio);

		tfechaIncio = new JTextField();
		tfechaIncio.setBounds(30, 265, 164, 20);
		add(tfechaIncio);

		nit = new JLabel("Contraseña");
		nit.setBounds(250, 20, 164, 20);
		add(nit);

		tnit = new JTextField();
		tnit.setBounds(250, 45, 164, 20);
		add(tnit);
		
		nivelAcceso = new JLabel("Correo electrónico:");
		nivelAcceso.setBounds(30, 240, 150, 20);
		add(nivelAcceso);
		
		tnivelAcceso = new JComboBox<>(new String[] {"...", "Alto", "Medio", "Bajo"});
		tnivelAcceso.setBounds(30, 265, 164, 20);
		add(tnivelAcceso);
		
		contrasenia = new JLabel("Contraseña");
		contrasenia.setBounds(250, 20, 164, 20);
		add(contrasenia);
		
		tcontrasenia = new JPasswordField();
		tcontrasenia.setBounds(250, 45, 164, 20);
		add(tcontrasenia);
	}
}
