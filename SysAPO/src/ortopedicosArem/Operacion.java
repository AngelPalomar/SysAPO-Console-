package ortopedicosArem;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author angel
 * Clase padre "Operacion"
 */
public abstract class Operacion {
	protected ArrayList<Empleado> nombreEmpleado;
	protected Fecha fechaOperacion;
	protected String tipoDeOperacion;
	
	private Calendar fechaActual;

	/**
	 * Constructor
	 */
	public Operacion() {
		fechaOperacion = new Fecha(); //Inicializo el objeto fecha
		fechaActual = Calendar.getInstance(); //Inicializo el objeto Calendar

		fechaOperacion.setAnio(fechaActual.get(Calendar.YEAR));
		fechaOperacion.setMes(fechaActual.get(Calendar.MONTH));
		fechaOperacion.setAnio(fechaActual.get(Calendar.DAY_OF_MONTH));
		/**
		 * asignación de valores de la fecha local por defecto al crear la clase
		 */
	}

	/**
	 * @param nombreEmpleado
	 * @param tipoDeOperacion
	 * @param dia
	 * @param mes
	 * @param anio
	 * Constructor con atributos con composición
	 */
	public Operacion(ArrayList<Empleado> nombreEmpleado, String tipoDeOperacion, int dia, int mes, int anio) {
		this.nombreEmpleado = nombreEmpleado;
		this.tipoDeOperacion = tipoDeOperacion;
		
		fechaOperacion.setDia(dia);
		fechaOperacion.setMes(mes);
		fechaOperacion.setAnio(anio);
	}
	
	//Setters y getters 
	
	/**
	 * @return
	 */
	public ArrayList<Empleado> getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado
	 */
	public void setNombreEmpleado(ArrayList<Empleado> nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
	/**
	 * @return
	 */
	public String getTipoDeOperacion() {
		return tipoDeOperacion;
	}

	/**
	 * @param tipoDeOperacion
	 */
	public void setTipoDeOperacion(String tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}

	/**
	 * @return
	 */
	public Fecha getFechaOperacion() {
		return fechaOperacion;
	}

	/**
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public void setFechaOperacion(int dia, int mes, int anio) {
		fechaOperacion.setDia(dia);
		fechaOperacion.setMes(mes);
		fechaOperacion.setAnio(anio);
	}

	/**
	 * toString()
	 */
	@Override
	public String toString() {
		return "[Nombre del empleado]:" + nombreEmpleado.toString() + " [Fecha de la operacion]:" + fechaOperacion + "[Tipo de Operacion]:" + tipoDeOperacion;
	}
}
