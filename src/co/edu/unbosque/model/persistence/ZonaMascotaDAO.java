package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ZonaMascota;

public class ZonaMascotaDAO implements DAO<ZonaMascota> {

	private ArrayList<ZonaMascota> listaZonasMascotas;
	private final String URL_ARCHIVO_SERIALIZADO = "zonasMascotas.dat";

	public ZonaMascotaDAO() {
		listaZonasMascotas = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(ZonaMascota nuevoDato) {
		listaZonasMascotas.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaZonasMascotas.size()) {
			return false;
		} else {
			listaZonasMascotas.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ZonaMascota datoActualziado) {
		if (index < 0 || index >= listaZonasMascotas.size()) {
			return false;
		} else {
			listaZonasMascotas.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ZonaMascota zonaMascota : listaZonasMascotas) {
			dato += posicion + " ";
			dato += zonaMascota.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaZonasMascotas.get(index).toString();
	}

	@Override
	public ArrayList<ZonaMascota> mostrarTodo() {
		return listaZonasMascotas;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaZonasMascotas);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaZonasMascotas = new ArrayList<ZonaMascota>();
		} else {
			listaZonasMascotas = (ArrayList<ZonaMascota>) contenido;
		}
	}

	public ArrayList<ZonaMascota> getListaZonasMascotas() {
		return listaZonasMascotas;
	}

	public void setListaZonasMascotas(ArrayList<ZonaMascota> listaZonasMascotas) {
		this.listaZonasMascotas = listaZonasMascotas;
	}
}