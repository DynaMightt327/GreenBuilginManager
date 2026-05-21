package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ParqueInfantil;

public class ParqueInfantilDAO implements DAO<ParqueInfantil> {

	private ArrayList<ParqueInfantil> listaParquesInfantiles;
	private final String URL_ARCHIVO_SERIALIZADO = "parquesInfantiles.dat";

	public ParqueInfantilDAO() {
		listaParquesInfantiles = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(ParqueInfantil nuevoDato) {
		listaParquesInfantiles.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaParquesInfantiles.size()) {
			return false;
		} else {
			listaParquesInfantiles.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ParqueInfantil datoActualziado) {
		if (index < 0 || index >= listaParquesInfantiles.size()) {
			return false;
		} else {
			listaParquesInfantiles.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ParqueInfantil parqueInfantil : listaParquesInfantiles) {
			dato += posicion + " ";
			dato += parqueInfantil.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaParquesInfantiles.get(index).toString();
	}

	@Override
	public ArrayList<ParqueInfantil> mostrarTodo() {
		return listaParquesInfantiles;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaParquesInfantiles);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaParquesInfantiles = new ArrayList<ParqueInfantil>();
		} else {
			listaParquesInfantiles = (ArrayList<ParqueInfantil>) contenido;
		}
	}

	public ArrayList<ParqueInfantil> getListaParquesInfantiles() {
		return listaParquesInfantiles;
	}

	public void setListaParquesInfantiles(ArrayList<ParqueInfantil> listaParquesInfantiles) {
		this.listaParquesInfantiles = listaParquesInfantiles;
	}
}