package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Torre;

public class TorreDAO implements DAO<Torre> {

	private ArrayList<Torre> listaTorres;
	private final String URL_ARCHIVO_SERIALIZADO = "torres.dat";

	public TorreDAO() {
		listaTorres = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Torre nuevoDato) {
		listaTorres.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaTorres.size()) {
			return false;
		} else {
			listaTorres.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Torre datoActualziado) {
		if (index < 0 || index >= listaTorres.size()) {
			return false;
		} else {
			listaTorres.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Torre torre : listaTorres) {
			dato += posicion + " ";
			dato += torre.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaTorres.get(index).toString();
	}

	@Override
	public ArrayList<Torre> mostrarTodo() {
		return listaTorres;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaTorres);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaTorres = new ArrayList<Torre>();
		} else {
			listaTorres = (ArrayList<Torre>) contenido;
		}
	}

	public ArrayList<Torre> getListaTorres() {
		return listaTorres;
	}

	public void setListaTorres(ArrayList<Torre> listaTorres) {
		this.listaTorres = listaTorres;
	}
}