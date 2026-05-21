package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Residente;

public class ResidenteDAO implements DAO<Residente> {

	private ArrayList<Residente> listaResidentes;
	private final String URL_ARCHIVO_SERIALIZADO = "residentes.dat";

	public ResidenteDAO() {
		listaResidentes = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Residente nuevoDato) {
		listaResidentes.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaResidentes.size()) {
			return false;
		} else {
			listaResidentes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Residente datoActualziado) {
		if (index < 0 || index >= listaResidentes.size()) {
			return false;
		} else {
			listaResidentes.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Residente residente : listaResidentes) {
			dato += posicion + " ";
			dato += residente.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaResidentes.get(index).toString();
	}

	@Override
	public ArrayList<Residente> mostrarTodo() {
		return listaResidentes;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaResidentes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaResidentes = new ArrayList<Residente>();
		} else {
			listaResidentes = (ArrayList<Residente>) contenido;
		}
	}

	public ArrayList<Residente> getListaResidentes() {
		return listaResidentes;
	}

	public void setListaResidentes(ArrayList<Residente> listaResidentes) {
		this.listaResidentes = listaResidentes;
	}
}