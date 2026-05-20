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
		
		// ===========ADMINISTRADOR==============
		vf.getVa().getVolver().addActionListener(this);
		vf.getVa().getVolver().setActionCommand("volver_en_admin");
		
		// ===========RESIDENTE==============
		vf.getVr().getVolver().addActionListener(this);
		vf.getVr().getVolver().setActionCommand("volver_en_residente");
		
		// ===========EMPLEADO==============
		vf.getVe().getVolver().addActionListener(this);
		vf.getVe().getVolver().setActionCommand("volver_en_empleado");
	
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
		default:{
			break;
		}
		}
		
	}

}
