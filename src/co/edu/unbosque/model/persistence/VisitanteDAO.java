package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Visitante;
import co.edu.unbosque.model.VisitanteDTO;

public class VisitanteDAO implements DAO<Visitante, VisitanteDTO> {

	private ArrayList<Visitante> listaVisitantes;
	private final String URL_ARCHIVO_TEXTO = "visitantes.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "visitantes.dat";
	private DataMapper dm;

	public VisitanteDAO() {
		listaVisitantes = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(VisitanteDTO nuevoDato) {
		listaVisitantes.add(DataMapper.convertirVisitanteDTOAVisitante(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaVisitantes.size()) {
			return false;
		} else {
			listaVisitantes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, VisitanteDTO datoActualizado) {
		if (index < 0 || index >= listaVisitantes.size()) {
			return false;
		} else {
			listaVisitantes.set(index, DataMapper.convertirVisitanteDTOAVisitante(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Visitante visitante : listaVisitantes) {
			dato += posicion + " ";
			dato += visitante.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirVisitanteAVisitanteDTO(listaVisitantes.get(index)).toString();
	}

	@Override
	public ArrayList<VisitanteDTO> mostrarTodo() {
		return DataMapper.convertirListaVisitanteAListaVisitanteDTO(listaVisitantes);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Visitante visitante : listaVisitantes) {
			sb.append(visitante.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaVisitantes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaVisitantes = new ArrayList<Visitante>();
		} else {
			listaVisitantes = (ArrayList<Visitante>) contenido;
		}
	}

	public ArrayList<Visitante> getListaVisitantes() {
		return listaVisitantes;
	}

	public void setListaVisitantes(ArrayList<Visitante> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
