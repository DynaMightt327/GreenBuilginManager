package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Visitante;

public class VisitanteDAO implements DAO<Visitante> {

	private ArrayList<Visitante> listaVisitantes;
	private final String URL_ARCHIVO_SERIALIZADO = "visitantes.dat";

	public VisitanteDAO() {
		listaVisitantes = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Visitante nuevoDato) {
		listaVisitantes.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaVisitantes.size()) {
			return false;
		} else {
			listaVisitantes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Visitante datoActualziado) {
		if (index < 0 || index >= listaVisitantes.size()) {
			return false;
		} else {
			listaVisitantes.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Visitante visitante : listaVisitantes) {
			dato += posicion + " ";
			dato += visitante.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaVisitantes.get(index).toString();
	}

	@Override
	public ArrayList<Visitante> mostrarTodo() {
		return listaVisitantes;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaVisitantes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaVisitantes = new ArrayList<Visitante>();
		} else {
			listaVisitantes = (ArrayList<Visitante>) contenido;
		}
	}

	public ArrayList<Visitante> getListaVisitantes() {
		return listaVisitantes;
	}

	public void setListaVisitantes(ArrayList<Visitante> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}
}