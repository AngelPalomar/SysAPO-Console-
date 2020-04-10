package ortopedicosArem;

import java.util.ArrayList;

/**
 * @author angel
 * Clase hija "Cliente" de Usuario
 */
public class Cliente extends Usuario {

	/**
	 * Constructor principal
	 */
	public Cliente() {
		super();
	}

	/**
	 * @param idUsuario
	 * @param tipoUsuario
	 * @param nombreUsuario
	 * @param apellidoUsuario
	 * @param contrasena
	 * @param correoUsuario
	 * @param telefonoUsuario
	 * @param calle
	 * @param numeroInterior
	 * @param numeroExterior
	 * @param cp
	 * @param colonia
	 * @param municipio
	 * @param estado
	 * Constructor compuesto
	 */
	public Cliente(int idUsuario, int tipoUsuario, String nombreUsuario, String apellidoUsuario, String contrasena,
			String correoUsuario, String telefonoUsuario, String calle, String numeroInterior, String numeroExterior,
			String cp, String colonia, String municipio, String estado) {
		
		super(idUsuario, tipoUsuario, nombreUsuario, apellidoUsuario, contrasena, correoUsuario, telefonoUsuario, calle,
				numeroInterior, numeroExterior, cp, colonia, municipio, estado);
		
	}
	
	public void agregarCliente() {
		
	}

	public void eliminarCliente() {
		
	}

	public void modificarCliente() {
		
	}

	public void consultarCliente() {
		
	}
}
