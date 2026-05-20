package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaAdministrador extends JFrame {
	
	private JPanel panelUno;
	private PanelPrincipalAdministrador ppa;
	private PanelRegistrarAdministrador pra;
	
	private JLabel titulo;
	private JLabel lDocumento;
	private JTextField tDocumento;
	private JLabel lcontrasenia;
	private JPasswordField tContrasenia;
	private JButton iniciarSesion;
	private JButton registrarse;
	private JTextArea info;
	private JButton volver;
	private JLabel fondo;
	
	public VentanaAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		// CONFIGURACION DE LA VENTANA
		setTitle("VENTANA ADMINISTRADOR");
		setBounds(230, 5, 1100, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);
		
		ppa = new PanelPrincipalAdministrador();
		ppa.setVisible(false);
		add(ppa);
		
		pra = new PanelRegistrarAdministrador();
		pra.setVisible(false);
		add(pra);
		
		panelUno = new JPanel();
		panelUno.setLayout(null);
		panelUno.setBounds(0, 0, 1100, 720);
		panelUno.setBackground(Color.decode("#99bc9f"));
		add(panelUno);
		
		ImageIcon icon = new ImageIcon("logo.jpeg");
		this.setIconImage(icon.getImage());
		
		ImageIcon fondoImagen = new ImageIcon(getClass().getResource("fondoRegistro.png"));
		fondo = new JLabel(fondoImagen);
		fondo.setBounds(0, 0, 1100, 720);
		fondo.setLayout(null);
		panelUno.add(fondo);
		

		titulo = new JLabel("INICIA SESIÓN PARA CONTINUAR");
		titulo.setBounds(575, 160, 580, 35);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		titulo.setBackground(Color.white);
		fondo.add(titulo);

		info = new JTextArea(
				"si no haces parte del consejo administrativo \nno puedes estar aqui");
		info.setBounds(600, 590, 450, 42);
		info.setFont(new Font("Arial", Font.BOLD, 15));
		info.setForeground(Color.black);
		fondo.add(info);

		lDocumento = new JLabel("Número de documento:");
		lDocumento.setBounds(720, 220, 250, 18);
		lDocumento.setFont(new Font("Arial", Font.BOLD, 18));
		lDocumento.setForeground(Color.white);
		fondo.add(lDocumento);

		tDocumento = new JTextField();
		tDocumento.setBounds(720, 245, 150, 33);
		fondo.add(tDocumento);

		lcontrasenia = new JLabel("Contraseña:");
		lcontrasenia.setBounds(720, 300, 250, 18);
		lcontrasenia.setFont(new Font("Arial", Font.BOLD, 18));
		lcontrasenia.setForeground(Color.white);
		fondo.add(lcontrasenia);

		tContrasenia = new JPasswordField();
		tContrasenia.setBounds(720, 325, 150, 33);
		fondo.add(tContrasenia);

		iniciarSesion = new JButton("INICIAR SESION");
		iniciarSesion.setBounds(720, 380, 150, 45);
		iniciarSesion.setBackground(Color.BLACK);
		iniciarSesion.setForeground(Color.white);
		iniciarSesion.setFocusPainted(false);
		iniciarSesion.setBorderPainted(false);
		fondo.add(iniciarSesion);
		
		volver = new JButton("VOLVER");
		volver.setBounds(720, 440, 150, 45);
		volver.setBackground(Color.BLACK);
		volver.setForeground(Color.white);
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		fondo.add(volver);
		
		registrarse = new JButton("crear mi cuenta");
		registrarse.setBounds(720, 650, 140, 20);
		registrarse.setBackground(Color.gray);
		registrarse.setForeground(Color.black);
		registrarse.setFont(new Font("Arial", Font.BOLD, 9));
		registrarse.setFocusPainted(false);
		registrarse.setBorderPainted(false);
		fondo.add(registrarse);

	}


	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getlDocumento() {
		return lDocumento;
	}

	public void setlDocumento(JLabel lDocumento) {
		this.lDocumento = lDocumento;
	}

	public JTextField gettDocumento() {
		return tDocumento;
	}

	public void settDocumento(JTextField tDocumento) {
		this.tDocumento = tDocumento;
	}

	public JLabel getLcontrasenia() {
		return lcontrasenia;
	}

	public void setLcontrasenia(JLabel lcontrasenia) {
		this.lcontrasenia = lcontrasenia;
	}

	public JPasswordField gettContrasenia() {
		return tContrasenia;
	}

	public void settContrasenia(JPasswordField tContrasenia) {
		this.tContrasenia = tContrasenia;
	}

	public JButton getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(JButton iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JPanel getPanelUno() {
		return panelUno;
	}

	public void setPanelUno(JPanel panelUno) {
		this.panelUno = panelUno;
	}

	public PanelPrincipalAdministrador getPpa() {
		return ppa;
	}

	public void setPpa(PanelPrincipalAdministrador ppa) {
		this.ppa = ppa;
	}

	public JButton getRegistrarse() {
		return registrarse;
	}

	public void setRegistrarse(JButton registrarse) {
		this.registrarse = registrarse;
	}

	public PanelRegistrarAdministrador getPra() {
		return pra;
	}

	public void setPra(PanelRegistrarAdministrador pra) {
		this.pra = pra;
	}
	
}
