package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistrarResidente extends JPanel {
	
	private JLabel tipo;
	private JLabel numApartamento;
	private JLabel torre;
	private JLabel parqueadero;
	private JLabel mascota;
	private JLabel vehiculo;
	private JLabel cargadorDeAuto;
	private JLabel bicicleta;
	private JLabel numBicicletero;
	private JLabel paquete;
	private JLabel multa;
	private JLabel fechaInicio;
	
	private JTextField ttipo;
	private JTextField tnumApartamento;
	private JTextField ttorre;
	private JTextField tparqueadero;
	private JTextField tmascota;
	private JTextField tvehiculo;
	private JComboBox<String> tcargadorDeAuto;
	private JComboBox<String> tbicicleta;
	private JTextField tnumBicicletero;
	private JComboBox<String> tpaquete;
	private JComboBox<String> tmulta;
	private JTextField tfechaInicio;
	
	public PanelRegistrarResidente() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		this.setBounds(110, 0, 740, 720);
		this.setLayout(null);
		this.setBackground(Color.white);

	}

	public JLabel getTipo() {
		return tipo;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JLabel getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(JLabel numApartamento) {
		this.numApartamento = numApartamento;
	}

	public JLabel getTorre() {
		return torre;
	}

	public void setTorre(JLabel torre) {
		this.torre = torre;
	}

	public JLabel getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(JLabel parqueadero) {
		this.parqueadero = parqueadero;
	}

	public JLabel getMascota() {
		return mascota;
	}

	public void setMascota(JLabel mascota) {
		this.mascota = mascota;
	}

	public JLabel getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(JLabel vehiculo) {
		this.vehiculo = vehiculo;
	}

	public JLabel getCargadorDeAuto() {
		return cargadorDeAuto;
	}

	public void setCargadorDeAuto(JLabel cargadorDeAuto) {
		this.cargadorDeAuto = cargadorDeAuto;
	}

	public JLabel getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(JLabel bicicleta) {
		this.bicicleta = bicicleta;
	}

	public JLabel getNumBicicletero() {
		return numBicicletero;
	}

	public void setNumBicicletero(JLabel numBicicletero) {
		this.numBicicletero = numBicicletero;
	}

	public JLabel getPaquete() {
		return paquete;
	}

	public void setPaquete(JLabel paquete) {
		this.paquete = paquete;
	}

	public JLabel getMulta() {
		return multa;
	}

	public void setMulta(JLabel multa) {
		this.multa = multa;
	}

	public JLabel getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(JLabel fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public JTextField getTtipo() {
		return ttipo;
	}

	public void setTtipo(JTextField ttipo) {
		this.ttipo = ttipo;
	}

	public JTextField getTnumApartamento() {
		return tnumApartamento;
	}

	public void setTnumApartamento(JTextField tnumApartamento) {
		this.tnumApartamento = tnumApartamento;
	}

	public JTextField getTtorre() {
		return ttorre;
	}

	public void setTtorre(JTextField ttorre) {
		this.ttorre = ttorre;
	}

	public JTextField getTparqueadero() {
		return tparqueadero;
	}

	public void setTparqueadero(JTextField tparqueadero) {
		this.tparqueadero = tparqueadero;
	}

	public JTextField getTmascota() {
		return tmascota;
	}

	public void setTmascota(JTextField tmascota) {
		this.tmascota = tmascota;
	}

	public JTextField getTvehiculo() {
		return tvehiculo;
	}

	public void setTvehiculo(JTextField tvehiculo) {
		this.tvehiculo = tvehiculo;
	}

	public JComboBox<String> getTcargadorDeAuto() {
		return tcargadorDeAuto;
	}

	public void setTcargadorDeAuto(JComboBox<String> tcargadorDeAuto) {
		this.tcargadorDeAuto = tcargadorDeAuto;
	}

	public JComboBox<String> getTbicicleta() {
		return tbicicleta;
	}

	public void setTbicicleta(JComboBox<String> tbicicleta) {
		this.tbicicleta = tbicicleta;
	}

	public JTextField getTnumBicicletero() {
		return tnumBicicletero;
	}

	public void setTnumBicicletero(JTextField tnumBicicletero) {
		this.tnumBicicletero = tnumBicicletero;
	}

	public JComboBox<String> getTpaquete() {
		return tpaquete;
	}

	public void setTpaquete(JComboBox<String> tpaquete) {
		this.tpaquete = tpaquete;
	}

	public JComboBox<String> getTmulta() {
		return tmulta;
	}

	public void setTmulta(JComboBox<String> tmulta) {
		this.tmulta = tmulta;
	}

	public JTextField getTfechaInicio() {
		return tfechaInicio;
	}

	public void setTfechaInicio(JTextField tfechaInicio) {
		this.tfechaInicio = tfechaInicio;
	}
		

}
