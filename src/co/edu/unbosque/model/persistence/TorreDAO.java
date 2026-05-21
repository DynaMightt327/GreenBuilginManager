package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Torre;
import co.edu.unbosque.model.TorreDTO;

public class TorreDAO implements DAO<Torre, TorreDTO> {

	private ArrayList<Torre> listaTorres;
	private final String URL_ARCHIVO_TEXTO = "torres.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "torres.dat";
	private DataMapper dm;

	public TorreDAO() {
		listaTorres = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(TorreDTO nuevoDato) {
		listaTorres.add(DataMapper.convertirTorreDTOATorre(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaTorres.size()) {
			return false;
		} else {
			listaTorres.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, TorreDTO datoActualizado) {
		if (index < 0 || index >= listaTorres.size()) {
			return false;
		} else {
			listaTorres.set(index, DataMapper.convertirTorreDTOATorre(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Torre torre : listaTorres) {
			dato += posicion + " ";
			dato += torre.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirTorreATorreDTO(listaTorres.get(index)).toString();
	}

	@Override
	public ArrayList<TorreDTO> mostrarTodo() {
		return DataMapper.convertirListaTorreAListaTorreDTO(listaTorres);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Torre torre : listaTorres) {
			sb.append(torre.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaTorres);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaTorres = new ArrayList<Torre>();
		} else {
			listaTorres = (ArrayList<Torre>) contenido;
		}
	}

	public ArrayList<Torre> getListaTorres() {
		return listaTorres;
	}

	public void setListaTorres(ArrayList<Torre> listaTorres) {
		this.listaTorres = listaTorres;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
