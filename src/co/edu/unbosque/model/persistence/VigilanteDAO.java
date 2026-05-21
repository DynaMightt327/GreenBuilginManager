package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Vigilante;
import co.edu.unbosque.model.VigilanteDTO;

public class VigilanteDAO implements DAO<Vigilante, VigilanteDTO> {

	private ArrayList<Vigilante> listaVigilantes;
	private final String URL_ARCHIVO_TEXTO = "vigilantes.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "vigilantes.dat";
	private DataMapper dm;

	public VigilanteDAO() {
		listaVigilantes = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(VigilanteDTO nuevoDato) {
		listaVigilantes.add(DataMapper.convertirVigilanteDTOAVigilante(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaVigilantes.size()) {
			return false;
		} else {
			listaVigilantes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, VigilanteDTO datoActualizado) {
		if (index < 0 || index >= listaVigilantes.size()) {
			return false;
		} else {
			listaVigilantes.set(index, DataMapper.convertirVigilanteDTOAVigilante(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Vigilante vigilante : listaVigilantes) {
			dato += posicion + " ";
			dato += vigilante.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirVigilanteAVigilanteDTO(listaVigilantes.get(index)).toString();
	}

	@Override
	public ArrayList<VigilanteDTO> mostrarTodo() {
		return DataMapper.convertirListaVigilanteAListaVigilanteDTO(listaVigilantes);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Vigilante vigilante : listaVigilantes) {
			sb.append(vigilante.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaVigilantes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaVigilantes = new ArrayList<Vigilante>();
		} else {
			listaVigilantes = (ArrayList<Vigilante>) contenido;
		}
	}

	public ArrayList<Vigilante> getListaVigilantes() {
		return listaVigilantes;
	}

	public void setListaVigilantes(ArrayList<Vigilante> listaVigilantes) {
		this.listaVigilantes = listaVigilantes;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
