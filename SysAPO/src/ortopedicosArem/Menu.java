package ortopedicosArem;

import java.util.Scanner;
import components.LimpiarPantalla;

public class Menu {
	private static String opcion;
	@SuppressWarnings("unused")
	private int tipoUsuario;
	private static boolean isOpcionValida = false;
	private static Scanner leer;
	private static LimpiarPantalla salto;
	private static Venta gestionVenta;

	/**
	 * Constructor
	 */
	public Menu() {
		leer = new Scanner(System.in);
		salto = new LimpiarPantalla();

		gestionVenta = new Venta();
		MostrarMenu();
	}

	/**
	 * @param opcion Constructor para mostrar un menú en cuestión
	 */
	public Menu(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Método estático para mostrar el menú.
	 */
	private static void MostrarMenu() {
		System.out.println("----- BIENVENIDO -----");

		do {
			System.out.println("> Elija una opción.\n");
			System.out.println("Gestionar Clientes [A]");
			System.out.println("Gestionar Empleados [B]");
			System.out.println("Gestionar Productos [C]");
			System.out.println("Gestionar Ventas [D]");
			System.out.println("Salir [X]\n");

			System.out.print("Ingrese una opción: ");
			opcion = leer.next();

			switch (opcion) {
			case "A":
			case "a":
				isOpcionValida = true;
				salto.Limpiar(20);
				GestionarClientes();
				break;
			case "B":
			case "b":
				isOpcionValida = true;
				salto.Limpiar(20);
				GestionarEmpleados();
				break;
			case "C":
			case "c":
				isOpcionValida = true;
				salto.Limpiar(20);
				GestionarProductos();
				break;
			case "D":
			case "d":
				isOpcionValida = true;
				salto.Limpiar(20);
				GestionarVentas();
				break;
			case "x":
			case "X":
				isOpcionValida = true;
				salto.Limpiar(20);
				System.out.println("> Ha salido.\n\n");
				IniciarSesion.IniciarSesionMenu();
				break;
			default:
				System.err.println("[Error]: Opción no existente. Vuelva a intentarlo.\n");
				isOpcionValida = false;
				break;
			}
		} while (isOpcionValida == false);
	}

	/**
	 * Opción de gestión de clientes.
	 */
	public static void GestionarClientes() {

	}

	/**
	 * Opción para gestión de empleados
	 */
	public static void GestionarEmpleados() {

	}

	/**
	 * Opción para gestion de productos
	 */
	public static void GestionarProductos() {

	}

	/**
	 * Opción para gestionar ventas.
	 */
	public static void GestionarVentas() {
		isOpcionValida = false;
		opcion = "";
		do {
			System.out.println("----- MENÚ DE VENTAS -----");
			System.out.println("> Elija una opción.\n");
			System.out.println("Nueva venta [A]");
			System.out.println("Eliminar venta [B]");
			System.out.println("Consultar venta [C]");
			System.out.println("Modificar venta [D]");
			System.out.println("Salir al menú principal [X]");

			System.out.print("\nIngrese una opción: ");
			opcion = leer.next();

			// condición para verificar la opción ingresada
			switch (opcion) {
			case "A": // Nueva venta
			case "a": {
				isOpcionValida = true;
				salto.Limpiar(20); // saltos de linea
				gestionVenta.AgregarVenta();
			}
				break;
			case "B": // Eliminar venta
			case "b": {
				isOpcionValida = true;
				salto.Limpiar(20); // saltos de linea
				gestionVenta.EliminarVenta();
			}
				break;
			case "C": // Consultar venta
			case "c": {
				isOpcionValida = true;
				salto.Limpiar(20); // saltos de linea
				gestionVenta.ConsultarVenta();
			}
				break;
			case "D": // Modificar venta
			case "d": {
				isOpcionValida = true;
				salto.Limpiar(20); // saltos de linea
				gestionVenta.ModificarVenta();
			}
				break;
			case "x": // Salir
			case "X": {
				isOpcionValida = true;
				salto.Limpiar(20); // saltos de linea
				MostrarMenu();
			}
				break;
			default: {
				System.err.println("[Error]: Opción no existente. Vuelva a intentarlo.\n");
				isOpcionValida = false;
			}
				break;
			}
		} while (isOpcionValida == false);
	}
}
