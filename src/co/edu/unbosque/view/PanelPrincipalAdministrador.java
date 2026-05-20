package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipalAdministrador extends JPanel{
	
	private PanelRegistrar pr;
	
	private JPanel panelDerecho;
	private JPanel panelIzquierdo;
	
	private JLabel menu;
	
	private JButton registrar;
	private JButton volver;
	
	public PanelPrincipalAdministrador() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.white);
		
		pr = new PanelRegistrar();
		pr.setVisible(false);
		add(pr);
		
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
		
		registrar = new JButton("REGISTRAR");
		registrar.setBounds(10, 200, 90, 40);
		registrar.setBackground(Color.white);
		registrar.setForeground(Color.black);
		registrar.setFont(new Font("Arial", Font.BOLD, 9));
		registrar.setFocusPainted(false);
		registrar.setBorderPainted(false);
		panelIzquierdo.add(registrar);
		
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

	public PanelRegistrar getPr() {
		return pr;
	}

	public void setPr(PanelRegistrar pr) {
		this.pr = pr;
	}

	public JLabel getMenu() {
		return menu;
	}

	public void setMenu(JLabel menu) {
		this.menu = menu;
	}

	public JButton getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JButton registrar) {
		this.registrar = registrar;
	}

}
