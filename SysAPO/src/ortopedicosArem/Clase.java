package ortopedicosArem;

import java.util.ArrayList;

/**
 * @author angel
 * Clase de categería para productos
 */
public class Clase {

	private int idClase;
	private String nombreClase;
	
	/**
	 * Constructor principal
	 */
	public Clase() {
		
	}
	
	/**
	 * @param idClase
	 * @param nombreClase
	 * Constructor compuesto
	 */
	public Clase(int idClase, String nombreClase) {
		setIdClase(idClase);
		setNombreClase(nombreClase);
	}
	
	//Setters y Getters
	public int getIdClase() {
		return idClase;
	}
	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	
	public void CrearCategoria() {
		
	}
	
     public void EliminarCategoria() {
		
	}
     
     public void ModificarCategoria() {
 		
 	}
     
     public void ConsultarClase() {
    	 
	}
     
     @Override
    public String toString() {
    	 return " Clase: " + getNombreClase();
    }

}
