package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSeleccionIngreso extends JPanel {

	private JButton iniciarSesion;
	private JButton admin;
	private JButton ayuda;

	public PanelSeleccionIngreso() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(320, 410, 450, 250);
		this.setLayout(null);
		this.setBackground(Color.white);

		iniciarSesion = new JButton("INICIAR SESIÓN");
		iniciarSesion.setBounds(150, 30, 150, 50);
		iniciarSesion.setBackground(Color.black);
		iniciarSesion.setForeground(Color.white);
		iniciarSesion.setBorderPainted(false);
		iniciarSesion.setFocusPainted(false);
		iniciarSesion.setVisible(true);
		add(iniciarSesion);

		admin = new JButton("SOY ADMIN");
		admin.setBounds(150, 100, 150, 50);
		admin.setBackground(Color.black);
		admin.setForeground(Color.white);
		admin.setBorderPainted(false);
		admin.setFocusPainted(false);
		admin.setVisible(true);
		add(admin);

		ayuda = new JButton("AYUDA");
		ayuda.setBounds(150, 170, 150, 50);
		ayuda.setBackground(Color.black);
		ayuda.setForeground(Color.white);
		ayuda.setBorderPainted(false);
		ayuda.setFocusPainted(false);
		ayuda.setVisible(true);
		add(ayuda);
	}

	public JButton getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(JButton iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public JButton getAdmin() {
		return admin;
	}

	public void setAdmin(JButton admin) {
		this.admin = admin;
	}

	public JButton getAyuda() {
		return ayuda;
	}

	public void setAyuda(JButton ayuda) {
		this.ayuda = ayuda;
	}

}
