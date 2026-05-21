package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.SalonComunal;

public class SalonComunalDAO implements DAO<SalonComunal> {

	private ArrayList<SalonComunal> listaSalonesComunales;
	private final String URL_ARCHIVO_SERIALIZADO = "salonesComunales.dat";

	public SalonComunalDAO() {
		listaSalonesComunales = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(SalonComunal nuevoDato) {
		listaSalonesComunales.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaSalonesComunales.size()) {
			return false;
		} else {
			listaSalonesComunales.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, SalonComunal datoActualziado) {
		if (index < 0 || index >= listaSalonesComunales.size()) {
			return false;
		} else {
			listaSalonesComunales.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (SalonComunal salonComunal : listaSalonesComunales) {
			dato += posicion + " ";
			dato += salonComunal.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaSalonesComunales.get(index).toString();
	}

	@Override
	public ArrayList<SalonComunal> mostrarTodo() {
		return listaSalonesComunales;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaSalonesComunales);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaSalonesComunales = new ArrayList<SalonComunal>();
		} else {
			listaSalonesComunales = (ArrayList<SalonComunal>) contenido;
		}
	}

	public ArrayList<SalonComunal> getListaSalonesComunales() {
		return listaSalonesComunales;
	}

	public void setListaSalonesComunales(ArrayList<SalonComunal> listaSalonesComunales) {
		this.listaSalonesComunales = listaSalonesComunales;
	}
}