package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelPrincipalAdministrador extends JPanel{
	
	public PanelPrincipalAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.white);
	}

}
