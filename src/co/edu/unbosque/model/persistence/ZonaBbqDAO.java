package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ZonaBbq;

public class ZonaBbqDAO implements DAO<ZonaBbq> {

	private ArrayList<ZonaBbq> listaZonasBbq;
	private final String URL_ARCHIVO_SERIALIZADO = "zonasBbq.dat";

	public ZonaBbqDAO() {
		listaZonasBbq = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(ZonaBbq nuevoDato) {
		listaZonasBbq.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaZonasBbq.size()) {
			return false;
		} else {
			listaZonasBbq.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ZonaBbq datoActualziado) {
		if (index < 0 || index >= listaZonasBbq.size()) {
			return false;
		} else {
			listaZonasBbq.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ZonaBbq zonaBbq : listaZonasBbq) {
			dato += posicion + " ";
			dato += zonaBbq.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaZonasBbq.get(index).toString();
	}

	@Override
	public ArrayList<ZonaBbq> mostrarTodo() {
		return listaZonasBbq;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaZonasBbq);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaZonasBbq = new ArrayList<ZonaBbq>();
		} else {
			listaZonasBbq = (ArrayList<ZonaBbq>) contenido;
		}
	}

	public ArrayList<ZonaBbq> getListaZonasBbq() {
		return listaZonasBbq;
	}

	public void setListaZonasBbq(ArrayList<ZonaBbq> listaZonasBbq) {
		this.listaZonasBbq = listaZonasBbq;
	}
}