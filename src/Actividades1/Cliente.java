/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1ºDAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que recoge los datos de un cliente
 */

package Actividades1;

public class Cliente {
	private String nombre;
	private String dni;
	private int antiguedad;
	private int sector;
	private int cantidadVentas;

	public Cliente(String nombre, String dni, int antiguedad, int sector, int cantidadVentas) {
		setNombre(nombre);
		setDni(dni);
		setAntiguedad(antiguedad);
		setSector(sector);
		setCantidadVentas(cantidadVentas);
	}

	public Cliente() {
		System.out.println("Cliente pendiente de creacion");
	}

	public void crearCliente(String nombre, String dni, int antiguedad, int sector, int cantidadVentas) {
		setNombre(nombre);
		setDni(dni);
		setAntiguedad(antiguedad);
		setSector(sector);
		setCantidadVentas(cantidadVentas);
	}

	public void asignarSectorDefault() {
		setSector(0);
	}

	public void cambiarNombreDni(String nombre, String dni) {
		setNombre(nombre);
		setDni(dni);
	}

	public void mostrarEmpleado() {
		System.out.println(nombre + " " + dni + " " + antiguedad + " " + sector + " " + cantidadVentas);
	}

	public void sacarAntiguedad() {
		System.out.println(nombre + " " + antiguedad);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public int getSector() {
		return sector;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public static void main(String[] args){
		Cliente cli = new Cliente();
		cli.crearCliente("Pedro","11223344W",2,1,29);
		cli.mostrarEmpleado();
	}

}
