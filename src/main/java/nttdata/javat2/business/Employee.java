package nttdata.javat2.business;

/**
 * Clase Employee para crear un objeto empleado
 * @author jose
 *
 */
public class Employee {
	private String category;
	private final String companyName;
	private final int ID;
	private final String name;
	
	/**
	 * Constructor de la clase employee
	 * @param category (categoria)
	 * @param companyName (nombre de la empresa)
	 * @param iD (ID)
	 * @param name (nombre)
	 */
	public Employee(int iD, String name, String category, String companyName) {
		ID = iD;
		this.name = name;
		this.category = category;
		this.companyName = companyName;
	}

	/**
	 * Metodo getter para la categoria
	 * @return category (categoria)
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Metodo setter para la categoria
	 * @param category (categoria)
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Metodo getter para el nombre de compania
	 * @return companyName (nombre de la empresa)
	 */
	public String getCompanyName() {
		return companyName;
	}
	
	/**
	 * Metodo getter para el ID
	 * @return ID (ID)
	 */
	public int getID() {
		return ID;
	}

	
	/**
	 * Metodo getter para el nombre de empleado
	 * @return name (nombre)
	 */
	public String getName() {
		return name;
	}
	
	
	
	
}
