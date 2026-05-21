package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Aviso;

public class AvisoDAO implements DAO<Aviso> {

	private ArrayList<Aviso> listaAvisos;
	private final String URL_ARCHIVO_SERIALIZADO = "avisos.dat";

	public AvisoDAO() {
		listaAvisos = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Aviso nuevoDato) {
		listaAvisos.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAvisos.size()) {
			return false;
		} else {
			listaAvisos.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Aviso datoActualziado) {
		if (index < 0 || index >= listaAvisos.size()) {
			return false;
		} else {
			listaAvisos.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Aviso aviso : listaAvisos) {
			dato += posicion + " ";
			dato += aviso.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaAvisos.get(index).toString();
	}

	@Override
	public ArrayList<Aviso> mostrarTodo() {
		return listaAvisos;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaAvisos);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaAvisos = new ArrayList<Aviso>();
		} else {
			listaAvisos = (ArrayList<Aviso>) contenido;
		}
	}

	public ArrayList<Aviso> getListaAvisos() {
		return listaAvisos;
	}

	public void setListaAvisos(ArrayList<Aviso> listaAvisos) {
		this.listaAvisos = listaAvisos;
	}
}