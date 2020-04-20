package ortopedicosArem;

import java.util.ArrayList;

import interfaces.Impuesto;

/**
 * @author angel Clase para añadir un detalle de venta
 */
public class DetalleVenta implements Impuesto {
	private int folioVenta;
	private ArrayList<Producto> productosVentaDetalle;
	private ArrayList<Integer> cantidadProductos;
	private float subtotal;
	private float importe;

	public Datos datosProductos;

	/**
	 * Constructor principal
	 */
	public DetalleVenta() {
		datosProductos = new Datos();
	}

	/**
	 * @param folioVenta
	 * @param productosVentaDetalle
	 * @param cantidadProductos
	 * @param subtotal
	 * @param importe               Constructor compuesto
	 */
	public DetalleVenta(int folioVenta, ArrayList<Producto> productosVentaDetalle, ArrayList<Integer> cantidadProductos,
			float subtotal, float importe) {

		this.folioVenta = folioVenta;
		this.productosVentaDetalle = productosVentaDetalle;
		this.cantidadProductos = cantidadProductos;
		this.subtotal = subtotal;
		this.importe = importe;
	}

	// Setters y getters
	
	/**
	 * @return
	 */
	public int getFolioVenta() {
		return folioVenta;
	}

	/**
	 * @param folioVenta
	 */
	public void setFolioVenta(int folioVenta) {
		this.folioVenta = folioVenta;
	}

	/**
	 * @return
	 */
	public ArrayList<Producto> getProductosVentaDetalle() {
		return productosVentaDetalle;
	}

	/**
	 * @param productosVentaDetalle
	 */
	public void setProductosVentaDetalle(ArrayList<Producto> productosVentaDetalle) {
		this.productosVentaDetalle = productosVentaDetalle;
	}

	/**
	 * @return
	 */
	public ArrayList<Integer> getCantidadProductos() {
		return cantidadProductos;
	}

	/**
	 * @param cantidadProductos
	 */
	public void setCantidadProductos(ArrayList<Integer> cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	/**
	 * @return
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/*
	 * Sobrecarga de métodos del get del importe
	 */
	/**
	 * @return
	 */
	public float getImporte() {
		return importe;
	}

	// get para calcular el importe total
	/**
	 * @param subtotal
	 * @return
	 */
	public float getImporte(float subtotal) {
		importe = subtotal + (subtotal * iva);
		return importe;
	}

	/**
	 * @param importe
	 */
	public void setImporte(float importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "\n\t[Folio]: " + folioVenta + "\n\t[Productos]: " + productosVentaDetalle.toString()
				+ "\n\t[Subtotal]: " + subtotal + "\n\t[importe]: " + importe;
	}
}
