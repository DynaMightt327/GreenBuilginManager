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
		
		
	}

	
	public void iniciar() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "": {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + alias);
		}
		
	}

}
