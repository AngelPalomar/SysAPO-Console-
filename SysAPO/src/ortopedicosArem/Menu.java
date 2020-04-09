package ortopedicosArem;

import java.util.Scanner;

import components.LimpiarPantalla;

public class Menu {
	private static String opcion;
	private int tipoUsuario;
	private static Scanner leer = new Scanner(System.in);
	public static LimpiarPantalla salto = new LimpiarPantalla();

	public Menu() {
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
		
		boolean isOpcionValida = false;
		
		do {
			System.out.println("----- BIENVENIDO -----");
			System.out.println("> Elija una opción.\n");
			System.out.println("Gestionar Clientes [A]");
			System.out.println("Gestionar Empleados [B]");
			System.out.println("Gestionar Productos [C]");
			System.out.println("Gestionar Ventas [D]");
			System.out.println("Gestionar Rentas [E]");
			System.out.println("Gestionar Compras al proveedor [F]");
			System.out.println("Salir [X]\n");

			System.out.println("Ingrese una opción: ");
			opcion = leer.next();

			if (opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("b") || 
					opcion.equalsIgnoreCase("C") || opcion.equalsIgnoreCase("D") || 
					opcion.equalsIgnoreCase("E") || opcion.equalsIgnoreCase("F") || 
					opcion.equalsIgnoreCase("X")) {
				switch (opcion) {
				case "A":
				case "a":
					GestionarClientes();
					break;
				case "B":
				case "b":
					GestionarEmpleados();
					break;
				case "C":
				case "c":
					GestionarProductos();
					break;
				case "D":
				case "d":
					GestionarVentas();
					break;
				case "E":
				case "e":
					GestionarRentas();
					break;
				case "F":
				case "f":
					GestionarComprasProveedor();
					break;
				case "x":
				case "X":
					IniciarSesion salir = new IniciarSesion();
					salto.Limpiar(20);
					System.out.println("> Ha salido.\n\n");
					salir.IniciarSesionMenu();
					break;
				}
				isOpcionValida = true;
				salto.Limpiar(20);
			} else {
				System.out.println("> Opción no valida. Vuelva a intentarlo.\n");
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

	}

	/**
	 * Opcion para gestionar rentas
	 */
	public static void GestionarRentas() {
		
	}

	/**
	 * Opcion para gestionar compras al proveedor
	 */
	public static void GestionarComprasProveedor() {

	}

}
