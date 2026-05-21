package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Aviso;
import co.edu.unbosque.model.AvisoDTO;

public class AvisoDAO implements DAO<Aviso, AvisoDTO> {

	private ArrayList<Aviso> listaAvisos;
	private final String URL_ARCHIVO_TEXTO = "avisos.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "avisos.dat";
	private DataMapper dm;

	public AvisoDAO() {
		listaAvisos = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(AvisoDTO nuevoDato) {
		listaAvisos.add(DataMapper.convertirAvisoDTOAAviso(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAvisos.size()) {
			return false;
		} else {
			listaAvisos.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, AvisoDTO datoActualizado) {
		if (index < 0 || index >= listaAvisos.size()) {
			return false;
		} else {
			listaAvisos.set(index, DataMapper.convertirAvisoDTOAAviso(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Aviso aviso : listaAvisos) {
			dato += posicion + " ";
			dato += aviso.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirAvisoAAvisoDTO(listaAvisos.get(index)).toString();
	}

	@Override
	public ArrayList<AvisoDTO> mostrarTodo() {
		return DataMapper.convertirListaAvisoAListaAvisoDTO(listaAvisos);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Aviso aviso : listaAvisos) {
			sb.append(aviso.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaAvisos);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaAvisos = new ArrayList<Aviso>();
		} else {
			listaAvisos = (ArrayList<Aviso>) contenido;
		}
	}

	public ArrayList<Aviso> getListaAvisos() {
		return listaAvisos;
	}

	public void setListaAvisos(ArrayList<Aviso> listaAvisos) {
		this.listaAvisos = listaAvisos;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
