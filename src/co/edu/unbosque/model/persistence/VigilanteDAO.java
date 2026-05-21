package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Vigilante;

public class VigilanteDAO implements DAO<Vigilante> {

	private ArrayList<Vigilante> listaVigilantes;
	private final String URL_ARCHIVO_SERIALIZADO = "vigilantes.dat";

	public VigilanteDAO() {
		listaVigilantes = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Vigilante nuevoDato) {
		listaVigilantes.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaVigilantes.size()) {
			return false;
		} else {
			listaVigilantes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Vigilante datoActualziado) {
		if (index < 0 || index >= listaVigilantes.size()) {
			return false;
		} else {
			listaVigilantes.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Vigilante vigilante : listaVigilantes) {
			dato += posicion + " ";
			dato += vigilante.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaVigilantes.get(index).toString();
	}

	@Override
	public ArrayList<Vigilante> mostrarTodo() {
		return listaVigilantes;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaVigilantes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaVigilantes = new ArrayList<Vigilante>();
		} else {
			listaVigilantes = (ArrayList<Vigilante>) contenido;
		}
	}

	public ArrayList<Vigilante> getListaVigilantes() {
		return listaVigilantes;
	}

	public void setListaVigilantes(ArrayList<Vigilante> listaVigilantes) {
		this.listaVigilantes = listaVigilantes;
	}
}