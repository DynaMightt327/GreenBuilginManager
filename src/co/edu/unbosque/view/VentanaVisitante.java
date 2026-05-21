package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaVisitante extends JFrame {

	private PanelRegistrarVisitante prv;
	private PanelIniciarSesion pis;
	
	private JPanel panelBotones;
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
		
		prv = new PanelRegistrarVisitante();
		prv.setVisible(false);
		add(prv);
		
		pis = new PanelIniciarSesion();
		pis.setVisible(false);
		add(pis);
		
		panelBotones = new JPanel();
		panelBotones.setBounds(0, 0, 1100, 720);
		panelBotones.setBackground(Color.decode("#FFFFFF"));
		panelBotones.setLayout(null);
		add(panelBotones);

		volver = new JButton("VOLVER");
		volver.setBounds(300, 200, 168, 45);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Georgia", Font.BOLD, 12));
		volver.setBackground(Color.decode("#eba66e"));
		volver.setForeground(Color.black);
		panelBotones.add(volver);

		iniciarSesion = new JButton("INICIAR SESION");
		iniciarSesion.setBounds(300, 350, 168, 45);
		iniciarSesion.setBorderPainted(false);
		iniciarSesion.setLayout(null);
		iniciarSesion.setFont(new Font("Georgia", Font.BOLD, 12));
		iniciarSesion.setBackground(Color.decode("#eba66e"));
		iniciarSesion.setForeground(Color.black);
		panelBotones.add(iniciarSesion);

		registrar = new JButton("REGISTRAR");
		registrar.setBounds(700, 200, 168, 45);
		registrar.setBorderPainted(false);
		registrar.setLayout(null);
		registrar.setFont(new Font("Georgia", Font.BOLD, 12));
		registrar.setBackground(Color.decode("#eba66e"));
		registrar.setForeground(Color.black);
		panelBotones.add(registrar);

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

	public PanelRegistrarVisitante getPrv() {
		return prv;
	}

	public void setPrv(PanelRegistrarVisitante prv) {
		this.prv = prv;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelIniciarSesion getPis() {
		return pis;
	}

	public void setPis(PanelIniciarSesion pis) {
		this.pis = pis;
	}

}
