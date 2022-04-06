/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1�DAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que recoge los datos de un empleado
 * 
 */
package Actividades1;

public class Empleado {
	private String nombre;
	private String dni;
	private String trabajo;

	public Empleado(String nombre, String dni, String trabajo) {
		setNombre(nombre);
		setDni(dni);
		setTrabajo(trabajo);
	}

	public Empleado() {
		System.out.println("Empleado pendiente de creacion");
	}

	public void crearEmpleado(String nombre, String dni, String trabajo) {
		setNombre(nombre);
		setDni(dni);
		setTrabajo(trabajo);
	}

	public void cambiarTrabajo(String trabajo) {
		setTrabajo(trabajo);
	}

	public void cambiarEmpleado(String nombre, String dni) {
		setNombre(nombre);
		setDni(dni);
	}

	public void sacarEmpleado() {
		System.out.println(nombre + " " + dni + " " + trabajo);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public static void main(String[] args){
		Empleado emple = new Empleado();
		emple.crearEmpleado("Pablo","77667766W","Programador");
		emple.sacarEmpleado();
	}

}
