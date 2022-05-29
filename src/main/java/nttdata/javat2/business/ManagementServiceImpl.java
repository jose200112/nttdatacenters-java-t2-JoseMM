package nttdata.javat2.business;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase que implementa la interfaz con metodos para la gestion de empleados
 * 
 * @author jose
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {

	private static final Logger LOG = LoggerFactory.getLogger(ManagementServiceImpl.class);
	private Map<Integer, Employee> database = new HashMap<Integer, Employee>();
	private Integer genID = 0;

	/**
	 * Metodo que registra empleados si hay plazas
	 * 
	 * @param name     (nombre de empleado)
	 * @param rank (categoria de empleado)
	 */
	public void addNewEmployee(String name, String rank) {

		// Generamos el ID
		genID++;

		// Creamos el objeto
		Employee e = new Employee(genID, name, rank);

		// Restamos la constante con el numero de empleados en el mapa
		int count = Employee.getMaxNumEmployees() - database.size();

		if (count > 0) {

			// Metemos el objeto y su ID en el mapa
			database.put(e.getId(), e);

			LOG.info("Empleado registrado, quedan {} vacantes", count - 1);

		} else {
			LOG.info("Supera el limite de empleados");
		}

	}

	/**
	 * Metodo que imprime todos los empleados
	 */
	public void printAllEmployees() {
		// Declaramos iterador y recorremos el mapa
		Iterator<Integer> iter = database.keySet().iterator();
		while (iter.hasNext()) {

			System.out.println(database.get(iter.next()));
		}

	}
	
	/**
	 * Metodo que da de baja a un empleado
	 * @param id (ID)
	 */
	public void deleteEmployee(Integer id) {
		if (database.containsKey(id)) {
			database.remove(id);
			LOG.info("Empleado dado de baja con exito");
		} else {
			LOG.info("El empleado no existe");
		}
	}

	/**
	 * Metodo que muestra el total de empleados
	 */
	public void printEmployeesTotalNum() {
		System.out.println(database.size());
	}

	/**
	 * Metodo que comprueba si un empleado esta de alta
	 * @param id (ID)
	 */
	public void containsEmployee(Integer id) {
		if (database.containsKey(id)) {
			LOG.info("{}, se encuentra de alta", database.get(id));
		} else {
			LOG.info("Ese empleado no se encuentra de alta");
		}
	}

}
