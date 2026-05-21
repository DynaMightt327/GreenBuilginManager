package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaVisitante extends JFrame {

	private JButton volver;
	private JButton iniciarSesion;
	private JButton registrar;

	public VentanaVisitante() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		// CONFIGURACION DE LA VENTANA
		setTitle("ventana visitante");
		setBounds(230, 5, 1100, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.decode("#F5E6E8"));
		getContentPane().setLayout(null);

		volver = new JButton("VOLVER");
		volver.setBounds(300, 200, 168, 45);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Georgia", Font.BOLD, 12));
		volver.setBackground(Color.decode("#eba66e"));
		volver.setForeground(Color.black);
		add(volver);

		iniciarSesion = new JButton("INICIAR SESION");
		iniciarSesion.setBounds(300, 350, 168, 45);
		iniciarSesion.setBorderPainted(false);
		iniciarSesion.setLayout(null);
		iniciarSesion.setFont(new Font("Georgia", Font.BOLD, 12));
		iniciarSesion.setBackground(Color.decode("#eba66e"));
		iniciarSesion.setForeground(Color.black);
		add(iniciarSesion);

		registrar = new JButton("REGISTRAR");
		registrar.setBounds(700, 200, 168, 45);
		registrar.setBorderPainted(false);
		registrar.setLayout(null);
		registrar.setFont(new Font("Georgia", Font.BOLD, 12));
		registrar.setBackground(Color.decode("#eba66e"));
		registrar.setForeground(Color.black);
		add(registrar);

	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(JButton iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public JButton getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JButton registrar) {
		this.registrar = registrar;
	}

}
