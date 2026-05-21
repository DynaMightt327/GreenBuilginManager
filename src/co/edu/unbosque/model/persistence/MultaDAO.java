package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Multa;
import co.edu.unbosque.model.MultaDTO;

public class MultaDAO implements DAO<Multa, MultaDTO> {

	private ArrayList<Multa> listaMultas;
	private final String URL_ARCHIVO_TEXTO = "multas.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "multas.dat";
	private DataMapper dm;

	public MultaDAO() {
		listaMultas = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(MultaDTO nuevoDato) {
		listaMultas.add(DataMapper.convertirMultaDTOAMulta(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaMultas.size()) {
			return false;
		} else {
			listaMultas.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, MultaDTO datoActualizado) {
		if (index < 0 || index >= listaMultas.size()) {
			return false;
		} else {
			listaMultas.set(index, DataMapper.convertirMultaDTOAMulta(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Multa multa : listaMultas) {
			dato += posicion + " ";
			dato += multa.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirMultaAMultaDTO(listaMultas.get(index)).toString();
	}

	@Override
	public ArrayList<MultaDTO> mostrarTodo() {
		return DataMapper.convertirListaMultaAListaMultaDTO(listaMultas);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Multa multa : listaMultas) {
			sb.append(multa.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaMultas);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaMultas = new ArrayList<Multa>();
		} else {
			listaMultas = (ArrayList<Multa>) contenido;
		}
	}

	public ArrayList<Multa> getListaMultas() {
		return listaMultas;
	}

	public void setListaMultas(ArrayList<Multa> listaMultas) {
		this.listaMultas = listaMultas;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
