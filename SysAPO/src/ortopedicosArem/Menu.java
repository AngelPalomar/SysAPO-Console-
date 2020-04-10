package ortopedicosArem;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import components.LimpiarPantalla;

public class Menu {
	private static String opcion;
	private int tipoUsuario;
	public static boolean isOpcionValida = false;
	private static Scanner leer;
	public static LimpiarPantalla salto;
	public static IniciarSesion salir;
	public static Venta ventaSeleccion;

	public Menu() {
		leer = new Scanner(System.in);
		salto = new LimpiarPantalla();
		salir = new IniciarSesion();
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

			if (opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("b") || opcion.equalsIgnoreCase("C")
					|| opcion.equalsIgnoreCase("D") || opcion.equalsIgnoreCase("X")) {
				switch (opcion) {
				case "A":
				case "a":
					salto.Limpiar(20);
					GestionarClientes();
					break;
				case "B":
				case "b":
					salto.Limpiar(20);
					GestionarEmpleados();
					break;
				case "C":
				case "c":
					salto.Limpiar(20);
					GestionarProductos();
					break;
				case "D":
				case "d":
					salto.Limpiar(20);
					GestionarVentas();
					break;
				case "x":
				case "X":
					salto.Limpiar(20);
					System.out.println("> Ha salido.\n\n");
					salir.IniciarSesionMenu();
					break;
				}
				isOpcionValida = true;
				salto.Limpiar(20);
			} else {
				System.err.println("[Error]: Opción no valida. Vuelva a intentarlo.\n");
				isOpcionValida = false;
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
		System.out.println("----- MENÚ DE VENTAS -----");
		do {
			System.out.println("> Elija una opción.\n");
			System.out.println("Nueva venta [A]");
			System.out.println("Eliminar venta [B]");
			System.out.println("Consultar venta [C]");
			System.out.println("Modificar venta [D]");
			System.out.println("Salir al menú principal [X]");
			
			System.out.print("Ingrese una opción: ");
			opcion = leer.next();
			
			//condición para verificar la opción ingresada
			if (opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("b") || opcion.equalsIgnoreCase("C")
					|| opcion.equalsIgnoreCase("D") || opcion.equalsIgnoreCase("X")) {
				switch (opcion) {
				case "A": //Nueva venta
				case "a":
					salto.Limpiar(20);
					break;
				case "B": //Eliminar venta
				case "b":
					salto.Limpiar(20);
					break;
				case "C": //Consultar venta
				case "c":
					salto.Limpiar(20);
					break;
				case "D": // Modificar venta
				case "d":
					salto.Limpiar(20);
					break;
				case "x": //Salir
				case "X":
					salto.Limpiar(20);
					MostrarMenu();
					break;
				}
				isOpcionValida = true;
				salto.Limpiar(20);
			} else {
				System.err.println("[Error]: Opción no valida. Vuelva a intentarlo.\n");
				isOpcionValida = false;
			}
		} while (isOpcionValida == false);
	}
}
