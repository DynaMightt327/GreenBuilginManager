package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelIniciarSesion extends JPanel{
	
	private JLabel id;
	private JLabel contrasena;
	private JTextField tid;
	private JPasswordField tcontrasena;
	private JButton volver;
	private JButton guardar;
	
	public PanelIniciarSesion() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#ddd3f2"));

		id = new JLabel("Número de documento");
		id.setBounds(400, 240, 300, 20);
		add(id);
 
		tid = new JTextField();
		tid.setBounds(400, 265, 300, 30);
		add(tid);
 
		contrasena = new JLabel("Contraseña");
		contrasena.setBounds(400, 315, 300, 20);
		add(contrasena);
 
		tcontrasena = new JPasswordField();
		tcontrasena.setBounds(400, 340, 300, 30);
		add(tcontrasena);
 
		volver = new JButton("VOLVER");
		volver.setBounds(400, 400, 140, 35);
		volver.setBackground(Color.decode("#F9CFCE"));
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		add(volver);
 
		guardar = new JButton("INICIAR SESIÓN");
		guardar.setBounds(560, 400, 140, 35);
		guardar.setBackground(Color.decode("#F9CFCE"));
		guardar.setFocusPainted(false);
		guardar.setBorderPainted(false);
		add(guardar);
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JLabel getContrasena() {
		return contrasena;
	}

	public void setContrasena(JLabel contrasena) {
		this.contrasena = contrasena;
	}

	public JTextField getTid() {
		return tid;
	}

	public void setTid(JTextField tid) {
		this.tid = tid;
	}

	public JPasswordField getTcontrasena() {
		return tcontrasena;
	}

	public void setTcontrasena(JPasswordField tcontrasena) {
		this.tcontrasena = tcontrasena;
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
