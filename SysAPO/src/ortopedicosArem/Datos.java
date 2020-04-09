package ortopedicosArem;

import lists.ListaClientes;
import lists.ListaEmpleados;
import lists.ListaProductos;

public class Datos {
	
	public Empleado empleado;
	public Cliente cliente;
	public Producto producto;
	public ListaEmpleados listaEmpleados = new ListaEmpleados();
	public ListaClientes listaClientes = new ListaClientes();
	public ListaProductos listaProductos = new ListaProductos();
	
	public void RegistroEmpleados() {
		
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
		
		listaEmpleados.AnadirListaEmpleados(empleado);
	}
	
	public void RegistroClientes() {
		
		cliente = new Cliente();

		cliente.setIdUsuario(1001);
		cliente.setTipoUsuario(1);
		cliente.setNombreUsuario("Isabel");
		cliente.setApellidoUsuario("Hernández");
		cliente.setContrasena("FFFF");
		cliente.setCorreoUsuario("confleis@gmail.com");
		cliente.setTelefonoUsuario("4421234567");
		cliente.setDireccionUsuario("Mentira", "512", "1", "78919", "Fraude", "Corregidora", "QRO.");
		
		listaClientes.AnadirListaClientes(cliente);
	}
	
	public void RegistroProductos() {
		
		producto = new Producto();
		
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
		
		listaProductos.AnadirListaProductos(producto);
		
		producto = new Producto(); //Agregar un producto
		
		producto.setCodigoProducto(6001);
		producto.setNombreProducto("Silla Adaptative");
		producto.setPrecioProducto(10925.00f);
		producto.setCostoProducto(9900.00f);
		producto.setMarcaProducto(9001, "Slim Fit");
		producto.setClaseProducto(10001, "Sillas de ruedas");
		producto.setModeloProducto("MOD-EL0");
		producto.setDesbreProducto("Silla de ruedas con ruedas descansa brazos.");
		producto.setDescampProducto("Llantas neumáticas de 24pg, botón para desmontar llantas traseras");
		producto.setStockProducto(5);
		
		listaProductos.AnadirListaProductos(producto);
		
		producto = new Producto();
		
		producto.setCodigoProducto(6002);
		producto.setNombreProducto("Almohada con gel");
		producto.setPrecioProducto(1034.00f);
		producto.setCostoProducto(970.56f);
		producto.setMarcaProducto(9002, "NICE STRETCH");
		producto.setClaseProducto(10002, "Rehabilitación");
		producto.setModeloProducto("JE-36");
		producto.setDesbreProducto("Suave y constante al cuello.");
		producto.setDescampProducto("Tamaño 61x40x9.5cm aprox. Densidad 2.50D, peso 1050g.Centro de gel.");
		producto.setStockProducto(5);
		
		listaProductos.AnadirListaProductos(producto);
	}
}
