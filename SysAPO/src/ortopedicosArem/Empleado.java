package ortopedicosArem;

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

	/**
	 * @param set tipoEmpleado
	 */
	public void setTipoEmpleado(int tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
	/**
	 * @return get tipoEmpleado
	 */
	public int getTipoEmpleado() {
		return tipoEmpleado;
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
		return super.toString() + " [Tipo de Empleado]: " + tipoEmpleado;
	}

}
