package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Parqueadero;

public class ParqueaderoDAO implements DAO<Parqueadero> {

	private ArrayList<Parqueadero> listaParqueaderos;
	private final String URL_ARCHIVO_SERIALIZADO = "parqueaderos.dat";

	public ParqueaderoDAO() {
		listaParqueaderos = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Parqueadero nuevoDato) {
		listaParqueaderos.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaParqueaderos.size()) {
			return false;
		} else {
			listaParqueaderos.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Parqueadero datoActualziado) {
		if (index < 0 || index >= listaParqueaderos.size()) {
			return false;
		} else {
			listaParqueaderos.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Parqueadero parqueadero : listaParqueaderos) {
			dato += posicion + " ";
			dato += parqueadero.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaParqueaderos.get(index).toString();
	}

	@Override
	public ArrayList<Parqueadero> mostrarTodo() {
		return listaParqueaderos;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaParqueaderos);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaParqueaderos = new ArrayList<Parqueadero>();
		} else {
			listaParqueaderos = (ArrayList<Parqueadero>) contenido;
		}
	}

	public ArrayList<Parqueadero> getListaParqueaderos() {
		return listaParqueaderos;
	}

	public void setListaParqueaderos(ArrayList<Parqueadero> listaParqueaderos) {
		this.listaParqueaderos = listaParqueaderos;
	}
}