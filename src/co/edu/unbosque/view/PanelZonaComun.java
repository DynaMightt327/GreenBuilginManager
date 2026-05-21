package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelZonaComun extends JPanel{
	
	private JButton volver;
	
	public PanelZonaComun() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(135, 120, 680, 610);
		this.setLayout(null);
		this.setBackground(Color.decode("#ead3f2"));
		
		
		volver = new JButton("VOLVER");
		volver.setBounds(15, 630, 100, 30);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Arial", Font.BOLD, 12));
		volver.setBackground(Color.decode("#7984b7"));
		volver.setForeground(Color.black);
		add(volver);
		
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

}
