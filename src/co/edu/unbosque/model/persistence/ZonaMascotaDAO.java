package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ZonaMascota;
import co.edu.unbosque.model.ZonaMascotaDTO;

public class ZonaMascotaDAO implements DAO<ZonaMascota, ZonaMascotaDTO> {

	private ArrayList<ZonaMascota> listaZonasMascotas;
	private final String URL_ARCHIVO_TEXTO = "zonasMascotas.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "zonasMascotas.dat";
	private DataMapper dm;

	public ZonaMascotaDAO() {
		listaZonasMascotas = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ZonaMascotaDTO nuevoDato) {
		listaZonasMascotas.add(DataMapper.convertirZonaMascotaDTOAZonaMascota(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaZonasMascotas.size()) {
			return false;
		} else {
			listaZonasMascotas.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ZonaMascotaDTO datoActualizado) {
		if (index < 0 || index >= listaZonasMascotas.size()) {
			return false;
		} else {
			listaZonasMascotas.set(index, DataMapper.convertirZonaMascotaDTOAZonaMascota(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (ZonaMascota zonaMascota : listaZonasMascotas) {
			dato += posicion + " ";
			dato += zonaMascota.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirZonaMascotaAZonaMascotaDTO(listaZonasMascotas.get(index)).toString();
	}

	@Override
	public ArrayList<ZonaMascotaDTO> mostrarTodo() {
		return DataMapper.convertirListaZonaMascotaAListaZonaMascotaDTO(listaZonasMascotas);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (ZonaMascota zonaMascota : listaZonasMascotas) {
			sb.append(zonaMascota.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaZonasMascotas);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaZonasMascotas = new ArrayList<ZonaMascota>();
		} else {
			listaZonasMascotas = (ArrayList<ZonaMascota>) contenido;
		}
	}

	public ArrayList<ZonaMascota> getListaZonasMascotas() {
		return listaZonasMascotas;
	}

	public void setListaZonasMascotas(ArrayList<ZonaMascota> listaZonasMascotas) {
		this.listaZonasMascotas = listaZonasMascotas;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
