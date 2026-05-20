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
		
		vf.getVp().getPanSelect().getResidente().addActionListener(this);
		vf.getVp().getPanSelect().getResidente().setActionCommand("boton_entrar_residente");
		
		vf.getVp().getPanSelect().getAdmin().addActionListener(this);
		vf.getVp().getPanSelect().getAdmin().setActionCommand("boton_entrar_admin");
		
		vf.getVp().getPanSelect().getEmpleado().addActionListener(this);
		vf.getVp().getPanSelect().getEmpleado().setActionCommand("boton_entrar_empleado");
		
		//===VENTANA RESIDENTES===
		vf.getVr().getIniciarSesion().addActionListener(this);
		vf.getVr().getIniciarSesion().setActionCommand("boton_ingresar_residente");
		
		//===VENTANA ADMINISTRADORES===
		vf.getVa().getIniciarSesion().addActionListener(this);
		vf.getVa().getIniciarSesion().setActionCommand("boton_ingresar_admin");
		
		vf.getVa().getRegistrarse().addActionListener(this);
		vf.getVa().getRegistrarse().setActionCommand("boton_registrarse_admin");
		
		// ===VENTANA EMPLEADOS===
		vf.getVe().getIniciarSesion().addActionListener(this);
		vf.getVe().getIniciarSesion().setActionCommand("boton_ingresar_empleado");
		
		//===BOTONES DE VOLVER===
		vf.getVa().getVolver().addActionListener(this);
		vf.getVa().getVolver().setActionCommand("boton_volver_en_va");
		
		vf.getVr().getVolver().addActionListener(this);
		vf.getVr().getVolver().setActionCommand("boton_volver_en_vr");

		vf.getVe().getVolver().addActionListener(this);
		vf.getVe().getVolver().setActionCommand("boton_volver_en_ve");
		
		vf.getVa().getPpa().getVolver().addActionListener(this);
		vf.getVa().getPpa().getVolver().setActionCommand("boton_volver_iniciar_va");
		
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
		case "boton_entrar_residente":{
			vf.getVp().setVisible(false);
			vf.getVr().setVisible(true);
			break;
		}
		case "boton_entrar_admin":{
			vf.getVp().setVisible(false);
			vf.getVa().setVisible(true);
			break;
		}
		case "boton_entrar_empleado":{
			vf.getVp().setVisible(false);
			vf.getVe().setVisible(true);
			break;
		}
		case "boton_volver_en_va":{
			vf.getVa().setVisible(false);
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_volver_en_vr":{
			vf.getVr().setVisible(false);
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_volver_en_ve":{
			vf.getVe().setVisible(false);
			vf.getVp().setVisible(true);
			break;
		}
		case "boton_ingresar_admin":{
			vf.getVa().getPanelUno().setVisible(false);
			vf.getVa().getPpa().setVisible(true);
			break;
		}
		case "boton_registrarse_admin":{
			vf.getVa().getPanelUno().setVisible(false);
			vf.getVa().getPra().setVisible(true);
			break;
		}
		case "boton_volver_iniciar_va":{
			vf.getVa().getPpa().setVisible(false);
			vf.getVa().getPanelUno().setVisible(true);
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
