package components;

/**
 * @author angel
 * Clase para limpiar la consola 
 */
public class LimpiarPantalla {
	
	public void Limpiar(int saltosDeLinea) {
		
		for (int i = 0; i < saltosDeLinea; i++) {
			System.out.println();
		}
		
	}
}
