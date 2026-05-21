package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipalResidente extends JPanel {

	private JPanel panelIzq;
	
	private JPanel panelSup;
	private JLabel bienvenida;
	private JLabel titulo;
	
	private JPanel panelDer;
	private JPanel pInfoPersona;
	private JPanel pNotificacion;
	private JPanel pPaquete;
	private JPanel pFamilia;
	
	private JButton volver;
	
	public PanelPrincipalResidente() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#d7d6b4"));
		
		// ------------PANEL IZQUIERDO----------------
		panelIzq = new JPanel();
		panelIzq.setBounds(0, 0, 130, 720);
		panelIzq.setBackground(Color.decode("#c0b489"));
		panelIzq.setLayout(null);
		add(panelIzq);
		
		volver = new JButton("VOLVER");
		volver.setBounds(15, 630, 100, 30);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Georgia", Font.BOLD, 12));
		volver.setBackground(Color.decode("#998755"));
		volver.setForeground(Color.black);
		panelIzq.add(volver);
		
		// ------------PANEL SUPERIOR----------------
		panelSup = new JPanel();
		panelSup.setBounds(150, 10, 650, 100);
		panelSup.setBackground(Color.decode("#c0b489"));
		panelSup.setLayout(null);
		add(panelSup);
		
		bienvenida = new JLabel("Bienvenido, usuario :D"); // despues solo dejar " " para poner el texto en el controlador
		bienvenida.setBounds(20, 20, 650, 52);
		bienvenida.setForeground(Color.decode("#1d1711"));
		bienvenida.setFont(new Font("Arial", Font.BOLD, 50));
		panelSup.add(bienvenida);
		
		titulo = new JLabel("RESIDENTE DEL CONJUNTO GREEN TOWER RESIDENCIAL");
		titulo.setBounds(30, 80, 650, 14);
		titulo.setForeground(Color.decode("#1d1711"));
		titulo.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		panelSup.add(titulo);
		
		// ------------PANEL DERECHO----------------
		panelDer = new JPanel();
		panelDer.setBounds(820, 0, 280, 720);
		panelDer.setBackground(Color.decode("#c0b489"));
		panelDer.setLayout(null);
		add(panelDer);
		
		pInfoPersona = new JPanel();
		pInfoPersona.setBounds(10, 10, 245, 65);
		pInfoPersona.setBackground(Color.decode("#998755"));
		pInfoPersona.setLayout(null);
		panelDer.add(pInfoPersona);
		
		pNotificacion = new JPanel();
		pNotificacion.setBounds(10, 90, 245, 140);
		pNotificacion.setBackground(Color.decode("#998755"));
		pNotificacion.setLayout(null);
		panelDer.add(pNotificacion);
		
		pPaquete = new JPanel();
		pPaquete.setBounds(10, 245, 245, 140);
		pPaquete.setBackground(Color.decode("#998755"));
		pPaquete.setLayout(null);
		panelDer.add(pPaquete);
		
		pFamilia = new JPanel();
		pFamilia.setBounds(10, 400, 245, 270);
		pFamilia.setBackground(Color.decode("#998755"));
		pFamilia.setLayout(null);
		panelDer.add(pFamilia);

	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	
}
