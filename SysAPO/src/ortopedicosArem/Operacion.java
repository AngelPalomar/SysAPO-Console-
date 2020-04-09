package ortopedicosArem;

import java.util.Calendar;

/**
 * @author angel
 *
 */
public abstract class Operacion {
	private Empleado nombreEmpleado;
	private Fecha fechaOperacion;
	private String tipoDeOperacion;
	
	private Calendar fechaActual;

	public Operacion() {
		fechaOperacion = new Fecha();
		fechaActual = Calendar.getInstance();

		fechaOperacion.setAnio(fechaActual.get(Calendar.YEAR));
		fechaOperacion.setMes(fechaActual.get(Calendar.MONTH));
		fechaOperacion.setAnio(fechaActual.get(Calendar.DAY_OF_MONTH));
	}

	public Operacion(Empleado nombreEmpleado, DetalleVenta detalleVenta,
			String tipoDeOperacion, int dia, int mes, int anio) {
		this.nombreEmpleado = nombreEmpleado;
		this.tipoDeOperacion = tipoDeOperacion;
		
		fechaOperacion.setDia(dia);
		fechaOperacion.setMes(mes);
		fechaOperacion.setAnio(anio);
	}
	
	public Empleado getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(Empleado nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
	public String getTipoDeOperacion() {
		return tipoDeOperacion;
	}

	public void setTipoDeOperacion(String tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}

	public Fecha getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(int dia, int mes, int anio) {
		fechaOperacion.setDia(dia);
		fechaOperacion.setMes(mes);
		fechaOperacion.setAnio(anio);
	}
	
	

//    public void RealizarCompra() {
//    	
//    }
//    
//    public void Cancelar() {
//    	
//    }
//    
//    public void RealizarPago() {
//    	
//    }
//    
//    public void ConsultarVenta() {
//    	
//    }
}
