package ortopedicosArem;

import java.util.ArrayList;
import java.util.Calendar;

import interfaces.Impuesto;

/**
 * @author angel
 *
 */
public class DetalleVenta implements Impuesto {
	private int folioVenta;
	private ArrayList<Producto> productosVentaDetalle;
	private ArrayList<Integer> cantidadProductos;
	private float subtotal;
	private float importe;

	public DetalleVenta() {
		
	}

	public DetalleVenta(int folioVenta, ArrayList<Producto> productosVentaDetalle, ArrayList<Integer> cantidadProductos,
			float subtotal, float importe) {

		this.folioVenta = folioVenta;
		this.productosVentaDetalle = productosVentaDetalle;
		this.cantidadProductos = cantidadProductos;
		this.subtotal = subtotal;
		this.importe = importe;
	}

	public int getFolioVenta() {
		return folioVenta;
	}

	public void setFolioVenta(int folioVenta) {
		this.folioVenta = folioVenta;
	}

	public ArrayList<Producto> getProductosVentaDetalle() {
		return productosVentaDetalle;
	}

	public void setProductosVentaDetalle(ArrayList<Producto> productosVentaDetalle) {
		this.productosVentaDetalle = productosVentaDetalle;
	}

	public ArrayList<Integer> getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(ArrayList<Integer> cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "DetalleVenta [folioVenta=" + folioVenta + ", productosVentaDetalle=" + productosVentaDetalle
				+ ", cantidadProductos=" + cantidadProductos + ", subtotal=" + subtotal + ", importe=" + importe + "]";
	}
}
