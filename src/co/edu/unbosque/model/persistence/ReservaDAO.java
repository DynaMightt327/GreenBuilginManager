package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Reserva;

public class ReservaDAO implements DAO<Reserva> {

	private ArrayList<Reserva> listaReservas;
	private final String URL_ARCHIVO_SERIALIZADO = "reservas.dat";

	public ReservaDAO() {
		listaReservas = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Reserva nuevoDato) {
		listaReservas.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaReservas.size()) {
			return false;
		} else {
			listaReservas.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Reserva datoActualziado) {
		if (index < 0 || index >= listaReservas.size()) {
			return false;
		} else {
			listaReservas.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Reserva reserva : listaReservas) {
			dato += posicion + " ";
			dato += reserva.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaReservas.get(index).toString();
	}

	@Override
	public ArrayList<Reserva> mostrarTodo() {
		return listaReservas;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaReservas);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaReservas = new ArrayList<Reserva>();
		} else {
			listaReservas = (ArrayList<Reserva>) contenido;
		}
	}

	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
}