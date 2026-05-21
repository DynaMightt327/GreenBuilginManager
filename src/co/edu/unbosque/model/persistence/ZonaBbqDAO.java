package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ZonaBbq;
import co.edu.unbosque.model.ZonaBbqDTO;

public class ZonaBbqDAO implements DAO<ZonaBbq, ZonaBbqDTO> {

	private ArrayList<ZonaBbq> listaZonasBbq;
	private final String URL_ARCHIVO_TEXTO = "zonasBbq.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "zonasBbq.dat";
	private DataMapper dm;

	public ZonaBbqDAO() {
		listaZonasBbq = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ZonaBbqDTO nuevoDato) {
		listaZonasBbq.add(DataMapper.convertirZonaBbqDTOAZonaBbq(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaZonasBbq.size()) {
			return false;
		} else {
			listaZonasBbq.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ZonaBbqDTO datoActualizado) {
		if (index < 0 || index >= listaZonasBbq.size()) {
			return false;
		} else {
			listaZonasBbq.set(index, DataMapper.convertirZonaBbqDTOAZonaBbq(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ZonaBbq zonaBbq : listaZonasBbq) {
			dato += posicion + " ";
			dato += zonaBbq.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirZonaBbqAZonaBbqDTO(listaZonasBbq.get(index)).toString();
	}

	@Override
	public ArrayList<ZonaBbqDTO> mostrarTodo() {
		return DataMapper.convertirListaZonaBbqAListaZonaBbqDTO(listaZonasBbq);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (ZonaBbq zonaBbq : listaZonasBbq) {
			sb.append(zonaBbq.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaZonasBbq);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaZonasBbq = new ArrayList<ZonaBbq>();
		} else {
			listaZonasBbq = (ArrayList<ZonaBbq>) contenido;
		}
	}

	public ArrayList<ZonaBbq> getListaZonasBbq() {
		return listaZonasBbq;
	}

	public void setListaZonasBbq(ArrayList<ZonaBbq> listaZonasBbq) {
		this.listaZonasBbq = listaZonasBbq;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
