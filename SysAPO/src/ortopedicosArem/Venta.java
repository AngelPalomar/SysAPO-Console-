package ortopedicosArem;

import java.util.ArrayList;
import java.util.Scanner;

import components.LimpiarPantalla;

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

	/**
	 * @return
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return
	 */
	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	/**
	 * @param folioVenta
	 * @param productosVentaDetalle
	 * @param cantidadProductos
	 * @param subtotal
	 * @param importe
	 */
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
	@SuppressWarnings("resource")
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
		Producto productoRecorrido; // objeto para realizar recorridos

		ArrayList<Producto> carrito = new ArrayList<Producto>(); // Lista para almacenar productos
		ArrayList<Integer> cantidadesCarrito = new ArrayList<Integer>(); // lista para almacenar cantidades

		int cantidadObjetosPorAgregarAlCarrito = 0; // numero de productos por comprar
		int codigoIngresadoDeProducto = 0; // numero ingresado por el usuario para buscar un producto
		int cantidadProductosPorAgregar = 0; // numero - cantidad de un solo producto
		int totalDeProductos = 0; // total de productos comprados
		float subtotalAcumulado = 0; // subtotal acumulado de acuerdo del precio y cantidad
		float totalPagado = 0; // total de dinero ingresado por el usuario
		boolean isExistente = false; // variable bandera para verificar si un producto existe
		boolean isSuficiente = false; // variable bandera para verificar si hay suficientes de un producto para vender
		boolean isProductoAgregado = false; // variable bandera para verificar si el producto fue agregado al carrito
		boolean isOpcionValida = false;// variable para verificar si el dato ingresado es válido

		/**
		 * Carga los datos ficticios
		 **/
		datosVenta.RegistroClientes(); // cargo la lista los clientes
		datosVenta.RegistroEmpleados(); // cargo la lista de empleados
		datosVenta.RegistroProductos(); // cargo la lista de productos

		/**
		 * Muestra el catálogo de productos
		 **/
		System.out.println("\n----- CATALOGO -----");
		datosVenta.listaProductos.MostrarProductos();

		/**
		 * Empieza la venta Asigno el objeto cliente del arreglo a otro objeto de tipo
		 * cliente y empleado
		 **/
		empleadoVenta = datosVenta.listaEmpleados.empleados.get(0);
		clienteVenta = datosVenta.listaClientes.clientes.get(0);

		System.out.println("\n----- NUEVA VENTA -----\n");
		/*
		 * Asingo el nombre del empleado y del cliente
		 */
		nuevaVenta.setNombreEmpleado(empleadoVenta.getNombreUsuario() + " " + empleadoVenta.getApellidoUsuario());
		nuevaVenta.setNombreCliente(clienteVenta.getNombreUsuario() + " " + clienteVenta.getApellidoUsuario());

		nuevaVenta.setTipoDeOperacion("Venta"); // Asigno el tipo de operacion

		System.out.println("\t[Fecha]: " + nuevaVenta.getFechaOperacion()); // muestro la fecha
		System.out.println("\t[Nombre del empleado]: " + nuevaVenta.getNombreEmpleado()); // muestro el nombre del
																							// empleado
		System.out.println("\t[Nombre del cliente]: " + nuevaVenta.getNombreCliente()); // muestro el nombre del cliente
		System.out.println("\t[Tipo de operacion]: " + nuevaVenta.getTipoDeOperacion()); // muestro el tipo de operacion

		for (Venta venFolio : datosVenta.listaVentas.ventas) {
			nuevaVenta.detalleVenta.setFolioVenta(venFolio.detalleVenta.getFolioVenta()); // Asigno el valor del folio
																							// desde la última venta
		}

		System.out.println("\t[Folio]: " + nuevaVenta.detalleVenta.getFolioVenta()); // muestro el folio

		do { // Bucle para preguntar cuántos productos quiere agregar
			System.out.print("\n¿Cuántos productos desea agregar?: ");
			try { // Validación de tipo de dato
				cantidadObjetosPorAgregarAlCarrito = leer.nextInt(); // asigno la cantidad de prodcutos por teclado
				if (cantidadObjetosPorAgregarAlCarrito > 0) { // verifico si el valor es un numero posistivo
					isOpcionValida = true; // break loop
				} else {
					System.out.println("[Error]: El valor debe ser mayor que cero"); // mensaje de error
				}
			} catch (Exception e) {
				System.out.println("[Error]: El valor debe ser un número\n"); // mensaje de error
				leer.next();
				continue;
			}
		} while (isOpcionValida == false);

		for (int i = 0; i < cantidadObjetosPorAgregarAlCarrito; i++) { // Bucle para agregar productos
			do { // Valido si el producto existe // catálogo
				productoVenta = new Producto(); // Creo un objeto producto
				codigoIngresadoDeProducto = 0; // Inicializo el codigo
				isOpcionValida = false; // Inicializo la variable bandera
				isProductoAgregado = false; // Inicializo la variable bandera
				isExistente = false; // Inicializo la variable bandera
				isSuficiente = false; // Inicializo la variable bandera

				do { // Validación de tipo de dato
					System.out.print("\nIngrese el código de un producto (" + (i + 1) + "): ");
					try { // Validación de tipo de dato
						codigoIngresadoDeProducto = leer.nextInt(); // valor por teclado
						if (codigoIngresadoDeProducto > 0) { // si el valor es positivo
							isOpcionValida = true; // loop breaked
						} else {
							System.out.println("[Error]: El valor debe ser mayor que cero"); // mensaje de error
						}
					} catch (Exception e) {
						System.out.println("[Error]: El valor debe ser un número\n"); // mensaje de error
						leer.next();
						continue;
					}
				} while (isOpcionValida == false); // si el valor sigue siendo false, el bucle sigue

				for (int j = 0; j < datosVenta.listaProductos.productos.size(); j++) { // recorrido de objetos
					/*
					 * asigno el objeto a un objeto de tipo producto de manera temporal
					 */
					productoRecorrido = datosVenta.listaProductos.productos.get(j);
					/*
					 * si el codigo ingresado coincide con algún codigo de prodcuto
					 */
					if (codigoIngresadoDeProducto == productoRecorrido.getCodigoProducto()) {
						isExistente = true; // El producto existe
						productoVenta = datosVenta.listaProductos.productos.get(j); // asigna ese objeto para añadirlo
																					// al carrito
					}
				}

				if (isExistente == false) { // si el objeto no existe (es decir, si el valor por defecto no cambia)
					System.out.println("\n[Error]: Producto " + codigoIngresadoDeProducto + " no existente."); // mensaje
																												// de
																												// error
					isSuficiente = true; // cambio de variable para brincar la siguiente decisión
				}

				isSuficiente = false; // reinicio variable
				isOpcionValida = false; // reinicio variable

				/*
				 * Si el producto existe y Si tengo stock suficiente
				 */
				if (productoVenta.getStockProducto() > 0 && isExistente == true) {
					/*
					 * mensaje del producto que fue seleccionado
					 */
					System.out.println("> " + productoVenta.getNombreProducto() + " seleccionado.");
					do { // Bucle para validar si el prodcuto fue agregado por las existencias elegidas
						do {
							System.out.print("Ingrese la cantidad: ");
							try { // manejo de excepción
								cantidadProductosPorAgregar = leer.nextInt(); // valor por teclado
								if (cantidadProductosPorAgregar > 0) { // si el valor es positvo
									isOpcionValida = true; // El valor es valido
								} else {
									System.out.println("[Error]: El valor debe ser mayor que cero\n"); // mensaje de
																										// error
								}
							} catch (Exception e) {
								System.out.println("[Error]: El valor debe ser un número\n"); // mensaje de error
								leer.next();
								continue;
							}
						} while (isOpcionValida == false); // si el valor sigue siendo false, el bucle sigue

						/**
						 * Empieza el cálculo del subtotal del producto en cuestión
						 */

						if (productoVenta.getStockProducto() >= cantidadProductosPorAgregar && isOpcionValida == true) { // Si
																															// tengo
																															// productos
							// suficientes en stock
							carrito.add(productoVenta); // Agrego producto
							cantidadesCarrito.add(cantidadProductosPorAgregar); // Agrego cantidad
							/*
							 * le sumo el precio multiplicado por la cantidad elegida al subtotal acumulado
							 */
							subtotalAcumulado += productoVenta.getPrecioProducto() * cantidadProductosPorAgregar;
							/*
							 * Mensaje para indicar el producto agregado con la cantidad
							 */
							System.out.println("¡" + productoVenta.getNombreProducto() + " x("
									+ cantidadProductosPorAgregar + ") agregado al carrito con éxito!");
							isSuficiente = true; // Hay suficientes
							isProductoAgregado = true; // El producto fue agregado con exito
						}

						if (isSuficiente == false) { // Verifica si hay suficientes productos para la venta
							System.out.println(
									"[Error]: No hay suficientes existencias de: " + productoVenta.getNombreProducto());
							isOpcionValida = false;
						}

					} while (isOpcionValida == false); // si el prodcuto puede ser agregado al carrito
				}
			} while (isProductoAgregado == false); // si el producto fue agregado
		}

		/**
		 * Resumen de la venta
		 */

		System.out.println("\n***** RESUMEN (IVA incluido) *****\n");
		System.out.println("=========================================================\n");

		for (int i = 0; i < carrito.size(); i++) { // recorrido de los productos del carrito
			productoRecorrido = carrito.get(i); // asigno un objeto del array a un objeto del mismo tipo temporalmente
			totalDeProductos += cantidadesCarrito.get(i); // sumatoria del total de productos
			System.out.println(
					"Cod. " + productoRecorrido.getCodigoProducto() + "     " + productoRecorrido.getNombreProducto()
							+ "   $" + productoRecorrido.getPrecioProducto() + "   x" + cantidadesCarrito.get(i)
							+ "   $" + productoRecorrido.getPrecioProducto() * cantidadesCarrito.get(i));
		} // muestra en pantalla de los producto por comprar

		System.out.println("\n=========================================================");
		System.out.println("\nTotal de productos: " + totalDeProductos + " producto(s)");
		System.out.println("Subtotal: $" + subtotalAcumulado + " MXN");
		System.out.println("\n\tTOTAL A PAGAR: $" + detalleVenta.getImporte(subtotalAcumulado) + " MXN"); // Calculo el
																											// importe

		isOpcionValida = false; // reinicio de variable

		do { // bucle para verificar el ingreso de un valor correcto
			System.out.print("\nIngrese total por pagar: ");
			try {
				totalPagado = leer.nextFloat(); // valor por teclado
				/*
				 * si el dinero dado es suficiente para pagar
				 */
				if (totalPagado >= detalleVenta.getImporte(subtotalAcumulado)) {
					/*
					 * <<Anadir la venta al registro>>
					 */
					datosVenta.listaVentas.AnadirListaVentas(nuevaVenta);
					/*
					 * Mensaje de cambio
					 */
					System.out.println(
							"Cambio: $" + RealizarPago(detalleVenta.getImporte(subtotalAcumulado), totalPagado));
					isOpcionValida = true;
				} else {
					System.out.println("[Error]: El valor debe ser mayor al total."); // mensaje de error
				}
			} catch (Exception e) {
				System.out.println("[Error]: El valor debe ser un numero."); // mensaje de error
				leer.next();
				continue;
			}
		} while (isOpcionValida == false); // si el valor no es valido, seguir con el bucle

		System.out.println("\n> De regreso al menú"); // mensaje de acción
		LimpiarPantalla limpiarPantalla = new LimpiarPantalla();
		limpiarPantalla.Limpiar(5); // limpio la consola con 5 saltos de linea

		Menu.GestionarVentas(); // de regreso al menu
	}

	/**
	 * Método para eliminar venta
	 */
	@SuppressWarnings("resource")
	public void EliminarVenta() {
		Datos datos = new Datos(); // Objeto dato
		Scanner leer = new Scanner(System.in); // Scanner
		LimpiarPantalla salto = new LimpiarPantalla(); // Limpiar pantalla

		int folioIngresado = 0; // Variable para folio ingresado por teclado
		String opcion; // variable para opciones
		boolean isOpcionValida = false; // variable para validar opciones ingresadas
		boolean isVentaEncontrada = false; // Variable para confirma que una venta fue encontrada

		datos.RegistroVentas(); // cargo datos por defecto
		salto.Limpiar(20); // Limpio pantalla

		System.out.println("----- ELIMINAR VENTA -----\n");

		// Bucle para verificar que el usuario ingrese un valor valido
		do {
			System.out.print("Ingrese un folio: ");
			try {
				folioIngresado = leer.nextInt();// dato por teclado
				isOpcionValida = true;// valido opcion ingresada
			} catch (Exception e) {
				System.out.println("[Error]: El valor debe ser un numero."); // mensaje de error
				leer.next();
				continue;
			}
		} while (isOpcionValida == false); // Si la opcion no es valida; repetir.

		int ventaPorEliminarIndice = 0; // Indice para eleminar
		// Bucle para encontrar una venta respecto al folio ingresado
		for (int i = 0; i < datos.listaVentas.ventas.size(); i++) {
			Venta ventaRecorrido = datos.listaVentas.ventas.get(i); // recorrido de ventas
			if (folioIngresado == ventaRecorrido.detalleVenta.getFolioVenta()) {
				ventaPorEliminarIndice = i;
				System.out.println(ventaRecorrido.toString());
				isVentaEncontrada = true;
			}
		}

		// Si la venta es encontrada, cuestiona si se quiere eliminar
		if (isVentaEncontrada == true) {
			do {
				// Mensaje de aviso
				System.out.print("\n¿Desea eliminar esta venta? [S/N]\nEsta acción no se puede deshacer: ");
				opcion = leer.next();
				if (opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N")) {
					if (opcion.equalsIgnoreCase("S")) {
						// si la respuesta fue si, procede a eliminarla
						datos.listaVentas.ventas.remove(ventaPorEliminarIndice); // Elimino venta de la lista
						System.out.println("\n> Venta eliminada.\n"); // mensaje de exito
						Menu.GestionarVentas(); // regresa a menu de gestion
					} else {
						System.out.println("\nProceso cancelado.\n"); // mensaje de cancelacion
						Menu.GestionarVentas();// regresa a menu
					}
				} else {
					System.out.println("\n[Error]: Opción no válida"); // mensaje de error
					isOpcionValida = false;
				}
			} while (isOpcionValida == false);
		} else {
			System.out.println("> Venta no encontrada.\n"); // mensaje de error
			Menu.GestionarVentas(); // regresa a menu
		}
	}

	/**
	 * Método para consultar ventas
	 */
	@SuppressWarnings("resource")
	public void ConsultarVenta() {
		Scanner leer = new Scanner(System.in); // Scanner
		Datos datos = new Datos(); // Datos
		LimpiarPantalla salto = new LimpiarPantalla(); // limpiar pantalla

		int folioIngresado = 0; // valor ingresado por teclado
		String opcion; // opcion por teclado
		boolean isOpcionValida = false; // para verificar si un valor por teclado es valido
		boolean isMenuConsultaActivo = true; // para verificar si el menu sigue activo
		boolean isEncontrada = false; // para verificar si la venta fue encontrada

		datos.RegistroVentas(); // cargo datos por defecto

		salto.Limpiar(20); // Limpio pantalla
		do { // Bucle para seleccionar una opcion
			System.out.println("\n----- CONSULTAR VENTA -----\n");
			System.out.println("> Elija una opción: \n");
			System.out.println("Consultar por folio [A]");
			System.out.println("Consultar todas las ventas [B]");
			System.out.println("Salir al menú de ventas [X]");

			System.out.print("\nIngrese una opción: ");
			opcion = leer.next();

			// condición para verificar la opción ingresada
			switch (opcion) {
			case "A": // buscar por folio
			case "a": {
				salto.Limpiar(25); // saltos de linea
				folioIngresado = 0; // reseteo el folio ingresado
				isEncontrada = false; // reseteo variable para verificar si una venta fue encontrada
				System.out.println("----- CONSULTAR POR FOLIO -----\n");
				do {
					System.out.print("Ingrese un folio: ");
					// validacion del tipo de dato
					try {
						folioIngresado = leer.nextInt();
						isOpcionValida = true; // el valor es valido
					} catch (Exception e) {
						System.out.println("[Error]: El valor debe ser un numero"); // mensaje de error
						leer.next();
						continue;
					}
				} while (isOpcionValida == false);// si el valor no es valido, sigue el bucle

				for (int i = 0; i < datos.listaVentas.ventas.size(); i++) { // Recorrido de ventas
					// Asigno a un objeto local, el objeto de un recorrido
					Venta ventaRecorrido = datos.listaVentas.ventas.get(i);
					/*
					 * Si el folio de la venta recorrida coincide con el ingresado; muestra la venta
					 */
					if (ventaRecorrido.detalleVenta.getFolioVenta() == folioIngresado) {
						System.out.println(ventaRecorrido.toString());
						System.out.println("\n> Venta encontrada.");
						isEncontrada = true; // fue encontrada
					}
				}

				/*
				 * Si la venta NO fue encontrada, muestra mensaje de error y se devuelve a
				 * preguntar como es que se quiere consultar
				 */
				if (isEncontrada == false) {
					System.out.println("\n> Venta no encontrada.");
				}
			}
				break;
			case "B": // Buscar todas
			case "b": {
				salto.Limpiar(20); // saltos de linea
				// Mensaje que indica que se estan mostrando las ventas
				System.out.println("> MOSTRANDO " + datos.listaVentas.ventas.size() + " venta(s).");
				// muestra todas las ventas a traves del metodo con un foreach en la clase de
				// datos
				datos.listaVentas.MostrarVentas();
				// Mensaje que indica que se mostraron n cantidad de ventas
				System.out.println("\n> MOSTRADAS " + datos.listaVentas.ventas.size() + " ventas(s).\n");
			}
				break;
			case "x": // Salir
			case "X": {
				salto.Limpiar(20); // saltos de linea
				Menu.GestionarVentas(); // regresar a la gestion de ventas

				System.out.println("[Error]: Opción no existente. Vuelva a intentarlo.\n"); // mensaje de error
				isMenuConsultaActivo = true; // sigue con el bucle
			}
				break;
			default: {
				System.out.println("[Error]: Opción no existente. Vuelva a intentarlo.\n"); // mensaje de error
				isMenuConsultaActivo = true; // sigue con el bucle
			}
				break;
			}
		} while (isMenuConsultaActivo == true); // si el menu sigue, vuelve a mostrar las opciones de consulta
	}

	/**
	 * Método para modificar ventas
	 */
	@SuppressWarnings({ "resource" })
	public void ModificarVenta() {
		Datos datos = new Datos(); // datos
		Scanner leer = new Scanner(System.in); // scanner
		LimpiarPantalla salto = new LimpiarPantalla(); // limpiar pantalla
		Venta ventaRecorrido = new Venta(), ventaPorModificar = new Venta(); // objetos de venta

		int folioIngresado = 0; // folio ingresado por teclado
		String nuevoNombre; // nombre ingresado por teclado
		String opcion; // opcion por teclado
		boolean isOpcionValida = false; // para verificar las opciones
		boolean isVentaEncontrada = false; // si la venta fue encontrada

		datos.RegistroVentas(); // cargo los datos
		salto.Limpiar(20); // Limpio pantalla

		System.out.println("----- MODIFICAR VENTA -----\n");

		/*
		 * Bucle para alamacenar/verificar las opciones
		 */
		do {
			System.out.print("Ingrese un folio: ");
			try {
				folioIngresado = leer.nextInt(); // alamaceno un valor
				isOpcionValida = true;
			} catch (Exception e) {
				System.out.println("[Error]: El valor debe ser un numero."); // mensaje de error
				leer.next();
				continue;
			}
		} while (isOpcionValida == false); // si la opcion no es valida, sigue con el bucle

		// Bucle que realiza el recorrido de las ventas
		for (int i = 0; i < datos.listaVentas.ventas.size(); i++) {
			ventaRecorrido = datos.listaVentas.ventas.get(i); // asigno un objeto recorrido a uno local
			// si el folio coincide con lo ingresado
			if (folioIngresado == ventaRecorrido.detalleVenta.getFolioVenta()) {
				ventaPorModificar = datos.listaVentas.ventas.get(i); // asigno el objeto a usar
				System.out.println(ventaPorModificar.toString()); // muestra la venta asignada
				isVentaEncontrada = true; // la venta fue encontrada
			}
		}

		// si la venta NO fue encontrada, muestra un mensaje de error y devuelve al menu
		if (isVentaEncontrada == false) {
			System.out.println("\n> Venta no encontrada.\n");
			Menu.GestionarVentas(); // regresa a menu de gestion
		}

		isOpcionValida = false; // reinicio la variable para opciones

		// bucle que muestra un menu
		do {
			System.out.println("\n----- DATO POR MODIFICAR -----\n");
			System.out.println("> Elija una opción\n");
			System.out.println("Modificar nombre del cliente [A]");
			System.out.print("\nIngrese una opción: ");
			opcion = leer.next(); // valor por teclado

			switch (opcion) {
			case "A": // modificar nombre del cliente
			case "a": {
				System.out.print("Ingrese nuevo nombre: ");
				nuevoNombre = leer.next(); // valor por teclado
				ventaPorModificar.setNombreCliente(nuevoNombre); // setteo el nuevo nombre
				System.out.println(ventaPorModificar.toString());// muestra de nuevo la venta modificada
				System.out.println("\n> Venta modificada.");// mensaje de exito
				salto.Limpiar(5); // limpio pantalla con 5 saltos de linea
				Menu.GestionarVentas(); // muestro menu de gestion
			}
				break;
			default: {
				// mensaje de error
				System.err.println("[Error]: Opción no existente. Vuelva a intentarlo.");
				isOpcionValida = false;
			}
				break;
			}

		} while (isOpcionValida == false); // si la opcion no es valida, sigo con el bucle
	}

	/**
	 * @param importe
	 * @param cantidadPagada
	 * @return Método que retorna el cambio
	 */
	private float RealizarPago(float importe, float cantidadPagada) {
		return cantidadPagada - importe; // retorno el valor del cambio
	}

	/**
	 * toString() Sobreescritura
	 */
	@Override
	public String toString() {
		return super.toString() + "\n\t[Cliente]: " + nombreCliente + detalleVenta.toString();
	}
}
