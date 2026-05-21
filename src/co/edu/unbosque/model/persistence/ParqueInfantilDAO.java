package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ParqueInfantil;
import co.edu.unbosque.model.ParqueInfantilDTO;

public class ParqueInfantilDAO implements DAO<ParqueInfantil, ParqueInfantilDTO> {

	private ArrayList<ParqueInfantil> listaParquesInfantiles;
	private final String URL_ARCHIVO_TEXTO = "parquesInfantiles.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "parquesInfantiles.dat";
	private DataMapper dm;

	public ParqueInfantilDAO() {
		listaParquesInfantiles = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ParqueInfantilDTO nuevoDato) {
		listaParquesInfantiles.add(DataMapper.convertirParqueInfantilDTOAParqueInfantil(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaParquesInfantiles.size()) {
			return false;
		} else {
			listaParquesInfantiles.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ParqueInfantilDTO datoActualizado) {
		if (index < 0 || index >= listaParquesInfantiles.size()) {
			return false;
		} else {
			listaParquesInfantiles.set(index, DataMapper.convertirParqueInfantilDTOAParqueInfantil(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ParqueInfantil parqueInfantil : listaParquesInfantiles) {
			dato += posicion + " ";
			dato += parqueInfantil.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirParqueInfantilAParqueInfantilDTO(listaParquesInfantiles.get(index)).toString();
	}

	@Override
	public ArrayList<ParqueInfantilDTO> mostrarTodo() {
		return DataMapper.convertirListaParqueInfantilAListaParqueInfantilDTO(listaParquesInfantiles);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (ParqueInfantil parqueInfantil : listaParquesInfantiles) {
			sb.append(parqueInfantil.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaParquesInfantiles);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaParquesInfantiles = new ArrayList<ParqueInfantil>();
		} else {
			listaParquesInfantiles = (ArrayList<ParqueInfantil>) contenido;
		}
	}

	public ArrayList<ParqueInfantil> getListaParquesInfantiles() {
		return listaParquesInfantiles;
	}

	public void setListaParquesInfantiles(ArrayList<ParqueInfantil> listaParquesInfantiles) {
		this.listaParquesInfantiles = listaParquesInfantiles;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
