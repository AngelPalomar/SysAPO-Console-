package ortopedicosArem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import lists.ListaClientes;
import lists.ListaEmpleados;
import lists.ListaProductos;
import lists.ListaVentas;

/**
 * @author angel Clase hija de Operacion; "Venta"
 */
public class Venta extends Operacion {
	private String nombreCliente;
	public DetalleVenta detalleVenta;

	/**
	 * Constructor
	 */
	public Venta() {
		super();
		detalleVenta = new DetalleVenta(); // Inicialización del objeto detalle de Venta
	}

	/**
	 * @param nombreEmpleado
	 * @param nombreCliente
	 * @param tipoDeOperacion
	 * @param dia
	 * @param mes
	 * @param anio
	 * @param folioVenta
	 * @param productosVentaDetalle
	 * @param cantidadProductos
	 * @param subtotal
	 * @param importe               Constructor con composición
	 */
	public Venta(String nombreEmpleado, String nombreCliente, String tipoDeOperacion, int dia, int mes, int anio,
			int folioVenta, ArrayList<Producto> productosVentaDetalle, ArrayList<Integer> cantidadProductos,
			float subtotal, float importe) {

	}

	// Setters y getters
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(int folioVenta, ArrayList<Producto> productosVentaDetalle,
			ArrayList<Integer> cantidadProductos, float subtotal, float importe) {
		detalleVenta.setFolioVenta(folioVenta);
		detalleVenta.setProductosVentaDetalle(productosVentaDetalle);
		detalleVenta.setCantidadProductos(cantidadProductos);
		detalleVenta.setSubtotal(subtotal);
		detalleVenta.setImporte(importe);
	}

	/**
	 * Método para realizar una venta
	 */
	public void AgregarVenta() {
		Scanner leer = new Scanner(System.in); // Scanner
		Venta nuevaVenta = new Venta(); // Objeto venta
		/**
		 * Con el objeto datos, cargo los objetos de ejemplo para poder realizar la
		 * venta.
		 */
		Datos datosVenta = new Datos(); // Objeto Datos
		Empleado empleadoVenta = new Empleado(); // Objeto Empleado
		Cliente clienteVenta = new Cliente(); // Objeto Cliente
		Producto productoVenta; // Objeto Producto

		ArrayList<Producto> carrito = new ArrayList<Producto>(); // Lista <<Carrito>> de tipo Producto
		ArrayList<Integer> cantidadesCarrito = new ArrayList<Integer>();

		int cantidadObjetosPorAgregarAlCarrito = 0;
		int codigoIngresadoDeProducto = 0;
		int cantidadProductosPorAgregar = 0;
		boolean isExistente = false;
		boolean isSuficiente = false;
		boolean isProductoAgregado = false;
		boolean isOpcionValida = false;

		// carga de datos
		datosVenta.RegistroClientes();
		datosVenta.RegistroEmpleados();
		datosVenta.RegistroProductos();

		// mostrando el catálogo
		System.out.println("\n----- CATALOGO -----");
		datosVenta.listaProductos.MostrarProductos();

		// empieza la venta
		empleadoVenta = datosVenta.listaEmpleados.empleados.get(0); // Asigno el objeto empleado del arreglo a otro
																	// objeto de tipo empleado
		clienteVenta = datosVenta.listaClientes.clientes.get(0);// Asigno el objeto cliente del arreglo a otro objeto
																// de tipo cliente

		System.out.println("\n----- NUEVA VENTA -----\n");
		nuevaVenta.setNombreEmpleado(empleadoVenta.getNombreUsuario() + " " + empleadoVenta.getApellidoUsuario()); // Asigno
																													// el
																													// nombre
																													// del
																													// empleado
		nuevaVenta.setNombreCliente(clienteVenta.getNombreUsuario() + " " + clienteVenta.getApellidoUsuario()); // Asigno
																												// el
																												// nombre
																												// del
																												// cliente
		nuevaVenta.setTipoDeOperacion("Venta"); // Asigno el tipo de operacion

		System.out.println("\t[Fecha]: " + nuevaVenta.getFechaOperacion());
		System.out.println("\t[Nombre del empleado]: " + nuevaVenta.getNombreEmpleado());
		System.out.println("\t[Nombre del cliente]: " + nuevaVenta.getNombreCliente());
		System.out.println("\t[Tipo de operacion]: " + nuevaVenta.getTipoDeOperacion());

		for (Venta venFolio : datosVenta.listaVentas.ventas) {
			nuevaVenta.detalleVenta.setFolioVenta(venFolio.detalleVenta.getFolioVenta()); // Asigno el valor del folio
																							// desde la última venta
		}

		System.out.println("\t[Folio]: " + nuevaVenta.detalleVenta.getFolioVenta());

		do { // Bucle para preguntar cuántos productos quiere agregar
			System.out.print("\n¿Cuántos productos desea agregar?: ");
			try { // Validación de tipo de dato
				cantidadObjetosPorAgregarAlCarrito = leer.nextInt();
				if (cantidadObjetosPorAgregarAlCarrito > 0) {
					isOpcionValida = true;
				} else {
					System.err.println("[Error]: El valor debe ser mayor que cero");
				}
			} catch (Exception e) {
				System.err.println("[Error]: El valor debe ser un número\n");
				leer.next();
				continue;
			}
		} while (isOpcionValida == false);

		for (int i = 0; i < cantidadObjetosPorAgregarAlCarrito; i++) { // Bucle para agregar productos
			do { // Valido si el producto existe
				Iterator<Producto> productoIterator = datosVenta.listaProductos.productos.iterator();
				productoVenta = new Producto(); // Creo un objeto producto
				codigoIngresadoDeProducto = 0; // Inicializo el codigo
				isOpcionValida = false; // Inicializo la variable bandera
				isProductoAgregado = false;
				isExistente = false;
				isSuficiente = false;
				do { // Validación de tipo de dato
					System.out.print("Ingrese el código de un producto (" + (i + 1) + "): ");
					try { // Validación de tipo de dato
						codigoIngresadoDeProducto = leer.nextInt();
						if (codigoIngresadoDeProducto > 0) {
							isOpcionValida = true;
						} else {
							System.err.println("[Error]: El valor debe ser mayor que cero");
						}
					} catch (Exception e) {
						System.err.println("[Error]: El valor debe ser un número\n");
						leer.next();
						continue;
					}
				} while (isOpcionValida == false);

				for (int j = 0; j < datosVenta.listaProductos.productos.size(); j++) {
					Producto productoRecorrido = datosVenta.listaProductos.productos.get(j);
					if (codigoIngresadoDeProducto == productoRecorrido.getCodigoProducto()) {
						isExistente = true; // El producto existe
						productoVenta = datosVenta.listaProductos.productos.get(j);
					}
				}

				if (isExistente == false) {
					System.err.println("\n[Error]: Producto " + codigoIngresadoDeProducto + " no existente.");
					isSuficiente = true;
				}

				if (productoVenta.getStockProducto() > 0 && isExistente == true) { //Si el producto existe y Si tengo stock suficiente
					isOpcionValida = false;
					System.out.println("> " + productoVenta.getNombreProducto() + " seleccionado.");
					do {
						System.out.print("Ingrese la cantidad: ");
						try {
							cantidadProductosPorAgregar = leer.nextInt();
							if (cantidadProductosPorAgregar > 0) {
								carrito.add(productoVenta); // Agrego producto
								cantidadesCarrito.add(cantidadProductosPorAgregar); // Agrego cantidad
								System.out.println("¡" + productoVenta.getNombreProducto() + " x(" + cantidadProductosPorAgregar + ") agregado al carrito con éxito!");
								isOpcionValida = true; // El valor es valido
								isSuficiente = true; // Hay suficientes
								isProductoAgregado = true; // El producto fue agregado con exito
							} else {
								System.err.println("[Error]: El valor debe ser mayor que cero\n");
							}
						} catch (Exception e) {
							System.err.println("[Error]: El valor debe ser un número\n");
							leer.next();
							continue;
						}
					} while (isOpcionValida == false);
				}

				if (isSuficiente == false) {
					System.err.println(
							"[Error]: No hay suficientes existencias de: " + productoVenta.getNombreProducto());
				}

			} while (isProductoAgregado == false);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t[Cliente]: " + nombreCliente + detalleVenta.toString();
	}
}
