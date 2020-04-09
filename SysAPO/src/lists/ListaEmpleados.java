package lists;

import java.util.ArrayList;

import ortopedicosArem.Empleado;

public class ListaEmpleados {
	
	public ArrayList<Empleado> empleados;
	
	public ListaEmpleados() {
		empleados = new ArrayList<Empleado>();
	}
	
	public void AnadirListaEmpleados(Empleado empleado) {
		empleados.add(empleado);
		System.out.println("¡Empleado agregado con éxito!");
	}
	
	public void MostrarEmpleados() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}
	
}
