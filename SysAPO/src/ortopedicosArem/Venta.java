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
		Producto productoRecorrido;

		ArrayList<Producto> carrito = new ArrayList<Producto>(); // Lista <<Carrito>> de tipo Producto
		ArrayList<Integer> cantidadesCarrito = new ArrayList<Integer>();

		int cantidadObjetosPorAgregarAlCarrito = 0;
		int codigoIngresadoDeProducto = 0;
		int cantidadProductosPorAgregar = 0;
		int totalDeProductos = 0;
		float subtotalAcumulado = 0;
		float totalPagado = 0;
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
				Iterator<Producto> productoIterator = datosVenta.listaProductos.productos.iterator(); // Iterador para
																										// recorrer el
																										// catálogo
				productoVenta = new Producto(); // Creo un objeto producto
				codigoIngresadoDeProducto = 0; // Inicializo el codigo
				isOpcionValida = false; // Inicializo la variable bandera
				isProductoAgregado = false;
				isExistente = false;
				isSuficiente = false;
				do { // Validación de tipo de dato
					System.out.print("\nIngrese el código de un producto (" + (i + 1) + "): ");
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
					productoRecorrido = datosVenta.listaProductos.productos.get(j);
					if (codigoIngresadoDeProducto == productoRecorrido.getCodigoProducto()) {
						isExistente = true; // El producto existe
						productoVenta = datosVenta.listaProductos.productos.get(j);
					}
				}

				if (isExistente == false) {
					System.err.println("\n[Error]: Producto " + codigoIngresadoDeProducto + " no existente.");
					isSuficiente = true;
				}

				if (productoVenta.getStockProducto() > 0 && isExistente == true) { // Si el producto existe y Si tengo
																					// stock suficiente
					isOpcionValida = false;
					System.out.println("> " + productoVenta.getNombreProducto() + " seleccionado.");
					do {
						System.out.print("Ingrese la cantidad: ");
						try {
							cantidadProductosPorAgregar = leer.nextInt();
							if (cantidadProductosPorAgregar > 0) {
								isOpcionValida = true; // El valor es valido
							} else {
								System.err.println("[Error]: El valor debe ser mayor que cero\n");
							}
						} catch (Exception e) {
							System.err.println("[Error]: El valor debe ser un número\n");
							leer.next();
							continue;
						}
						if (productoVenta.getStockProducto() >= cantidadProductosPorAgregar) { // Si tengo productos
																								// suficientes en stock
							carrito.add(productoVenta); // Agrego producto
							cantidadesCarrito.add(cantidadProductosPorAgregar); // Agrego cantidad
							subtotalAcumulado += productoVenta.getPrecioProducto() * cantidadProductosPorAgregar;
							System.out.println("¡" + productoVenta.getNombreProducto() + " x("
									+ cantidadProductosPorAgregar + ") agregado al carrito con éxito!");
							isSuficiente = true; // Hay suficientes
							isProductoAgregado = true; // El producto fue agregado con exito
						}

					} while (isOpcionValida == false);
				}

				if (isSuficiente == false) { //Verifica si hay suficientes productos para la venta
					System.err.println(
							"[Error]: No hay suficientes existencias de: " + productoVenta.getNombreProducto());
				}

			} while (isProductoAgregado == false);
		}

		// Mostrando resumen de venta
		System.out.println("\n***** RESUMEN (IVA incluido) *****\n");
		System.out.println("=========================================================\n");
		for (int i = 0; i < carrito.size(); i++) {
			productoRecorrido = carrito.get(i);
			totalDeProductos += cantidadesCarrito.get(i);
			System.out.println("Cod. " + productoRecorrido.getCodigoProducto() + "     " + productoRecorrido.getNombreProducto()
					+ "   $" + productoRecorrido.getPrecioProducto() + "   x" + cantidadesCarrito.get(i) + "   $"
					+ productoRecorrido.getPrecioProducto() * cantidadesCarrito.get(i));
		}
		System.out.println("\n=========================================================");
		System.out.println("\nTotal de productos: " + totalDeProductos + " producto(s)");
		System.out.println("Subtotal: $" + subtotalAcumulado + " MXN");
		System.out.println("\n\tTOTAL: $" + detalleVenta.getImporte(subtotalAcumulado) + " MXN"); //Calculo el importe
		
		isOpcionValida = false;
		do {
			System.out.print("\n\nIngrese total por pagar: ");
			try {
				totalPagado = leer.nextFloat();
				if (totalPagado >= detalleVenta.getImporte(subtotalAcumulado)) {
					datosVenta.listaVentas.AnadirListaVentas(nuevaVenta); //Anadir la venta al registro
					System.out.println("Cambio: $" + RealizarPago(detalleVenta.getImporte(subtotalAcumulado), totalPagado));
					isOpcionValida = true;
				} else {
					System.err.println("[Error]: El valor debe ser mayor al total.");
				}
			} catch (Exception e) {
				System.err.println("[Error]: El valor debe ser un numero.");
				leer.next();
				continue;
			}
		} while (isOpcionValida == false);
	}
	
	private float RealizarPago(float importe, float cantidadPagada) { //Método para realizar un pago
		return cantidadPagada - importe;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t[Cliente]: " + nombreCliente + detalleVenta.toString();
	}
}
