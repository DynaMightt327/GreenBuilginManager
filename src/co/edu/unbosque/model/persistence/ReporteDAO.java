package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Reporte;

public class ReporteDAO implements DAO<Reporte> {

	private ArrayList<Reporte> listaReportes;
	private final String URL_ARCHIVO_SERIALIZADO = "reportes.dat";

	public ReporteDAO() {
		listaReportes = new ArrayList<>();
		leerSerializado();
	}

	@Override
	public void crear(Reporte nuevoDato) {
		listaReportes.add(nuevoDato);
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaReportes.size()) {
			return false;
		} else {
			listaReportes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Reporte datoActualziado) {
		if (index < 0 || index >= listaReportes.size()) {
			return false;
		} else {
			listaReportes.set(index, datoActualziado);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Reporte reporte : listaReportes) {
			dato += posicion + " ";
			dato += reporte.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaReportes.get(index).toString();
	}

	@Override
	public ArrayList<Reporte> mostrarTodo() {
		return listaReportes;
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaReportes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaReportes = new ArrayList<Reporte>();
		} else {
			listaReportes = (ArrayList<Reporte>) contenido;
		}
	}

	public ArrayList<Reporte> getListaReportes() {
		return listaReportes;
	}

	public void setListaReportes(ArrayList<Reporte> listaReportes) {
		this.listaReportes = listaReportes;
	}
}