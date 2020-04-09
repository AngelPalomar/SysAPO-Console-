package ortopedicosArem;

import java.util.ArrayList;

public class Producto {
	private int codigoProducto;
	private String nombreProducto;
	private float precioProducto;
	private float costoProducto;
	private Marca marcaProducto;
	private Clase claseProducto;
	private String modeloProducto;
	private String desbreProducto;
	private String descampProducto;
	private int stockProducto;
	
	public Producto() {
		marcaProducto = new Marca();
		claseProducto = new Clase();
	}
	
	public Producto(int codigoProducto, String nombreProducto, float precioProducto, float costoProducto,
			int idMarca, String nombreMarca, int idClase, String nombreClase, String modeloProducto, String desbreProducto,
			String descampProducto, int stockProducto) {
		
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.costoProducto = costoProducto;
		this.modeloProducto = modeloProducto;
		this.desbreProducto = desbreProducto;
		this.descampProducto = descampProducto;
		this.stockProducto = stockProducto;
		
		marcaProducto.setIdMarca(idMarca);
		marcaProducto.setNombreMarca(nombreMarca);
		claseProducto.setIdClase(idClase);
		claseProducto.setNombreClase(nombreClase);
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}

	public float getCostoProducto() {
		return costoProducto;
	}

	public void setCostoProducto(float costoProducto) {
		this.costoProducto = costoProducto;
	}

	public Marca getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(int idMarca, String nombreMarca) {
		marcaProducto.setIdMarca(idMarca);
		marcaProducto.setNombreMarca(nombreMarca);
	}

	public Clase getClaseProducto() {
		return claseProducto;
	}

	public void setClaseProducto(int idClase, String nombreClase) {
		claseProducto.setIdClase(idClase);
		claseProducto.setNombreClase(nombreClase);
	}

	public String getModeloProducto() {
		return modeloProducto;
	}

	public void setModeloProducto(String modeloProducto) {
		this.modeloProducto = modeloProducto;
	}

	public String getDesbreProducto() {
		return desbreProducto;
	}

	public void setDesbreProducto(String desbreProducto) {
		this.desbreProducto = desbreProducto;
	}

	public String getDescampProducto() {
		return descampProducto;
	}

	public void setDescampProducto(String descampProducto) {
		this.descampProducto = descampProducto;
	}

	public int getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}
	
	public void AltaProducto() {
		
	}

	public void ConsultarProducto() {
		
	}

	public void ModificarProducto() {

	}

	public void EliminarProducto() {
		
	}
	
	@Override
	public String toString() {
		return "> [Código]: " + getCodigoProducto() + " [Nombre del producto]: ".concat(getNombreProducto()) + 
				" [Precio]: $" + getPrecioProducto() + " [Costo]: $" + getCostoProducto() + " [Información]: " + 
				marcaProducto.toString() + claseProducto.toString() + " [Modelo]: " + getModeloProducto() + 
				" [Descripción]: " + getDesbreProducto() + " [Detalles]: " + getDescampProducto();
	}

}
