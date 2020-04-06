package ortopedicosArem;

import java.util.Scanner;
import components.LimpiarPantalla;

/**
 * @author angel
 */

public class IniciarSesion {

	public static Empleado empleado;
	public static Cliente cliente;
	public static Producto producto;
	static Menu menu;
	
	static private Scanner leer;
	static private int idUsuario;
	static private String contraseña;
	
	static LimpiarPantalla limpiarPantalla = new LimpiarPantalla();

	/**
	 * @param args
	 * Clase principal
	 */
	public static void main(String[] args) {
		CargarDatosPrograma(); //Inicializa los datos en los array de la clase de Datos
		
		System.out.println("----- BIENVENIDO A ORTOPÉDICOS AREM -----");
		System.out.println("[ INICIAR SESIÓN ]\n");
		
		IniciarSesionMenu(); //Muestra menú de acceso
	}

	public static void IniciarSesionMenu() {

		leer = new Scanner(System.in);
		boolean validarSesion = false;
		
		System.out.println("> Ingrese los datos para iniciar sesión.");
		
		do {
			System.out.print("ID de Usuario: ");

			try {
				idUsuario = leer.nextInt();
			} catch (Exception e) {
				System.err.println("[Error]: Usuario no válido");
				leer.next();
				continue;
			}
			
			System.out.print("Contraseña: ");
			contraseña = leer.next();
			
			validarSesion = true;
			
		} while (validarSesion == false);
		
		limpiarPantalla.Limpiar(30);
		menu = new Menu(); //Carga menú
	}
	
	/**
	 * Método para agregar objetos por defecto.
	 */
	public static void CargarDatosPrograma() {
		
		// Apartado de empleados
		empleado = new Empleado();
		
		empleado.setIdUsuario(1000);
		empleado.setTipoUsuario(2);
		empleado.setNombreUsuario("Angel");
		empleado.setApellidoUsuario("Palomar");
		empleado.setContrasena("0000");
		empleado.setCorreoUsuario("angel.palomar@arem.mx");
		empleado.setTelefonoUsuario("4427047812");
		empleado.setDireccionUsuario("Ficticia", "404", "A", "76158", "La Falacia", "Querétaro", "QRO.");
		empleado.setTipoEmpleado(9);

		empleado.CargaEmpleado();
		empleado.AgregarEmpleado(empleado);
		empleado.ConsultarEmpleado();
		
		//Apartado de clientes
		
		cliente = new Cliente();

		cliente.setIdUsuario(1001);
		cliente.setTipoUsuario(1);
		cliente.setNombreUsuario("Isabel");
		cliente.setApellidoUsuario("Hernández");
		cliente.setContrasena("FFFF");
		cliente.setCorreoUsuario("confleis@gmail.com");
		cliente.setTelefonoUsuario("4421234567");
		cliente.setDireccionUsuario("Mentira", "512", "1", "78919", "Fraude", "Corregidora", "QRO.");

		cliente.CargaCliente();
		cliente.agregarCliente(cliente);
		cliente.consultarCliente();
		
		//Apartado de productos
		producto = new Producto(); //Agregar un producto
		
		producto.setCodigoProducto(6000);
		producto.setNombreProducto("BOLSA CONTRAPESO");
		producto.setPrecioProducto(148.00f);
		producto.setCostoProducto(118.90f);
		producto.setMarcaProducto(9000, "Seal - Tight");
		producto.setClaseProducto(10000, "Órtesis columna");
		producto.setModeloProducto("SKU-198");
		producto.setDesbreProducto("Bolsa de contrapeso de plástico");
		producto.setDescampProducto("Auxiliar en el tratamiento cervical");
		producto.setStockProducto(10);
		
		producto.CargaProducto();
		producto.AltaProducto(producto);
		producto.ConsultarProducto();
		
		producto = new Producto(); //Agregar un producto
		
		producto.setCodigoProducto(6001);
		producto.setNombreProducto("Silla Adaptative");
		producto.setPrecioProducto(10925.00f);
		producto.setCostoProducto(9900.00f);
		producto.setMarcaProducto(9000, "Slim Fit");
		producto.setClaseProducto(10000, "Sillas de ruedas");
		producto.setModeloProducto("MOD-EL0");
		producto.setDesbreProducto("Silla de ruedas con ruedas descansa brazos.");
		producto.setDescampProducto("Llantas neumáticas de 24pg, botón para desmontar llantas traseras");
		producto.setStockProducto(5);
		
		producto.CargaProducto();
		producto.AltaProducto(producto);
		producto.ConsultarProducto();

		System.out.println("\n¡Datos cargados correctamente!\n");
	}
}
