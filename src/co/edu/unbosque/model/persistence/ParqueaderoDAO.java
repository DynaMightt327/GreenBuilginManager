package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Parqueadero;
import co.edu.unbosque.model.ParqueaderoDTO;

public class ParqueaderoDAO implements DAO<Parqueadero, ParqueaderoDTO> {

	private ArrayList<Parqueadero> listaParqueaderos;
	private final String URL_ARCHIVO_TEXTO = "parqueaderos.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "parqueaderos.dat";
	private DataMapper dm;

	public ParqueaderoDAO() {
		listaParqueaderos = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ParqueaderoDTO nuevoDato) {
		listaParqueaderos.add(DataMapper.convertirParqueaderoDTOAParqueadero(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaParqueaderos.size()) {
			return false;
		} else {
			listaParqueaderos.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ParqueaderoDTO datoActualizado) {
		if (index < 0 || index >= listaParqueaderos.size()) {
			return false;
		} else {
			listaParqueaderos.set(index, DataMapper.convertirParqueaderoDTOAParqueadero(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Parqueadero parqueadero : listaParqueaderos) {
			dato += posicion + " ";
			dato += parqueadero.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirParqueaderoAParqueaderoDTO(listaParqueaderos.get(index)).toString();
	}

	@Override
	public ArrayList<ParqueaderoDTO> mostrarTodo() {
		return DataMapper.convertirListaParqueaderoAListaParqueaderoDTO(listaParqueaderos);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Parqueadero parqueadero : listaParqueaderos) {
			sb.append(parqueadero.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaParqueaderos);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaParqueaderos = new ArrayList<Parqueadero>();
		} else {
			listaParqueaderos = (ArrayList<Parqueadero>) contenido;
		}
	}

	public ArrayList<Parqueadero> getListaParqueaderos() {
		return listaParqueaderos;
	}

	public void setListaParqueaderos(ArrayList<Parqueadero> listaParqueaderos) {
		this.listaParqueaderos = listaParqueaderos;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
