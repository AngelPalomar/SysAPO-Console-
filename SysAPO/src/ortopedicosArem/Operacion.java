package ortopedicosArem;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author angel
 * Clase padre "Operacion"
 */
public abstract class Operacion {
	protected String nombreEmpleado;
	protected Fecha fechaOperacion;
	protected String tipoDeOperacion;
	
	private Calendar fechaActual;

	/**
	 * Constructor
	 */
	public Operacion() {
		fechaOperacion = new Fecha(); //Inicializo el objeto fecha
		fechaActual = new GregorianCalendar(); //Inicializo el objeto Calendar

		fechaOperacion.setAnio(fechaActual.get(Calendar.YEAR));
		fechaOperacion.setMes(fechaActual.get(Calendar.MONTH) + 1);
		fechaOperacion.setDia(fechaActual.get(Calendar.DAY_OF_MONTH));
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
	public Operacion(String nombreEmpleado, String tipoDeOperacion, int dia, int mes, int anio) {
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
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
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
		return "\n----- INFORMACION DE LA OPERACION -----\n" + "\n\t[Nombre del empleado]: " + nombreEmpleado + "\n\t[Fecha de la operacion]: " + fechaOperacion + "\n\t[Tipo de Operacion]: " + tipoDeOperacion;
	}
}
