package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Coworking;

public class CoworkingDAO implements DAO<Coworking> {

	private ArrayList<Coworking> listaCoworkings;
	private final String URL_ARCHIVO_SERIALIZADO = "coworkings.dat";

	public CoworkingDAO() {
		listaCoworkings = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Coworking nuevoDato) {
		listaCoworkings.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaCoworkings.size()) {
			return false;
		} else {
			listaCoworkings.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Coworking datoActualziado) {
		if (index < 0 || index >= listaCoworkings.size()) {
			return false;
		} else {
			listaCoworkings.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Coworking coworking : listaCoworkings) {
			dato += posicion + " ";
			dato += coworking.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaCoworkings.get(index).toString();
	}

	@Override
	public ArrayList<Coworking> mostrarTodo() {
		return listaCoworkings;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaCoworkings);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaCoworkings = new ArrayList<Coworking>();
		} else {
			listaCoworkings = (ArrayList<Coworking>) contenido;
		}
	}

	public ArrayList<Coworking> getListaCoworkings() {
		return listaCoworkings;
	}

	public void setListaCoworkings(ArrayList<Coworking> listaCoworkings) {
		this.listaCoworkings = listaCoworkings;
	}
}