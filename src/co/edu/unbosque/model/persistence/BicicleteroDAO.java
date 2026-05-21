package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Bicicletero;

public class BicicleteroDAO implements DAO<Bicicletero> {

	private ArrayList<Bicicletero> listaBicicleteros;
	private final String URL_ARCHIVO_SERIALIZADO = "bicicleteros.dat";

	public BicicleteroDAO() {
		listaBicicleteros = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Bicicletero nuevoDato) {
		listaBicicleteros.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaBicicleteros.size()) {
			return false;
		} else {
			listaBicicleteros.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Bicicletero datoActualziado) {
		if (index < 0 || index >= listaBicicleteros.size()) {
			return false;
		} else {
			listaBicicleteros.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Bicicletero bicicletero : listaBicicleteros) {
			dato += posicion + " ";
			dato += bicicletero.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaBicicleteros.get(index).toString();
	}

	@Override
	public ArrayList<Bicicletero> mostrarTodo() {
		return listaBicicleteros;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaBicicleteros);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaBicicleteros = new ArrayList<Bicicletero>();
		} else {
			listaBicicleteros = (ArrayList<Bicicletero>) contenido;
		}
	}

	public ArrayList<Bicicletero> getListaBicicleteros() {
		return listaBicicleteros;
	}

	public void setListaBicicleteros(ArrayList<Bicicletero> listaBicicleteros) {
		this.listaBicicleteros = listaBicicleteros;
	}
}
