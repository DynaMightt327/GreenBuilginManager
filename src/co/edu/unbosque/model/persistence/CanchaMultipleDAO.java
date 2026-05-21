package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.CanchaMultiple;

public class CanchaMultipleDAO implements DAO<CanchaMultiple> {

	private ArrayList<CanchaMultiple> listaCanchasMultiples;
	private final String URL_ARCHIVO_SERIALIZADO = "canchasMultiples.dat";

	public CanchaMultipleDAO() {
		listaCanchasMultiples = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(CanchaMultiple nuevoDato) {
		listaCanchasMultiples.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaCanchasMultiples.size()) {
			return false;
		} else {
			listaCanchasMultiples.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, CanchaMultiple datoActualziado) {
		if (index < 0 || index >= listaCanchasMultiples.size()) {
			return false;
		} else {
			listaCanchasMultiples.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (CanchaMultiple canchaMultiple : listaCanchasMultiples) {
			dato += posicion + " ";
			dato += canchaMultiple.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaCanchasMultiples.get(index).toString();
	}

	@Override
	public ArrayList<CanchaMultiple> mostrarTodo() {
		return listaCanchasMultiples;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaCanchasMultiples);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaCanchasMultiples = new ArrayList<CanchaMultiple>();
		} else {
			listaCanchasMultiples = (ArrayList<CanchaMultiple>) contenido;
		}
	}

	public ArrayList<CanchaMultiple> getListaCanchasMultiples() {
		return listaCanchasMultiples;
	}

	public void setListaCanchasMultiples(ArrayList<CanchaMultiple> listaCanchasMultiples) {
		this.listaCanchasMultiples = listaCanchasMultiples;
	}
}