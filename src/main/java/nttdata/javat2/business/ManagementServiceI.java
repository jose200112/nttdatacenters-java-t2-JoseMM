package nttdata.javat2.business;

/**
 * Interfaz cuyos metodos ofrecen manejar la gestion de empleados
 * @author jose
 *
 */
public interface ManagementServiceI {
	
	/**
	 * Metodo que da de alta empleados si hay plaza
	 * @param name (nombre de empleado)
	 * @param category (categoria de empleado)
	 */
	public void joinEmployee(String name, String category);
	
	/**
	 * Metodo que muestra todos los empleados
	 */
	public void showAllEmployees();
	
	/**
	 * Metodo que muestra el total de empleados
	 */
	public void showTotalEmployees();

}
