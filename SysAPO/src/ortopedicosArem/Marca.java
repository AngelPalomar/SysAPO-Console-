package ortopedicosArem;

/**
 * @author angel
 * Clase de marca para productos.
 */
public class Marca {
	private int idMarca;
	private String nombreMarca;
	
	/**
	 * Constructor principal
	 */
	public Marca() {
		
	}
	
	/**
	 * @param idMarca
	 * @param nombreMarca
	 * Constrcuto compuesto
	 */
	public Marca(int idMarca, String nombreMarca) {
		setIdMarca(idMarca);
		setNombreMarca(nombreMarca);
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public void CrearMarca() {
		
	}

	public void EliminarMarca() {
		
	}

	public void ModificarMarca() {
		
	}

	public void ConsultarMarca() {
		
	}
	
	@Override
	public String toString() {
		return "Marca: " + getNombreMarca();
	}

}
