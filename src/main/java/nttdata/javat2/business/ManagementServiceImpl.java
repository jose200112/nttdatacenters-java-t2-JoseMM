package nttdata.javat2.business;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Clase que implementa la interfaz con metodos para la gestion de empleados
 * @author jose
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {

	private Map<String, String> company = new HashMap<String, String>();
	private StringBuilder sb = new StringBuilder();
	private int vacancy = 10;

	/**
	 * Metodo que registra empleados si hay plazas
	 * 
	 * @param name (nombre de empleado)
	 * @param category (categoria de empleado)
	 */
	public void joinEmployee(String name, String category) {
		if (vacancy > 0) {
			if (company.containsKey(name)) {
				System.out.println("Este empleado ya esta registrado");
			} else {
				vacancy--;
				company.put(name, category);

				// concatenamos
				sb.delete(0, sb.length());
				sb.append("Empleado registrado, quedan ");
				sb.append(vacancy);
				sb.append(" plazas");
				String result = sb.toString();
				System.out.println(result);
			}
		} else {
			System.out.println("Ya no quedan mas plazas");
		}

	}

	/**
	 * Metodo que muestra todos los empleados
	 */
	public void showAllEmployees() {
		// Declaramos iterador y recorremos el mapa
		Iterator<String> iter = company.keySet().iterator();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			String category = company.get(name);

			// concatenamos
			sb.delete(0, sb.length());
			sb.append("Nombre: ");
			sb.append(name);
			sb.append(" Categoria: ");
			sb.append(category);
			String result = sb.toString();
			System.out.println(result);
		}

	}

	/**
	 * Metodo que muestra el total de empleados
	 */
	public void showTotalEmployees() {
		System.out.println(company.size());

	}

	/**
	 * Metodo que da de baja a empleado
	 * 
	 * @param name (nombre de empleado)
	 */
	public void resignEmployee(String name) {
		if (company.containsKey(name)) {
			company.remove(name);
			System.out.println("Empleado dado de baja con exito");
			vacancy++;
		} else {
			System.out.println("Empleado no encontrado");
		}
	}

	/**
	 * Metodo que indica si un empleado se encuentra de alta
	 * 
	 * @param name (nombre de empleado)
	 */
	public void containsEmployee(String name) {
		if (company.containsKey(name)) {

			// concatenamos
			sb.delete(0, sb.length());
			sb.append("Si, el empleado ");
			sb.append(name);
			sb.append(" se encuentra de alta");
			String result = sb.toString();
			System.out.println(result);

		} else {
			System.out.println("Empleado no encontrado");
		}
	}

}
