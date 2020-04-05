package ortopedicosArem;

public class DetalleVenta {
	private int folioVenta;
	private Producto nombreProducto;
	private int cantidadProducto;
	private float subtotal;
	private float iva;
	private Fecha fechaCompra;
	private float importe;
	public int getFolioVenta() {
		return folioVenta;
	}
	public void setFolioVenta(int folioVenta) {
		this.folioVenta = folioVenta;
	}
	public Producto getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(Producto nombreProducto) {
		this.nombreProducto = nombreProducto;
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
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public Fecha getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Fecha fechaCompra) {
		this.fechaCompra = fechaCompra;
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
