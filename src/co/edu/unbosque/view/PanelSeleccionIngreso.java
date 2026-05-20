package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSeleccionIngreso extends JPanel {

	private JButton residente;
	private JButton admin;
	private JButton empleado;

	public PanelSeleccionIngreso() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(550, 0, 550, 720);
		this.setLayout(null);
		this.setBackground(Color.white);

		residente = new JButton("RESIDENTE");
		residente.setBounds(150, 230, 150, 50);
		residente.setBackground(Color.black);
		residente.setForeground(Color.white);
		residente.setBorderPainted(false);
		residente.setFocusPainted(false);
		residente.setVisible(true);
		add(residente);

		admin = new JButton("ADMIN");
		admin.setBounds(150, 300, 150, 50);
		admin.setBackground(Color.black);
		admin.setForeground(Color.white);
		admin.setBorderPainted(false);
		admin.setFocusPainted(false);
		admin.setVisible(true);
		add(admin);

		empleado = new JButton("EMPLEADO");
		empleado.setBounds(150, 370, 150, 50);
		empleado.setBackground(Color.black);
		empleado.setForeground(Color.white);
		empleado.setBorderPainted(false);
		empleado.setFocusPainted(false);
		empleado.setVisible(true);
		add(empleado);
	}

	public JButton getResidente() {
		return residente;
	}

	public void setResidente(JButton residente) {
		this.residente = residente;
	}

	public JButton getAdmin() {
		return admin;
	}

	public void setAdmin(JButton admin) {
		this.admin = admin;
	}

	public JButton getEmpleado() {
		return empleado;
	}

	public void setEmpleado(JButton empleado) {
		this.empleado = empleado;
	}
	
}
