package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class PanelPrincipalResidente extends JPanel {

	private JPanel panelIzq;
	private JLabel logo;
	private JButton reservar;
	private JButton verEspacios;
	private JButton verMulta;
	private JButton generarRepote;
	
	private JPanel panelSup;
	private JLabel bienvenida;
	private JLabel titulo;
	
	private JPanel panelDer;
	private JPanel pInfoPersona;
	private JLabel fotoPreview;
	private JLabel nombre;
	private JLabel tipo;
	
	private JPanel pNotificacion;
	private JLabel noti;
	private JTable campoNoti;
	
	private JPanel pPaquete;
	private JLabel paquete;
	private JTable campoPaquete;

	private JPanel pFamilia;
	private JLabel persona;
	private JTable tablaPersona;
	
	private JLabel mapa;
	
	private JButton volver;
	
	public PanelPrincipalResidente() {
		iniComponentes();
		setVisible(false);
	}

	public void iniComponentes() {
		this.setBounds(0, 0, 1100, 720);
		this.setLayout(null);
		this.setBackground(Color.decode("#a8afd1"));
		
		mapa = new JLabel();
		mapa.setBounds(160, 130, 630, 250);
		mapa.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		add(mapa);
		
		// ------------PANEL IZQUIERDO----------------
		panelIzq = new JPanel();
		panelIzq.setBounds(0, 0, 130, 720);
		panelIzq.setBackground(Color.decode("#d1d4e6"));
		panelIzq.setLayout(null);
		add(panelIzq);
		
		logo = new JLabel();
		logo.setBounds(10, 10, 110, 110);
		logo.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		panelIzq.add(logo);

		volver = new JButton("VOLVER");
		volver.setBounds(15, 630, 100, 30);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Arial", Font.BOLD, 12));
		volver.setBackground(Color.decode("#7984b7"));
		volver.setForeground(Color.black);
		panelIzq.add(volver);

		reservar = new JButton("RESERVAR");
		reservar.setBounds(15, 200, 100, 60);
		reservar.setBorderPainted(false);
		reservar.setLayout(null);
		reservar.setFont(new Font("Arial", Font.BOLD, 12));
		reservar.setBackground(Color.decode("#7984b7"));
		reservar.setForeground(Color.black);
		panelIzq.add(reservar);
	
		verEspacios = new JButton("ESPACIOS");
		verEspacios.setBounds(15, 280, 100, 60);
		verEspacios.setBorderPainted(false);
		verEspacios.setLayout(null);
		verEspacios.setFont(new Font("Arial", Font.BOLD, 12));
		verEspacios.setBackground(Color.decode("#7984b7"));
		verEspacios.setForeground(Color.black);
		panelIzq.add(verEspacios);
		
		verMulta = new JButton("MULTAS");
		verMulta.setBounds(15, 360, 100, 60);
		verMulta.setBorderPainted(false);
		verMulta.setLayout(null);
		verMulta.setFont(new Font("Arial", Font.BOLD, 12));
		verMulta.setBackground(Color.decode("#7984b7"));
		verMulta.setForeground(Color.black);
		panelIzq.add(verMulta);
		
		generarRepote = new JButton("REPORTAR");
		generarRepote.setBounds(15, 440, 100, 60);
		generarRepote.setBorderPainted(false);
		generarRepote.setLayout(null);
		generarRepote.setFont(new Font("Arial", Font.BOLD, 12));
		generarRepote.setBackground(Color.decode("#7984b7"));
		generarRepote.setForeground(Color.black);
		panelIzq.add(generarRepote);
		
		// ------------PANEL SUPERIOR----------------
		panelSup = new JPanel();
		panelSup.setBounds(150, 10, 650, 100);
		panelSup.setBackground(Color.decode("#d1d4e6"));
		panelSup.setLayout(null);
		add(panelSup);
		
		bienvenida = new JLabel("Bienvenido, usuario :D"); // despues solo dejar " " para poner el texto en el controlador
		bienvenida.setBounds(20, 20, 650, 52);
		bienvenida.setForeground(Color.decode("#11121d"));
		bienvenida.setFont(new Font("Arial", Font.BOLD, 50));
		panelSup.add(bienvenida);
		
		titulo = new JLabel("RESIDENTE DEL CONJUNTO GREEN TOWER RESIDENCIAL");
		titulo.setBounds(30, 80, 650, 14);
		titulo.setForeground(Color.decode("#11121d"));
		titulo.setFont(new Font("Arial", Font.ROMAN_BASELINE, 12));
		panelSup.add(titulo);
		
		// ------------PANEL DERECHO----------------
		panelDer = new JPanel();
		panelDer.setBounds(820, 0, 280, 720);
		panelDer.setBackground(Color.decode("#d1d4e6"));
		panelDer.setLayout(null);
		add(panelDer);
		
		
		//-------------
		pInfoPersona = new JPanel();
		pInfoPersona.setBounds(10, 10, 245, 65);
		pInfoPersona.setBackground(Color.decode("#7984b7"));
		pInfoPersona.setLayout(null);
		panelDer.add(pInfoPersona);
		
		fotoPreview = new JLabel();
		fotoPreview.setBounds(5, 7, 50, 50);
		fotoPreview.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pInfoPersona.add(fotoPreview);
		
		nombre = new JLabel("Carlos");// despues solo dejar " " para poner el texto en el controlador
		nombre.setBounds(65, 15, 650, 16);
		nombre.setForeground(Color.decode("#11121d"));
		nombre.setFont(new Font("Arial", Font.BOLD, 14));
		pInfoPersona.add(nombre);
		
		tipo = new JLabel("Propietario");// despues solo dejar " " para poner el texto en el controlador
		tipo.setBounds(65, 35, 650, 14);
		tipo.setForeground(Color.decode("#11121d"));
		tipo.setFont(new Font("Arial", Font.ROMAN_BASELINE, 13));
		pInfoPersona.add(tipo);
		
		//-------------
		pNotificacion = new JPanel();
		pNotificacion.setBounds(10, 90, 245, 140);
		pNotificacion.setBackground(Color.decode("#7984b7"));
		pNotificacion.setLayout(null);
		panelDer.add(pNotificacion);
		
		noti = new JLabel("Notificaciones");
		noti.setBounds(75, 15, 650, 16);
		noti.setForeground(Color.decode("#11121d"));
		noti.setFont(new Font("Arial", Font.BOLD, 14));
		pNotificacion.add(noti);
		
		String[] columnas = { "Notificaciones" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		campoNoti = new JTable(modelo);
		campoNoti.setBackground(Color.decode("#fad0ce"));
		campoNoti.setForeground(Color.decode("#40110f"));
		campoNoti.getTableHeader().setBackground(Color.decode("#cd3a35"));
		campoNoti.getTableHeader().setForeground(Color.decode("#fdf3f3"));
		campoNoti.getColumnModel().getColumn(0).setPreferredWidth(320);
		JScrollPane scroll = new JScrollPane(campoNoti);
		scroll.setBounds(5, 37, 235, 90);
		scroll.setBackground(Color.decode("#fad0ce"));
		pNotificacion.add(scroll);
		
		//-------------
		pPaquete = new JPanel();
		pPaquete.setBounds(10, 245, 245, 140);
		pPaquete.setBackground(Color.decode("#7984b7"));
		pPaquete.setLayout(null);
		panelDer.add(pPaquete);
		
		paquete = new JLabel("Paquetes");
		paquete.setBounds(90, 15, 650, 16);
		paquete.setForeground(Color.decode("#11121d"));
		paquete.setFont(new Font("Arial", Font.BOLD, 14));
		pPaquete.add(paquete);
		
		String[] columnas2 = { "Paquetes en porteria" };
		DefaultTableModel modelo2 = new DefaultTableModel(columnas2, 0);
		campoPaquete = new JTable(modelo2);
		campoPaquete.setBackground(Color.decode("#fad0ce"));
		campoPaquete.setForeground(Color.decode("#40110f"));
		campoPaquete.getTableHeader().setBackground(Color.decode("#cd3a35"));
		campoPaquete.getTableHeader().setForeground(Color.decode("#fdf3f3"));
		campoPaquete.getColumnModel().getColumn(0).setPreferredWidth(320);
		JScrollPane scroll2 = new JScrollPane(campoPaquete);
		scroll2.setBounds(5, 37, 235, 90);
		scroll2.setBackground(Color.decode("#fad0ce"));
		pPaquete.add(scroll2);
		//-------------
		pFamilia = new JPanel();
		pFamilia.setBounds(10, 400, 245, 270);
		pFamilia.setBackground(Color.decode("#7984b7"));
		pFamilia.setLayout(null);
		panelDer.add(pFamilia);
		
		persona = new JLabel("Familia");
		persona.setBounds(100, 15, 650, 16);
		persona.setForeground(Color.decode("#11121d"));
		persona.setFont(new Font("Arial", Font.BOLD, 14));
		pFamilia.add(persona);
		
		String[] columnas1 = { "Familia y visitantes" };
		DefaultTableModel modelo1 = new DefaultTableModel(columnas1, 0);
		tablaPersona = new JTable(modelo1);
		tablaPersona.setBackground(Color.decode("#fad0ce"));
		tablaPersona.setForeground(Color.decode("#40110f"));
		tablaPersona.getTableHeader().setBackground(Color.decode("#cd3a35"));
		tablaPersona.getTableHeader().setForeground(Color.decode("#fdf3f3"));
		tablaPersona.getColumnModel().getColumn(0).setPreferredWidth(320);
		JScrollPane scroll1 = new JScrollPane(tablaPersona);
		scroll1.setBounds(5, 37, 235, 220);
		scroll1.setBackground(Color.decode("#fad0ce"));
		pFamilia.add(scroll1);

	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}
	
}
