package ortopedicosArem;

import java.util.Scanner;
import components.LimpiarPantalla;

/**
 * @author angel
 */

public class IniciarSesion {
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
		boolean idCredencialesValidas = false;
		
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
			
			idCredencialesValidas = true;
			
		} while (idCredencialesValidas == false);
		
		limpiarPantalla.Limpiar(30);
		menu = new Menu(); //Carga menú
	}
	
	/**
	 * Método para agregar objetos por defecto.
	 */
	public static void CargarDatosPrograma() {
		Datos datos = new Datos();
		
		datos.RegistroEmpleados();
		datos.RegistroClientes();
		datos.RegistroProductos();
		
		System.out.println("\n¡Datos cargados correctamente!\n");
	}
}
