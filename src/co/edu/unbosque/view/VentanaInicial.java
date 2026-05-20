package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInicial extends JFrame {
	
	private JButton admin;
	private JButton residente;
	private JButton empleado;
	private JButton visitante;

	public VentanaInicial() {
		iniComponentes();
		setVisible(true);
	}

	public void iniComponentes() {
		// CONFIGURACION DE LA VENTANA
		setTitle("ventana inicial");
		setBounds(230, 5, 1100, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.decode("#F5E6E8"));
		getContentPane().setLayout(null);
		
		admin = new JButton("ADMINISTRADOR");
		admin.setBounds(300, 200, 168, 45);
		admin.setBorderPainted(false);
		admin.setLayout(null);
		admin.setFont(new Font("Georgia", Font.BOLD, 12));
		admin.setBackground(Color.decode("#eba66e"));
		admin.setForeground(Color.black);
		add(admin);
		
		residente = new JButton("RESIDENTE");
		residente.setBounds(300, 350, 168, 45);
		residente.setBorderPainted(false);
		residente.setLayout(null);
		residente.setFont(new Font("Georgia", Font.BOLD, 12));
		residente.setBackground(Color.decode("#eba66e"));
		residente.setForeground(Color.black);
		add(residente);
		
		empleado = new JButton("EMPLEADO");
		empleado.setBounds(700, 200, 168, 45);
		empleado.setBorderPainted(false);
		empleado.setLayout(null);
		empleado.setFont(new Font("Georgia", Font.BOLD, 12));
		empleado.setBackground(Color.decode("#eba66e"));
		empleado.setForeground(Color.black);
		add(empleado);
		
		visitante = new JButton("VISITANTE");
		visitante.setBounds(700, 350, 168, 45);
		visitante.setBorderPainted(false);
		visitante.setLayout(null);
		visitante.setFont(new Font("Georgia", Font.BOLD, 12));
		visitante.setBackground(Color.decode("#eba66e"));
		visitante.setForeground(Color.black);
		add(visitante);
	}

	public JButton getAdmin() {
		return admin;
	}

	public void setAdmin(JButton admin) {
		this.admin = admin;
	}

	public JButton getResidente() {
		return residente;
	}

	public void setResidente(JButton residente) {
		this.residente = residente;
	}

	public JButton getEmpleado() {
		return empleado;
	}

	public void setEmpleado(JButton empleado) {
		this.empleado = empleado;
	}

	public JButton getVisitante() {
		return visitante;
	}

	public void setVisitante(JButton visitante) {
		this.visitante = visitante;
	}
	
}
