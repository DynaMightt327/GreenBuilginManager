package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Bicicletero;
import co.edu.unbosque.model.BicicleteroDTO;

public class BicicleteroDAO implements DAO<Bicicletero, BicicleteroDTO> {

	private ArrayList<Bicicletero> listaBicicleteros;
	private final String URL_ARCHIVO_TEXTO = "bicicleteros.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "bicicleteros.dat";
	private DataMapper dm;

	public BicicleteroDAO() {
		listaBicicleteros = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(BicicleteroDTO nuevoDato) {
		listaBicicleteros.add(DataMapper.convertirBicicleteroDTOABicicletero(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaBicicleteros.size()) {
			return false;
		} else {
			listaBicicleteros.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, BicicleteroDTO datoActualizado) {
		if (index < 0 || index >= listaBicicleteros.size()) {
			return false;
		} else {
			listaBicicleteros.set(index, DataMapper.convertirBicicleteroDTOABicicletero(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Bicicletero bicicletero : listaBicicleteros) {
			dato += posicion + " ";
			dato += bicicletero.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirBicicleteroABicicleteroDTO(listaBicicleteros.get(index)).toString();
	}

	@Override
	public ArrayList<BicicleteroDTO> mostrarTodo() {
		return DataMapper.convertirListaBicicleteroAListaBicicleteroDTO(listaBicicleteros);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Bicicletero bicicletero : listaBicicleteros) {
			sb.append(bicicletero.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaBicicleteros);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaBicicleteros = new ArrayList<Bicicletero>();
		} else {
			listaBicicleteros = (ArrayList<Bicicletero>) contenido;
		}
	}

	public ArrayList<Bicicletero> getListaBicicleteros() {
		return listaBicicleteros;
	}

	public void setListaBicicleteros(ArrayList<Bicicletero> listaBicicleteros) {
		this.listaBicicleteros = listaBicicleteros;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
