package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	private ViewFacade vf;

	public Controller() {
		vf = new ViewFacade();
		asignarOyentes();
	}

	public void asignarOyentes() {
		// ===========PRINCIPAL==============
		vf.getVi().getAdmin().addActionListener(this);
		vf.getVi().getAdmin().setActionCommand("iniciar_admin");

		vf.getVi().getResidente().addActionListener(this);
		vf.getVi().getResidente().setActionCommand("iniciar_residente");

		vf.getVi().getEmpleado().addActionListener(this);
		vf.getVi().getEmpleado().setActionCommand("iniciar_empleado");

		vf.getVi().getVisitante().addActionListener(this);
		vf.getVi().getVisitante().setActionCommand("iniciar_visitante");

		// ===========ADMINISTRADOR==============
		vf.getVa().getVolver().addActionListener(this);
		vf.getVa().getVolver().setActionCommand("volver_en_admin");
		
		vf.getVa().getRegistrar().addActionListener(this);
		vf.getVa().getRegistrar().setActionCommand("registrar_admin");
		
		vf.getVa().getPra().getVolver().addActionListener(this);
		vf.getVa().getPra().getVolver().setActionCommand("volver_registrar_admin");

		// ===========RESIDENTE==============
		vf.getVr().getVolver().addActionListener(this);
		vf.getVr().getVolver().setActionCommand("volver_en_residente");
		
		vf.getVr().getRegistrar().addActionListener(this);
		vf.getVr().getRegistrar().setActionCommand("registrar_residente");
		
		vf.getVr().getPrr().getVolver().addActionListener(this);
		vf.getVr().getPrr().getVolver().setActionCommand("volver_registrar_residente");

		// ===========EMPLEADO==============
		vf.getVe().getVolver().addActionListener(this);
		vf.getVe().getVolver().setActionCommand("volver_en_empleado");

		// ===========VISITANTE==============
		vf.getVv().getVolver().addActionListener(this);
		vf.getVv().getVolver().setActionCommand("volver_en_visitante");
		

	}

	public void iniciar() {
		vf.getVi().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "iniciar_admin": {
			vf.getVi().setVisible(false);
			vf.getVa().setVisible(true);
			break;
		}
		case "volver_en_admin": {
			vf.getVa().setVisible(false);
			vf.getVi().setVisible(true);
			break;
		}
		case "iniciar_residente": {
			vf.getVi().setVisible(false);
			vf.getVr().setVisible(true);
			break;
		}
		case "volver_en_residente": {
			vf.getVr().setVisible(false);
			vf.getVi().setVisible(true);
			break;
		}
		case "iniciar_empleado": {
			vf.getVi().setVisible(false);
			vf.getVe().setVisible(true);
			break;
		}
		case "volver_en_empleado": {
			vf.getVe().setVisible(false);
			vf.getVi().setVisible(true);
			break;
		}
		case "iniciar_visitante": {
			vf.getVi().setVisible(false);
			vf.getVv().setVisible(true);
			break;
		}
		case "volver_en_visitante": {
			vf.getVv().setVisible(false);
			vf.getVi().setVisible(true);
			break;
		}
		case "registrar_admin":{
			vf.getVa().getPanelBotones().setVisible(false);
			vf.getVa().getPra().setVisible(true);
			break;
		}
		case "volver_registrar_admin":{
			vf.getVa().getPanelBotones().setVisible(true);
			vf.getVa().getPra().setVisible(false);
			break;
		}
		case "registrar_residente":{
			vf.getVr().getPanelBotones().setVisible(false);
			vf.getVr().getPrr().setVisible(true);
			break;
		}
		case "volver_registrar_residente":{
			vf.getVr().getPanelBotones().setVisible(true);
			vf.getVr().getPrr().setVisible(false);
			break;
		}
		default: {
			break;
		}
		}

	}

}
