 /**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1�DAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que recoge los datos de una orden(pedido)
 * 
 */
 package  Actividades1;

 public class Orden {
	private String producto;
	private int codProducto;
	private int cantidadProducto;
	private String nombreCliente;
	private String dniCliente;
	private String dniEmpleado;
	private Cliente cliente = new Cliente();
	private Empleado empleado;

	public Orden() {
		empleado = new Empleado();
		cliente.crearCliente("Julio", "77889988W", 3, 2, 12);
		empleado.crearEmpleado("Manuela", "11223344A", "Vendedor");
	}

	public void crearOrden(String producto, int codProducto, int cantidadProducto) {
		setProducto(producto);
		setCodProducto(codProducto);
		setCantidadProducto(cantidadProducto);
		setNombreCliente(cliente.getNombre());
		setDniCliente(cliente.getDni());
		setDniEmpleado(empleado.getDni());

	}

	public void imprimirOrden() {
		System.out.println(producto + " " + codProducto + " " + cantidadProducto + " " + nombreCliente + " "
				+ dniCliente + " " + dniEmpleado);
	}

	public void alterarProductoOrden(String producto, int cod, int cantidad) {
		setProducto(producto);
		setCodProducto(cod);
		setCantidadProducto(cantidad);
	}

	public void cambiarEmpleadoOrden(String dniEmple) {
		setDniEmpleado(dniEmple);
	}

	public void anularOrden() {
		setProducto(null);
		setCodProducto(0);
		setCantidadProducto(0);
		setNombreCliente(null);
		setDniCliente(null);
		setDniEmpleado(null);
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}
	
	public static void main(String[] args){
		Orden ord=new Orden();
		ord.crearOrden("Helado",0001,20);
		ord.imprimirOrden();
	}

}
