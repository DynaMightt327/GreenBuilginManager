package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Coworking;
import co.edu.unbosque.model.CoworkingDTO;

public class CoworkingDAO implements DAO<Coworking, CoworkingDTO> {

	private ArrayList<Coworking> listaCoworkings;
	private final String URL_ARCHIVO_TEXTO = "coworkings.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "coworkings.dat";
	private DataMapper dm;

	public CoworkingDAO() {
		listaCoworkings = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(CoworkingDTO nuevoDato) {
		listaCoworkings.add(DataMapper.convertirCoworkingDTOACoworking(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaCoworkings.size()) {
			return false;
		} else {
			listaCoworkings.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, CoworkingDTO datoActualizado) {
		if (index < 0 || index >= listaCoworkings.size()) {
			return false;
		} else {
			listaCoworkings.set(index, DataMapper.convertirCoworkingDTOACoworking(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Coworking coworking : listaCoworkings) {
			dato += posicion + " ";
			dato += coworking.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirCoworkingACoworkingDTO(listaCoworkings.get(index)).toString();
	}

	@Override
	public ArrayList<CoworkingDTO> mostrarTodo() {
		return DataMapper.convertirListaCoworkingAListaCoworkingDTO(listaCoworkings);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Coworking coworking : listaCoworkings) {
			sb.append(coworking.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaCoworkings);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaCoworkings = new ArrayList<Coworking>();
		} else {
			listaCoworkings = (ArrayList<Coworking>) contenido;
		}
	}

	public ArrayList<Coworking> getListaCoworkings() {
		return listaCoworkings;
	}

	public void setListaCoworkings(ArrayList<Coworking> listaCoworkings) {
		this.listaCoworkings = listaCoworkings;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
