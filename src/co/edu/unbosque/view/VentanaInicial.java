package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VentanaInicial extends JFrame {
	
	private JTextArea titulo;
	private JButton entrar;
	private JLabel fondo;
	
	private PanelSeleccionIngreso panSelect;

	public VentanaInicial() {
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		// CONFIGURACION DE LA VENTANA
		setTitle("VENTANA INICIAL");
		setBounds(230, 5, 1100, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);
		
		ImageIcon icon = new ImageIcon("logo.jpeg");
		this.setIconImage(icon.getImage());
		
//		ImageIcon fondoImagen = new ImageIcon(getClass().getResource("back.png"));
//		fondo = new JLabel(fondoImagen);
		fondo = new JLabel("");
		fondo.setBackground(Color.white);
		fondo.setBounds(0, 0, 1100, 720);
		fondo.setLayout(null);
		add(fondo);
		
		panSelect = new PanelSeleccionIngreso();
		panSelect.setVisible(false);
		fondo.add(panSelect);
		
		titulo = new JTextArea("GREENBUILDING \nMANAGER");
		titulo.setBounds(80, 250, 450, 170);
		titulo.setFont(new Font("Arial", Font.BOLD, 50));
		titulo.setForeground(Color.black);
		titulo.setBackground(null);
		titulo.setEditable(false);
		fondo.add(titulo);
		
		entrar = new JButton("INGRESAR");
		entrar.setBounds(850, 570, 120, 50);
		entrar.setBackground(Color.black);
		entrar.setForeground(Color.white);
		entrar.setBorderPainted(false);
		entrar.setFocusPainted(false);
		entrar.setVisible(true);
		fondo.add(entrar);

	}

	public JButton getEntrar() {
		return entrar;
	}

	public void setEntrar(JButton entrar) {
		this.entrar = entrar;
	}

	public PanelSeleccionIngreso getPanSelect() {
		return panSelect;
	}

	public void setPanSelect(PanelSeleccionIngreso panSelect) {
		this.panSelect = panSelect;
	}

}
