package ortopedicosArem;

import java.util.ArrayList;

/**
 * @author angel
 * Clase hija de Operacion; "Venta"
 */
public class Venta extends Operacion {
	private ArrayList<Cliente> nombreCliente;
	private DetalleVenta detalleVenta;

	/**
	 * Constructor
	 */
	public Venta() {
		super();
		detalleVenta = new DetalleVenta(); //Inicialización del objeto detalle de Venta
	}
	
	/**
	 * @param nombreEmpleado
	 * @param nombreCliente
	 * @param tipoDeOperacion
	 * @param dia
	 * @param mes
	 * @param anio
	 * @param folioVenta
	 * @param productosVentaDetalle
	 * @param cantidadProductos
	 * @param subtotal
	 * @param importe
	 * Constructor con composición
	 */
	
	public Venta(Empleado nombreEmpleado, ArrayList<Cliente> nombreCliente, String tipoDeOperacion, int dia, int mes,
			int anio, int folioVenta, ArrayList<Producto> productosVentaDetalle, ArrayList<Integer> cantidadProductos,
			float subtotal, float importe) {
		
		this.nombreCliente = nombreCliente;
		detalleVenta.setFolioVenta(folioVenta);
		detalleVenta.setProductosVentaDetalle(productosVentaDetalle);
		detalleVenta.setCantidadProductos(cantidadProductos);
		detalleVenta.setSubtotal(subtotal);
		detalleVenta.setImporte(importe);
	}
	
	//Setters y getters
	public ArrayList<Cliente> getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(ArrayList<Cliente> nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(int folioVenta, ArrayList<Producto> productosVentaDetalle, ArrayList<Integer> cantidadProductos,
			float subtotal, float importe) {
		detalleVenta.setFolioVenta(folioVenta);
		detalleVenta.setProductosVentaDetalle(productosVentaDetalle);
		detalleVenta.setCantidadProductos(cantidadProductos);
		detalleVenta.setSubtotal(subtotal);
		detalleVenta.setImporte(importe);
	}
	
	@Override
	public String toString() {
		return super.toString() + " [Cliente]: " + nombreCliente.toString() + detalleVenta.toString();
	}
}
