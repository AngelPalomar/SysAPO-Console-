package ortopedicosArem;

import java.util.ArrayList;

public class Empleado extends Usuario {
	protected int tipoEmpleado;
	
	public static Empleado empleado;
	public ArrayList<Empleado> empleados;

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
	
	public void CargaEmpleado() {
		empleados = new ArrayList<Empleado>(); //Inicializa el array list de empleados
	}
	
	public void AgregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		System.out.println("¡Empleado agregado con éxito!");
	}

	public void EliminarEmpleado() {

	}

	public void ModificarEmpleado() {

	}

	public void ConsultarEmpleado() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}

	@Override
	public String toString() {
		return super.toString() + " [Tipo de Empleado]: " + tipoEmpleado;
	}

}
