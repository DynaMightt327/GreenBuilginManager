package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Reporte;
import co.edu.unbosque.model.ReporteDTO;

public class ReporteDAO implements DAO<Reporte, ReporteDTO> {

	private ArrayList<Reporte> listaReportes;
	private final String URL_ARCHIVO_TEXTO = "reportes.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "reportes.dat";
	private DataMapper dm;

	public ReporteDAO() {
		listaReportes = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ReporteDTO nuevoDato) {
		listaReportes.add(DataMapper.convertirReporteDTOAReporte(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaReportes.size()) {
			return false;
		} else {
			listaReportes.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ReporteDTO datoActualizado) {
		if (index < 0 || index >= listaReportes.size()) {
			return false;
		} else {
			listaReportes.set(index, DataMapper.convertirReporteDTOAReporte(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Reporte reporte : listaReportes) {
			dato += posicion + " ";
			dato += reporte.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirReporteAReporteDTO(listaReportes.get(index)).toString();
	}

	@Override
	public ArrayList<ReporteDTO> mostrarTodo() {
		return DataMapper.convertirListaReporteAListaReporteDTO(listaReportes);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Reporte reporte : listaReportes) {
			sb.append(reporte.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaReportes);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaReportes = new ArrayList<Reporte>();
		} else {
			listaReportes = (ArrayList<Reporte>) contenido;
		}
	}

	public ArrayList<Reporte> getListaReportes() {
		return listaReportes;
	}

	public void setListaReportes(ArrayList<Reporte> listaReportes) {
		this.listaReportes = listaReportes;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
