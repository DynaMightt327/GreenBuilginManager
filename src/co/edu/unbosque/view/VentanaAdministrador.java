package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaAdministrador extends JFrame {
	
	private JPanel panelUno;
	private PanelPrincipalAdministrador ppa;
	
	private JLabel titulo;
	private JLabel lDocumento;
	private JTextField tDocumento;
	private JLabel lcontrasenia;
	private JPasswordField tContrasenia;
	private JButton iniciarSesion;
	private JButton volver;
	private JLabel info;

	public VentanaAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		// CONFIGURACION DE LA VENTANA
		setTitle("GrennBuilding Manager");
		setBounds(230, 5, 1100, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);

		ImageIcon icon = new ImageIcon("logo.jpeg");
		this.setIconImage(icon.getImage());
		
		ppa = new PanelPrincipalAdministrador();
		ppa.setVisible(false);
		add(ppa);
		
		panelUno = new JPanel();
		panelUno.setLayout(null);
		panelUno.setBounds(0, 0, 1100, 720);
		panelUno.setBackground(Color.decode("#99bc9f"));
		add(panelUno);

		titulo = new JLabel("INGRESA TUS DATOS PARA CONTINUAR");
		titulo.setBounds(240, 160, 640, 35);
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		titulo.setBackground(Color.white);
		panelUno.add(titulo);
		
		info = new JLabel(
				"si no haces parte del consejo administrativo no puedes estar aqui ¡!");
		info.setBounds(315, 630, 680, 20);
		info.setFont(new Font("Arial", Font.BOLD, 15));
		info.setForeground(Color.black);
		panelUno.add(info);
		
		lDocumento = new JLabel("Número de documento:");
		lDocumento.setBounds(445, 280, 250, 18);
		lDocumento.setFont(new Font("Arial", Font.BOLD, 18));
		lDocumento.setForeground(Color.white);
		panelUno.add(lDocumento);

		tDocumento = new JTextField();
		tDocumento.setBounds(475, 310, 150, 33);
		panelUno.add(tDocumento);

		lcontrasenia = new JLabel("Contraseña:");
		lcontrasenia.setBounds(445, 370, 250, 18);
		lcontrasenia.setFont(new Font("Arial", Font.BOLD, 18));
		lcontrasenia.setForeground(Color.white);
		panelUno.add(lcontrasenia);

		tContrasenia = new JPasswordField();
		tContrasenia.setBounds(475, 400, 150, 33);
		panelUno.add(tContrasenia);

		iniciarSesion = new JButton("INICIAR SESION");
		iniciarSesion.setBounds(475, 460, 150, 45);
		iniciarSesion.setBackground(Color.BLACK);
		iniciarSesion.setForeground(Color.white);
		iniciarSesion.setFocusPainted(false);
		iniciarSesion.setBorderPainted(false);
		panelUno.add(iniciarSesion);
		
		volver = new JButton("VOLVER");
		volver.setBounds(475, 525, 150, 45);
		volver.setBackground(Color.BLACK);
		volver.setForeground(Color.white);
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		panelUno.add(volver);
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

	public JLabel getInfo() {
		return info;
	}

	public void setInfo(JLabel info) {
		this.info = info;
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
	
}
