package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelRegistrarEmpleado extends JPanel {

	private JLabel empleado;
	private JComboBox<String> tipoEmpleado;

	public PanelRegistrarEmpleado() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(230, 0, 740, 720);
		this.setLayout(null);
		this.setBackground(Color.red);

		empleado = new JLabel("Tipo de empleado");
		empleado.setBounds(30, 185, 250, 20);
		add(empleado);

		tipoEmpleado = new JComboBox<String>(new String[] { "...", "Personal de aseo", "Vigilante", "Personal de mantenimiento", "Empleado domestico" });
		tipoEmpleado.setBounds(30, 210, 164, 20);
		add(tipoEmpleado);

	}

	public JLabel getEmpleado() {
		return empleado;
	}

	public void setEmpleado(JLabel empleado) {
		this.empleado = empleado;
	}

	public JComboBox<String> getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(JComboBox<String> tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}
