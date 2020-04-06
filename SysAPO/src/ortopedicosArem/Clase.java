package ortopedicosArem;

import java.util.ArrayList;

public class Clase {

	private int idClase;
	private String nombreClase;
	
	public Clase() {
		
	}
	
	public Clase(int idClase, String nombreClase) {
		setIdClase(idClase);
		setNombreClase(nombreClase);
	}
	
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
