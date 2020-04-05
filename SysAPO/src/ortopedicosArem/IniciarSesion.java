package ortopedicosArem;

import java.util.Scanner;

import components.LimpiarPantalla;

/**
 * @author angel
 * ALT SHIFT + J para generar javadoc
 */

public class IniciarSesion {

	static private Scanner leer;
	static private int idUsuario;
	static private String contraseña;
	
	static LimpiarPantalla limpiarPantalla = new LimpiarPantalla();

	public static void main(String[] args) {
		System.out.println("----- BIENVENIDO A ORTOPÉDICOS AREM -----");
		System.out.println("[ INICIAR SESIÓN ]\n");

		IniciarSesionMenu();
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
			
			limpiarPantalla.Limpiar(20);
			
		} while (validarSesion == false);
	}

}
