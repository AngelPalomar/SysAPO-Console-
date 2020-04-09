package ortopedicosArem;

/**
 * @author angel
 *
 */
public class Venta extends Operacion {
	private Cliente nombreCliente;
	private DetalleVenta detalleVenta;

	public Venta() {
		super();
	}

	public Venta(Empleado nombreEmpleado, DetalleVenta detalleVenta, String tipoDeOperacion, int dia, int mes,
			int anio) {
		super(nombreEmpleado, detalleVenta, tipoDeOperacion, dia, mes, anio);
	}

	public Cliente getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(Cliente nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

}
