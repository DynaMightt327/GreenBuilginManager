package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Administrador;

public class AdministradorDAO implements DAO<Administrador> {

	private ArrayList<Administrador> listaAdministradores;
	private final String URL_ARCHIVO_SERIALIZADO = "administradores.dat";

	public AdministradorDAO() {
		listaAdministradores = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Administrador nuevoDato) {
		listaAdministradores.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAdministradores.size()) {
			return false;
		} else {
			listaAdministradores.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Administrador datoActualziado) {
		if (index < 0 || index >= listaAdministradores.size()) {
			return false;
		} else {
			listaAdministradores.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Administrador administrador : listaAdministradores) {
			dato += posicion + " ";
			dato += administrador.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaAdministradores.get(index).toString();
	}

	@Override
	public ArrayList<Administrador> mostrarTodo() {
		return listaAdministradores;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaAdministradores);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaAdministradores = new ArrayList<Administrador>();
		} else {
			listaAdministradores = (ArrayList<Administrador>) contenido;
		}
	}

	public ArrayList<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}

	public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}
}