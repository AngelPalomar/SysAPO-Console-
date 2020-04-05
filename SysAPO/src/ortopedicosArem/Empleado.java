package ortopedicosArem;

import java.util.ArrayList;

public class Empleado extends Usuario {
	protected int tipoEmpleado;

	public Empleado() {
		super();
		tipoEmpleado = 0;
	}

	public Empleado(int idUsuario, int tipoUsuario, String nombreUsuario, String apellidoUsuario, String contrasena,
			String correoUsuario, String telefonoUsuario, String calle, String numeroInterior, String numeroExterior,
			String cp, String colonia, String municipio, String estado, int tipoEmpleado) {

		super(idUsuario, tipoUsuario, nombreUsuario, apellidoUsuario, contrasena, correoUsuario, telefonoUsuario, calle,
				numeroInterior, numeroExterior, cp, colonia, municipio, estado);

		this.tipoEmpleado = tipoEmpleado;

	}

	public int getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(int tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
	/**
	 * @param empleado
	 * Clase para agregar empleados predeterminados al programa
	 */
	public void CargarEmpleado(Empleado empleado) {
		Empleado empleado1 = new Empleado(1, 2, "Cruz Angel", "Palomar Gaytán", "0000", "angelpg.123@hotmail.com",
				"4427047812", "Calle Ficticia", "404", "2", "76148", "La Falacia", "QRO", "Querétaro", 1);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado);
	}
	
	public void AgregarEmpleado() {

	}

	public void EliminarEmpleado() {

	}

	public void ModificarEmpleado() {

	}

	public void ConsultarEmpleado() {

	}

	@Override
	public String toString() {
		return "Tipo de Empleado: " + tipoEmpleado;
	}

}
