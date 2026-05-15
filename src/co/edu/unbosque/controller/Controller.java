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
		
		//===VENTANA PRINCIPAL===
		vf.getVp().getEntrar().addActionListener(this);
		vf.getVp().getEntrar().setActionCommand("boton_entrar_app");
		
		vf.getVp().getPanSelect().getIniciarSesion().addActionListener(this);
		vf.getVp().getPanSelect().getIniciarSesion().setActionCommand("boton_iniciar_sesion");
		
		vf.getVp().getPanSelect().getAdmin().addActionListener(this);
		vf.getVp().getPanSelect().getAdmin().setActionCommand("boton_entrar_admin");
		
		//===VENTANA INICIAR SESION===
		vf.getVi().getIniciarSesion().addActionListener(this);
		vf.getVi().getIniciarSesion().setActionCommand("boton_ingresar");
		
		//===VENTANA ADMINISTRADORES===
		vf.getVa().getIniciarSesion().addActionListener(this);
		vf.getVa().getIniciarSesion().setActionCommand("boton_ingresar_admin");
		
		//===BOTONES DE VOLVER===
		vf.getVa().getVolver().addActionListener(this);
		vf.getVa().getVolver().setActionCommand("boton_volver_en_va");
		
		vf.getVi().getVolver().addActionListener(this);
		vf.getVi().getVolver().setActionCommand("boton_volver_en_vi");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "boton_entrar_app": {
			vf.getVp().getPanSelect().setVisible(true);
			vf.getVp().getEntrar().setVisible(false);
			break;
		}
		case "boton_iniciar_sesion":{
			vf.getVp().setVisible(false);
			vf.getVi().setVisible(true);
			break;
		}
		case "boton_entrar_admin":{
			vf.getVp().setVisible(false);
			vf.getVa().setVisible(true);
			break;
		}
		case "boton_volver_en_va":{
			vf.getVa().setVisible(false);
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_volver_en_vi":{
			vf.getVi().setVisible(false);
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_ingresar_admin":{
			vf.getVa().getPanelUno().setVisible(false);
			vf.getVa().getPpa().setVisible(true);
			break;
		}
		default:{
			break;
		}
		}

	}

	public void iniciar() {
		vf.getVp().setVisible(true);
	}

}
