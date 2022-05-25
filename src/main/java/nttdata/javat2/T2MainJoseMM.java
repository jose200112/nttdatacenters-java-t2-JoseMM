package nttdata.javat2;

import nttdata.javat2.business.Employee;
import nttdata.javat2.business.ManagementServiceImpl;

/**
 * Clase con metodo Main
 * @author jose
 *
 */
public class T2MainJoseMM {
	
	/**
	 * Metodo main que demuestra el correcto funcionamiento 
	 * @param args 
	 */
	public static void main(String[] args) {
		
		//Creamos los empleados
		Employee e1 = new Employee(1234,"Maria","Informatica","NTTDATA");
		Employee e2 = new Employee(2345,"Jose","Contabilidad","NTTDATA");
		Employee e3 = new Employee(7895,"Manuel","Informatica","NTTDATA");
		Employee e4 = new Employee(5734,"Juan","RRHH","NTTDATA");
		Employee e5 = new Employee(7495,"Leo","Contabilidad","NTTDATA");
		Employee e6 = new Employee(9764,"Ana","Contabilidad","NTTDATA");
		Employee e7 = new Employee(9341,"Clara","RRHH","NTTDATA");
		Employee e8 = new Employee(9342,"Carmen","Informatica","NTTDATA");
		Employee e9 = new Employee(4927,"Javier","Informatica","NTTDATA");
		Employee e10 = new Employee(8364,"Angela","Informatica","NTTDATA");
		
		ManagementServiceImpl c = new ManagementServiceImpl();
		
		//Se dan de alta los empleados
		c.joinEmployee(e1.getName(), e1.getCategory());
		c.joinEmployee(e2.getName(), e2.getCategory());
		c.joinEmployee(e3.getName(), e3.getCategory());
		c.joinEmployee(e4.getName(), e4.getCategory());
		c.joinEmployee(e5.getName(), e5.getCategory());
		c.joinEmployee(e6.getName(), e6.getCategory());
		c.joinEmployee(e7.getName(), e7.getCategory());
		c.joinEmployee(e8.getName(), e8.getCategory());
		c.joinEmployee(e9.getName(), e9.getCategory());
		
		System.out.println("----");
		
		//No se registrara al estar repetido
		Employee e12 = new Employee(1234,"Maria","Informatica","NTTDATA");
		c.joinEmployee(e12.getName(), e12.getCategory());
		
		System.out.println("----");
		
		//Damos de alta a un empleado con la ultima vacante
		c.joinEmployee(e10.getName(), e10.getCategory());
		
		System.out.println("----");
		
		//No se registrara al superar el limite
		Employee e11 = new Employee(2314,"Rafael","Informatica","NTTDATA");
		c.joinEmployee(e11.getName(), e11.getCategory());
		
		System.out.println("----");
		
		//Damos de alta a un empleado
		c.resignEmployee(e10.getName());
		
		System.out.println("----");
		
		//Muestra si existe el empleado Juan
		c.containsEmployee("Juan");
		
		System.out.println("----");
		
		//Muestra los empleados
		c.showAllEmployees();
		
		System.out.println("----");
		
		//Muestra el numero de empleados
		c.showTotalEmployees();

	}

}
