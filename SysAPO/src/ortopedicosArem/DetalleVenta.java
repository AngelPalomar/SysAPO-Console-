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
	private int cantidadProducto;
	private float subtotal;
	private float importe;
	
	public DetalleVenta() {
		
	}
	
	public DetalleVenta(int folioVenta, ArrayList<Producto> productosVentaDetalle, int cantidadProducto, float subtotal,
			float importe) {
		
		this.folioVenta = folioVenta;
		this.productosVentaDetalle = productosVentaDetalle;
		this.cantidadProducto = cantidadProducto;
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

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
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

	public String toString() {
		return "Folio: " + folioVenta;
	}

}
