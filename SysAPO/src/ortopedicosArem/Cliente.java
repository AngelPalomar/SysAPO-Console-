package ortopedicosArem;

import java.util.ArrayList;

public class Cliente extends Usuario {
	
	public ArrayList<Cliente> clientes;

	public Cliente() {
		super();
	}

	public Cliente(int idUsuario, int tipoUsuario, String nombreUsuario, String apellidoUsuario, String contrasena,
			String correoUsuario, String telefonoUsuario, String calle, String numeroInterior, String numeroExterior,
			String cp, String colonia, String municipio, String estado) {
		
		super(idUsuario, tipoUsuario, nombreUsuario, apellidoUsuario, contrasena, correoUsuario, telefonoUsuario, calle,
				numeroInterior, numeroExterior, cp, colonia, municipio, estado);
		
	}
	
	public void CargaCliente() {
		clientes = new ArrayList<Cliente>();
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("¡Cliente agregado con éxito!");
	}

	public void eliminarCliente() {
		
	}

	public void modificarCliente() {
		
	}

	public void consultarCliente() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
