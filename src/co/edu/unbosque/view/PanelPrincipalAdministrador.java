package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipalAdministrador extends JPanel{
	
	
	private JPanel panelDerecho;
	private JPanel panelIzquierdo;
	
	private JLabel menu;
	
	private JButton volver;
	
	public PanelPrincipalAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.white);
		
		panelDerecho = new JPanel();
		panelDerecho.setLayout(null);
		panelDerecho.setBounds(850, 0, 250, 720);
		panelDerecho.setBackground(Color.decode("#99bc9f"));
		add(panelDerecho);
		
		panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(null);
		panelIzquierdo.setBounds(0, 0, 110, 720);
		panelIzquierdo.setBackground(Color.decode("#99bc9f"));
		add(panelIzquierdo);
		
		menu = new JLabel("OPCIONES");
		menu.setBounds(10, 80, 90, 20);
		menu.setFont(new Font("Arial", Font.BOLD, 17));
		menu.setForeground(Color.black);
		menu.setBackground(Color.white);
		panelIzquierdo.add(menu);
		
		volver = new JButton("VOLVER");
		volver.setBounds(10, 650, 90, 20);
		volver.setBackground(Color.red);
		volver.setForeground(Color.black);
		volver.setFocusPainted(false);
		volver.setBorderPainted(false);
		panelIzquierdo.add(volver);
	}

	public JPanel getPanelDerecho() {
		return panelDerecho;
	}

	public void setPanelDerecho(JPanel panelDerecho) {
		this.panelDerecho = panelDerecho;
	}

	public JPanel getPanelIzquierdo() {
		return panelIzquierdo;
	}

	public void setPanelIzquierdo(JPanel panelIzquierdo) {
		this.panelIzquierdo = panelIzquierdo;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JLabel getMenu() {
		return menu;
	}

	public void setMenu(JLabel menu) {
		this.menu = menu;
	}

}
