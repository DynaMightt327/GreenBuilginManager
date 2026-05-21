package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Administrador;
import co.edu.unbosque.model.AdministradorDTO;

public class AdministradorDAO implements DAO<Administrador, AdministradorDTO> {

	private ArrayList<Administrador> listaAdministradores;
	private final String URL_ARCHIVO_TEXTO = "administradores.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "administradores.dat";
	private DataMapper dm;

	public AdministradorDAO() {
		listaAdministradores = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(AdministradorDTO nuevoDato) {
		listaAdministradores.add(DataMapper.convertirAdministradorDTOAAdministrador(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAdministradores.size()) {
			return false;
		} else {
			listaAdministradores.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, AdministradorDTO datoActualizado) {
		if (index < 0 || index >= listaAdministradores.size()) {
			return false;
		} else {
			listaAdministradores.set(index, DataMapper.convertirAdministradorDTOAAdministrador(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Administrador administrador : listaAdministradores) {
			dato += posicion + " ";
			dato += administrador.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirAdministradorAAdministradorDTO(listaAdministradores.get(index)).toString();
	}

	@Override
	public ArrayList<AdministradorDTO> mostrarTodo() {
		return DataMapper.convertirListaAdministradorAListaAdministradorDTO(listaAdministradores);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Administrador administrador : listaAdministradores) {
			sb.append(administrador.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaAdministradores);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaAdministradores = new ArrayList<Administrador>();
		} else {
			listaAdministradores = (ArrayList<Administrador>) contenido;
		}
	}

	public ArrayList<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}

	public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
