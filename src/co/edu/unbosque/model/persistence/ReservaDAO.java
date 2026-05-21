package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Reserva;
import co.edu.unbosque.model.ReservaDTO;

public class ReservaDAO implements DAO<Reserva, ReservaDTO> {

	private ArrayList<Reserva> listaReservas;
	private final String URL_ARCHIVO_TEXTO = "reservas.csv";
	private final String URL_ARCHIVO_SERIALIZADO = "reservas.dat";
	private DataMapper dm;

	public ReservaDAO() {
		listaReservas = new ArrayList<>();
		dm = new DataMapper();
		leerSerializado();
	}

	@Override
	public void crear(ReservaDTO nuevoDato) {
		listaReservas.add(DataMapper.convertirReservaDTOAReserva(nuevoDato));
		escribirSerializado();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaReservas.size()) {
			return false;
		} else {
			listaReservas.remove(index);
			escribirSerializado();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, ReservaDTO datoActualizado) {
		if (index < 0 || index >= listaReservas.size()) {
			return false;
		} else {
			listaReservas.set(index, DataMapper.convertirReservaDTOAReserva(datoActualizado));
			escribirSerializado();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Reserva reserva : listaReservas) {
			dato += posicion + " ";
			dato += reserva.toString() + "\n";
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return DataMapper.convertirReservaAReservaDTO(listaReservas.get(index)).toString();
	}

	@Override
	public ArrayList<ReservaDTO> mostrarTodo() {
		return DataMapper.convertirListaReservaAListaReservaDTO(listaReservas);
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Reserva reserva : listaReservas) {
			sb.append(reserva.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo(URL_ARCHIVO_TEXTO, sb.toString());
	}

	public void escribirSerializado() {
		FileHandler.crearYEscribirArchivoSerializado(URL_ARCHIVO_SERIALIZADO, listaReservas);
	}

	public void leerSerializado() {
		Object contenido = FileHandler.crearYLeerSerializable(URL_ARCHIVO_SERIALIZADO);
		if (contenido == null) {
			listaReservas = new ArrayList<Reserva>();
		} else {
			listaReservas = (ArrayList<Reserva>) contenido;
		}
	}

	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public DataMapper getDm() {
		return dm;
	}

	public void setDm(DataMapper dm) {
		this.dm = dm;
	}
}
