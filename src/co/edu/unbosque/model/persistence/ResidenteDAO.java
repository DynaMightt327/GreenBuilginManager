package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Residente;
import co.edu.unbosque.model.ResidenteDTO;

public class ResidenteDAO implements DAO<Residente, ResidenteDTO> {

	private ArrayList<Residente> listaResidentes;
	private final String URL_ARCHIVO_TEXTO = "residentes.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "residentes.dat";
	private DataMapper dm;

	public ResidenteDAO() {
		listaResidentes = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ResidenteDTO nuevoDato) {
		listaResidentes.add(DataMapper.convertirResidenteDTOAResidente(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaResidentes.size()) {
			return false;
		} else {
			listaResidentes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ResidenteDTO datoActualizado) {
		if (index < 0 || index >= listaResidentes.size()) {
			return false;
		} else {
			listaResidentes.set(index, DataMapper.convertirResidenteDTOAResidente(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Residente residente : listaResidentes) {
			dato += posicion + " ";
			dato += residente.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirResidenteAResidenteDTO(listaResidentes.get(index)).toString();
	}

	@Override
	public ArrayList<ResidenteDTO> mostrarTodo() {
		return DataMapper.convertirListaResidenteAListaResidenteDTO(listaResidentes);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Residente residente : listaResidentes) {
			sb.append(residente.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaResidentes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaResidentes = new ArrayList<Residente>();
		} else {
			listaResidentes = (ArrayList<Residente>) contenido;
		}
	}

	public ArrayList<Residente> getListaResidentes() {
		return listaResidentes;
	}

	public void setListaResidentes(ArrayList<Residente> listaResidentes) {
		this.listaResidentes = listaResidentes;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
