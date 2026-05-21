package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface DAO<E, D> {

	public void crear(D nuevoDato);
	public boolean eliminar(int index);
	public boolean actualizar(int index, D datoActualziado);
	public String mostrar();
	public String mostrar(int index);
	
	public ArrayList<D> mostrarTodo();
	public void escribirArchivo();
	
}
