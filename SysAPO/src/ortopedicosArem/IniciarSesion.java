package ortopedicosArem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import components.LimpiarPantalla;

/**
 * @author angel
 */

public class IniciarSesion {
	static Menu menu;
	
	static private Scanner leer;
	static private int idUsuario;
	static private String contrasena;
	static private Fecha fecha;
	static private Calendar fechaHoy;
	
	static LimpiarPantalla limpiarPantalla = new LimpiarPantalla();
	
	/**
	 * @param args
	 * Clase principal
	 */
	public static void main(String[] args) {
		fecha = new Fecha();
		fechaHoy = new GregorianCalendar();
		
		fecha.setAnio(fechaHoy.get(Calendar.YEAR));
		fecha.setMes(fechaHoy.get(Calendar.MONTH) + 1);
		fecha.setDia(fechaHoy.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("----- BIENVENIDO A ORTOPÉDICOS AREM -----");
		System.out.println("Hoy es: " + fecha.toString());
		System.out.println("\n[ INICIAR SESIÓN ]\n");
		
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
			contrasena = leer.next();
			
			idCredencialesValidas = true;
			
		} while (idCredencialesValidas == false);
		
		limpiarPantalla.Limpiar(30);
		menu = new Menu(); //Carga menú
	}
}
