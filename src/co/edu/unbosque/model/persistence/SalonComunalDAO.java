package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SalonComunal;
import co.edu.unbosque.model.SalonComunalDTO;

public class SalonComunalDAO implements DAO<SalonComunal, SalonComunalDTO> {

	private ArrayList<SalonComunal> listaSalonesComunales;
	private final String URL_ARCHIVO_TEXTO = "salonesComunales.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "salonesComunales.dat";
	private DataMapper dm;

	public SalonComunalDAO() {
		listaSalonesComunales = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(SalonComunalDTO nuevoDato) {
		listaSalonesComunales.add(DataMapper.convertirSalonComunalDTOASalonComunal(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaSalonesComunales.size()) {
			return false;
		} else {
			listaSalonesComunales.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, SalonComunalDTO datoActualizado) {
		if (index < 0 || index >= listaSalonesComunales.size()) {
			return false;
		} else {
			listaSalonesComunales.set(index, DataMapper.convertirSalonComunalDTOASalonComunal(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (SalonComunal salonComunal : listaSalonesComunales) {
			dato += posicion + " ";
			dato += salonComunal.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirSalonComunalASalonComunalDTO(listaSalonesComunales.get(index)).toString();
	}

	@Override
	public ArrayList<SalonComunalDTO> mostrarTodo() {
		return DataMapper.convertirListaSalonComunalAListaSalonComunalDTO(listaSalonesComunales);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (SalonComunal salonComunal : listaSalonesComunales) {
			sb.append(salonComunal.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaSalonesComunales);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaSalonesComunales = new ArrayList<SalonComunal>();
		} else {
			listaSalonesComunales = (ArrayList<SalonComunal>) contenido;
		}
	}

	public ArrayList<SalonComunal> getListaSalonesComunales() {
		return listaSalonesComunales;
	}

	public void setListaSalonesComunales(ArrayList<SalonComunal> listaSalonesComunales) {
		this.listaSalonesComunales = listaSalonesComunales;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
