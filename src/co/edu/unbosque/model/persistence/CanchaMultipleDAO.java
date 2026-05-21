package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CanchaMultiple;
import co.edu.unbosque.model.CanchaMultipleDTO;

public class CanchaMultipleDAO implements DAO<CanchaMultiple, CanchaMultipleDTO> {

	private ArrayList<CanchaMultiple> listaCanchasMultiples;
	private final String URL_ARCHIVO_TEXTO = "canchasMultiples.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "canchasMultiples.dat";
	private DataMapper dm;

	public CanchaMultipleDAO() {
		listaCanchasMultiples = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(CanchaMultipleDTO nuevoDato) {
		listaCanchasMultiples.add(DataMapper.convertirCanchaMultipleDTOACanchaMultiple(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaCanchasMultiples.size()) {
			return false;
		} else {
			listaCanchasMultiples.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, CanchaMultipleDTO datoActualizado) {
		if (index < 0 || index >= listaCanchasMultiples.size()) {
			return false;
		} else {
			listaCanchasMultiples.set(index, DataMapper.convertirCanchaMultipleDTOACanchaMultiple(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (CanchaMultiple canchaMultiple : listaCanchasMultiples) {
			dato += posicion + " ";
			dato += canchaMultiple.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirCanchaMultipleACanchaMultipleDTO(listaCanchasMultiples.get(index)).toString();
	}

	@Override
	public ArrayList<CanchaMultipleDTO> mostrarTodo() {
		return DataMapper.convertirListaCanchaMultipleAListaCanchaMultipleDTO(listaCanchasMultiples);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (CanchaMultiple canchaMultiple : listaCanchasMultiples) {
			sb.append(canchaMultiple.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaCanchasMultiples);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaCanchasMultiples = new ArrayList<CanchaMultiple>();
		} else {
			listaCanchasMultiples = (ArrayList<CanchaMultiple>) contenido;
		}
	}

	public ArrayList<CanchaMultiple> getListaCanchasMultiples() {
		return listaCanchasMultiples;
	}

	public void setListaCanchasMultiples(ArrayList<CanchaMultiple> listaCanchasMultiples) {
		this.listaCanchasMultiples = listaCanchasMultiples;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
