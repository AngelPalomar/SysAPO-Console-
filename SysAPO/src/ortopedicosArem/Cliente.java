package ortopedicosArem;

public class Cliente extends Usuario {

	public Cliente() {
		super();
	}

	public Cliente(int idUsuario, int tipoUsuario, String nombreUsuario, String apellidoUsuario, String contrasena,
			String correoUsuario, String telefonoUsuario, String calle, String numeroInterior, String numeroExterior,
			String cp, String colonia, String municipio, String estado) {
		
		super(idUsuario, tipoUsuario, nombreUsuario, apellidoUsuario, contrasena, correoUsuario, telefonoUsuario, calle,
				numeroInterior, numeroExterior, cp, colonia, municipio, estado);
		
	}
	
	private void CargarCliente() {
		
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
